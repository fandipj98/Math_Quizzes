package com.example.mathquizzes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HighscoreActivity extends AppCompatActivity {

    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);

        showHighscore();
    }

    public void mainMenu(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        HighscoreActivity.this.finish();
    }

    public void showHighscore(){
        myDb = new DatabaseHelper(this);

        Cursor cursor = myDb.getAllData(1);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl1 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl1);
            scoreView.setText(String.valueOf(score_lvl1));
        }

        cursor = myDb.getAllData(2);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl2 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl2);
            scoreView.setText(String.valueOf(score_lvl2));
        }

        cursor = myDb.getAllData(3);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl3 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl3);
            scoreView.setText(String.valueOf(score_lvl3));
        }

        cursor = myDb.getAllData(4);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl4 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl4);
            scoreView.setText(String.valueOf(score_lvl4));
        }

        cursor = myDb.getAllData(5);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl5 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl5);
            scoreView.setText(String.valueOf(score_lvl5));
        }
    }
}
