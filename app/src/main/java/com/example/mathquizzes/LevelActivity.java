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
        intent.putExtra("kodeLevel", "1");
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
        intent.putExtra("kodeLevel", "2");
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
        intent.putExtra("kodeLevel", "3");
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
        intent.putExtra("kodeLevel", "4");
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
        intent.putExtra("kodeLevel", "5");
        startActivity(intent);
    }

    public void playLevel6(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "6");
        startActivity(intent);
    }

    public void playLevel7(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "7");
        startActivity(intent);
    }

    public void playLevel8(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "8");
        startActivity(intent);
    }

    public void playLevel9(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "9");
        startActivity(intent);
    }

    public void playLevel10(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "10");
        startActivity(intent);
    }

    public void playLevel11(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "11");
        startActivity(intent);
    }

    public void playLevel12(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "12");
        startActivity(intent);
    }

    public void playLevel13(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "13");
        startActivity(intent);
    }

    public void playLevel14(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "14");
        startActivity(intent);
    }

    public void playLevel15(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "15");
        startActivity(intent);
    }

    public void playLevel16(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "16");
        startActivity(intent);
    }

    public void playLevel17(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "17");
        startActivity(intent);
    }

    public void playLevel18(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "18");
        startActivity(intent);
    }

    public void playLevel19(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "19");
        startActivity(intent);
    }

    public void playLevel20(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "20");
        startActivity(intent);
    }

    public void playLevel21(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "21");
        startActivity(intent);
    }

    public void playLevel22(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "22");
        startActivity(intent);
    }

    public void playLevel23(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "23");
        startActivity(intent);
    }

    public void playLevel24(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "24");
        startActivity(intent);
    }

    public void playLevel25(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "25");
        startActivity(intent);
    }

    public void playLevel26(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "26");
        startActivity(intent);
    }

    public void playLevel27(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "27");
        startActivity(intent);
    }

    public void playLevel28(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "28");
        startActivity(intent);
    }

    public void playLevel29(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "29");
        startActivity(intent);
    }

    public void playLevel30(View view){
//        untuk mendapatkan text dari button
        Button levelButton = (Button)view;
        String levelText = levelButton.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);
//        untuk passing argumen dengan mendefine keynya
        intent.putExtra("level", levelText);
        intent.putExtra("kodeLevel", "30");
        startActivity(intent);
    }
}