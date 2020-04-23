package com.example.mathquizzes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
    }

    public void mainMenu(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void playLevel1(View view) {
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
//        untuk print log ke console
//        Log.d("COBA1" , levelText);
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        startActivity(intent);
    }

    public void playLevel2(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
//        Log.d("COBA2" , levelText);
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        startActivity(intent);
    }

    public void playLevel3(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
//        Log.d("COBA3" , levelText);
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        startActivity(intent);
    }

    public void playLevel4(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
//        Log.d("COBA4" , levelText);
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        startActivity(intent);
    }

    public void playLevel5(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
//        Log.d("COBA5" , levelText);
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        startActivity(intent);
    }
}