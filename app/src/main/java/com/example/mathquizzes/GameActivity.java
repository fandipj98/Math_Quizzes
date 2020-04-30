package com.example.mathquizzes;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        String level = getIntent().getStringExtra("level");
        TextView levelText = findViewById(R.id.text_level);
        levelText.setText(level);

        viewAll();
    }

    public void viewAll(){
        Cursor res = myDb.getAllData();
        if(res.getCount() == 0){
//            show errror message
            showMessage("Error", "No data found");
            return;
        }
        StringBuffer buffer = new StringBuffer();
        while(res.moveToNext()){
            buffer.append("id_jawaban :" + res.getString(0) + "\n");
            buffer.append("deskripsi_jawaban :" + res.getString(1) + "\n");
            buffer.append("kebenaran_jawaban :" + res.getString(2) + "\n");
            buffer.append("id_soal :" + res.getString(3) + "\n\n");
        }
//        show all data
        showMessage("Data", buffer.toString());
    }

    public void showMessage(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
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
