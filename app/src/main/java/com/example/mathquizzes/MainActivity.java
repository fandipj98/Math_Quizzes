package com.example.mathquizzes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DatabaseHelper(this);
//        insert data ke database
        boolean isInserted = myDb.insertData(1,"1", 0, 1);
        if (isInserted){
            Toast.makeText(MainActivity.this, "Data berhasil diinsert", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this, "Data gagal diinsert", Toast.LENGTH_LONG).show();
        }
    }

    public void play(View view){
        Intent intent = new Intent(this, LevelActivity.class);
        startActivity(intent);
    }
}
