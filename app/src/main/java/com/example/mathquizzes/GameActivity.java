package com.example.mathquizzes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        String level = getIntent().getStringExtra("level");
        TextView levelText = findViewById(R.id.text_level);
        levelText.setText(level);
    }

    public void mainMenu(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void clickAnswer1(View view){

    }

    public void clickAnswer2(View view){

    }

    public void clickAnswer3(View view){

    }

    public void clickAnswer4(View view){

    }

}
