package com.example.mathquizzes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class EndActivity extends AppCompatActivity {

    DatabaseHelper myDb;
    private TextView score;
    String level;
    int kodeLevel;
    String score_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        level = getIntent().getStringExtra("level");
        TextView levelText = findViewById(R.id.text_level);
        levelText.setText(level);

        kodeLevel = Integer.parseInt(getIntent().getStringExtra("kodeLevel"));

        score = findViewById(R.id.text_score);
        score_value = getIntent().getStringExtra("score");
        score.setText(score_value);

        checkHighscore();
    }

    public void listLevel(View view){
        Intent intent = new Intent(this, LevelActivity.class);
        startActivity(intent);
        EndActivity.this.finish();
    }

    public void retry(View view) {
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", level);
        intent.putExtra("kodeLevel", String.valueOf(kodeLevel));
        startActivity(intent);
    }

    public void checkHighscore(){
        int highscore = 0;
        myDb = new DatabaseHelper(this);
        Cursor cursor = myDb.getAllData(kodeLevel);
        if(cursor.getCount() == 0){
            Toast.makeText(EndActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            highscore = Integer.parseInt(cursor.getString(6));
//            Toast.makeText(EndActivity.this, "highscore: " + highscore, Toast.LENGTH_LONG).show();

            if(Integer.parseInt(score_value) > highscore){
//                melakukan update highscore
                myDb.updateHighscore(kodeLevel, Integer.parseInt(score_value));
            }
        }
    }
}
