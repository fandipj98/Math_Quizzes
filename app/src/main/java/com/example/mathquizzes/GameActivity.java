package com.example.mathquizzes;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GameActivity extends AppCompatActivity implements View.OnClickListener{

    DatabaseHelper myDb;
    private TextView question, qCount, timer;
    private Button option1, option2, option3, option4;
    private List<Question> questionList;
    private int quesNum;
    private CountDownTimer countDown;
    private List<Game> gameList;
    private int score;
    int kodeLevel;
    int flag;
    String level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // koneksikan dengan xml
        level = getIntent().getStringExtra("level");
        TextView levelText = findViewById(R.id.text_level);
        levelText.setText(level);

        kodeLevel = Integer.parseInt(getIntent().getStringExtra("kodeLevel"));

//        kodeLevel = getIntent().getIntExtra("kodeLevel", 0);
//        Toast.makeText(GameActivity.this, "coba: " + kodeLevel, Toast.LENGTH_LONG).show();

        question = findViewById(R.id.text_question);
        qCount = findViewById(R.id.text_num);
        timer = findViewById(R.id.timer);

        option1 = findViewById(R.id.button_answer1);
        option2 = findViewById(R.id.button_answer2);
        option3 = findViewById(R.id.button_answer3);
        option4 = findViewById(R.id.button_answer4);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        flag = 0;
        score = 0;
        init();

    }

    @Override
    public void onBackPressed(){
        countDown.cancel();
        GameActivity.this.finish();
    }

    public void listLevel(View view){
        countDown.cancel();
        Intent intent = new Intent(this, LevelActivity.class);
        startActivity(intent);
        GameActivity.this.finish();
    }

    public void init(){
        gameList = new ArrayList<>();

        myDb = new DatabaseHelper(this);
        Cursor cursor = myDb.getAllData(kodeLevel);
        if(cursor.getCount() == 0){
            Toast.makeText(GameActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            while(cursor.moveToNext()){
                Game temp = new Game(Integer.parseInt(cursor.getString(0)), cursor.getString(1),
                        Integer.parseInt(cursor.getString(2)), Integer.parseInt(cursor.getString(3)),
                        cursor.getString(4), Integer.parseInt(cursor.getString(5)),
                        Integer.parseInt(cursor.getString(6)));
                gameList.add(temp);
            }
            getQuestionsList();
        }
    }

    public void getQuestionsList(){
        questionList = new ArrayList<>();

        String pertanyaan = "";
        String pilihan1 = "";
        String pilihan2 = "";
        String pilihan3 = "";
        String pilihan4 = "";
        int correctAns = 0;
        for(int i=0; i<gameList.size(); i++){

            if(gameList.get(i).getKebenaran_jawaban() == 1){
                correctAns = i%4 + 1;
            }

            if(i%4 == 0){
                pertanyaan = gameList.get(i).getDeskripsi_soal();
                pilihan1 = gameList.get(i).getDeskripsi_jawaban();
            }
            else if(i%4 == 1){
                pilihan2 = gameList.get(i).getDeskripsi_jawaban();
            }
            else if(i%4 == 2){
                pilihan3 = gameList.get(i).getDeskripsi_jawaban();
            }
            else if(i%4 == 3){
                pilihan4 = gameList.get(i).getDeskripsi_jawaban();
                questionList.add(new Question(pertanyaan, pilihan1, pilihan2, pilihan3, pilihan4, correctAns));
//                Toast.makeText(GameActivity.this, "pilihan1: " + pilihan1, Toast.LENGTH_LONG).show();
//                Toast.makeText(GameActivity.this, "correct: " + correctAns, Toast.LENGTH_LONG).show();

            }
        }

        setQuestion();
    }

    public void setQuestion() {
        timer.setText(String.valueOf(10));

        question.setText(questionList.get(0).getQuestion());
        option1.setText(questionList.get(0).getOption1());
        option2.setText(questionList.get(0).getOption2());
        option3.setText(questionList.get(0).getOption3());
        option4.setText(questionList.get(0).getOption4());

        qCount.setText(String.valueOf(1) + "/" + String.valueOf(questionList.size()));

        startTimer();

        quesNum = 0;
    }

    public void startTimer(){
        int miliseconds = 12000;
//        jika membuka soal pertama
        if (flag == 0){
            miliseconds = 11000;
            flag = 1;
        }
        countDown = new CountDownTimer(miliseconds, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(millisUntilFinished < 10000) {
                    timer.setText(String.valueOf(millisUntilFinished / 1000));
                }
            }

            @Override
            public void onFinish() {
                changeQuestion();
            }
        };

        countDown.start();
    }

    @Override
    public void onClick(View v) {
        int selectedOption = 0;
        switch (v.getId()){
            case R.id.button_answer1:
                selectedOption = 1;
                break;
            case R.id.button_answer2:
                selectedOption = 2;
                break;
            case R.id.button_answer3:
                selectedOption = 3;
                break;
            case R.id.button_answer4:
                selectedOption = 4;
                break;
            default:
        }
        countDown.cancel();
        checkAnswer(selectedOption, v);
    }

    public void checkAnswer(int selectedOption, View view){
        if(selectedOption == questionList.get(quesNum).getCorrectAns()){
            //Right Answer

            ((Button)view).setBackgroundResource(R.drawable.correct_button);
            score++;
            TextView scoreText = findViewById(R.id.text_score);
            scoreText.setText(String.valueOf(score));
        }
        else{
            //Wrong Answer
            ((Button)view).setBackgroundResource(R.drawable.wrong_button);

            switch (questionList.get(quesNum).getCorrectAns()){
                case 1:
                    option1.setBackgroundResource(R.drawable.correct_button);
                    break;
                case 2:
                    option2.setBackgroundResource(R.drawable.correct_button);
                    break;
                case 3:
                    option3.setBackgroundResource(R.drawable.correct_button);
                    break;
                case 4:
                    option4.setBackgroundResource(R.drawable.correct_button);
                    break;
            }

        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
//                Setelah 2 detik maka akan pindah pertanyaan
                changeQuestion();
            }
        }, 2000);

    }

    public void changeQuestion(){
        if(quesNum < questionList.size() - 1){
            quesNum++;
            playAnime(question, 0, 0);
            playAnime(option1, 0, 1);
            playAnime(option2, 0, 2);
            playAnime(option3, 0, 3);
            playAnime(option4, 0, 4);

            qCount.setText(String.valueOf(quesNum+1) + "/" + String.valueOf(questionList.size()));

            timer.setText(String.valueOf(10));
            startTimer();
        }
        else{
            // Last question, jadi ke EndActivity
            Intent intent = new Intent(GameActivity.this, EndActivity.class);
            intent.putExtra("level", level);
            intent.putExtra("kodeLevel", String.valueOf(kodeLevel));
            intent.putExtra("score", String.valueOf(score));
            startActivity(intent);
            GameActivity.this.finish();
        }
    }

    public void playAnime(final View view, final int value, final int viewNum){
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500)
                .setStartDelay(100).setInterpolator(new DecelerateInterpolator())
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        if(value == 0){
//                          Beri value dari list ke view
                            switch (viewNum){
                                case 0:
                                    ((TextView)view).setText(questionList.get(quesNum).getQuestion());
                                    break;
                                case 1:
                                    ((Button)view).setText(questionList.get(quesNum).getOption1());
                                    break;
                                case 2:
                                    ((Button)view).setText(questionList.get(quesNum).getOption2());
                                    break;
                                case 3:
                                    ((Button)view).setText(questionList.get(quesNum).getOption3());
                                    break;
                                case 4:
                                    ((Button)view).setText(questionList.get(quesNum).getOption4());
                                    break;
                            }

                            if(viewNum != 0)
                                ((Button)view).setBackgroundResource(R.drawable.answer_button);

                            playAnime(view, 1, viewNum);
                        }
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
    }

}
