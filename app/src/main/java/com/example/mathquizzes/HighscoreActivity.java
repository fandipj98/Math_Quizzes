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

        cursor = myDb.getAllData(6);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl6 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl6);
            scoreView.setText(String.valueOf(score_lvl6));
        }

        cursor = myDb.getAllData(7);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl7 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl7);
            scoreView.setText(String.valueOf(score_lvl7));
        }

        cursor = myDb.getAllData(8);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl8 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl8);
            scoreView.setText(String.valueOf(score_lvl8));
        }

        cursor = myDb.getAllData(9);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl9 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl9);
            scoreView.setText(String.valueOf(score_lvl9));
        }

        cursor = myDb.getAllData(10);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl10 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl10);
            scoreView.setText(String.valueOf(score_lvl10));
        }

        cursor = myDb.getAllData(11);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl11 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl11);
            scoreView.setText(String.valueOf(score_lvl11));
        }

        cursor = myDb.getAllData(12);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl12 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl12);
            scoreView.setText(String.valueOf(score_lvl12));
        }

        cursor = myDb.getAllData(13);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl13 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl13);
            scoreView.setText(String.valueOf(score_lvl13));
        }

        cursor = myDb.getAllData(14);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl14 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl14);
            scoreView.setText(String.valueOf(score_lvl14));
        }

        cursor = myDb.getAllData(15);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl15 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl15);
            scoreView.setText(String.valueOf(score_lvl15));
        }

        cursor = myDb.getAllData(16);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl16 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl16);
            scoreView.setText(String.valueOf(score_lvl16));
        }

        cursor = myDb.getAllData(17);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl17 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl17);
            scoreView.setText(String.valueOf(score_lvl17));
        }

        cursor = myDb.getAllData(18);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl18 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl18);
            scoreView.setText(String.valueOf(score_lvl18));
        }

        cursor = myDb.getAllData(19);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl19 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl19);
            scoreView.setText(String.valueOf(score_lvl19));
        }

        cursor = myDb.getAllData(20);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl20 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl20);
            scoreView.setText(String.valueOf(score_lvl20));
        }

        cursor = myDb.getAllData(21);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl21 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl21);
            scoreView.setText(String.valueOf(score_lvl21));
        }

        cursor = myDb.getAllData(22);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl22 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl22);
            scoreView.setText(String.valueOf(score_lvl22));
        }

        cursor = myDb.getAllData(23);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl23 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl23);
            scoreView.setText(String.valueOf(score_lvl23));
        }

        cursor = myDb.getAllData(24);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl24 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl24);
            scoreView.setText(String.valueOf(score_lvl24));
        }

        cursor = myDb.getAllData(25);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl25 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl25);
            scoreView.setText(String.valueOf(score_lvl25));
        }

        cursor = myDb.getAllData(26);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl26 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl26);
            scoreView.setText(String.valueOf(score_lvl26));
        }

        cursor = myDb.getAllData(27);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl27 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl27);
            scoreView.setText(String.valueOf(score_lvl27));
        }

        cursor = myDb.getAllData(28);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl28 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl28);
            scoreView.setText(String.valueOf(score_lvl28));
        }

        cursor = myDb.getAllData(29);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl29 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl29);
            scoreView.setText(String.valueOf(score_lvl29));
        }

        cursor = myDb.getAllData(30);
        if(cursor.getCount() == 0){
            Toast.makeText(HighscoreActivity.this, "Data gagal diread", Toast.LENGTH_LONG).show();
        }
        else {
            cursor.moveToFirst();
            int score_lvl30 = Integer.parseInt(cursor.getString(6));
            TextView scoreView = findViewById(R.id.score_lvl30);
            scoreView.setText(String.valueOf(score_lvl30));
        }
    }
}
