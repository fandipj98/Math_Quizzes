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

//        addData();
    }

    public void addData(){
        myDb = new DatabaseHelper(this);
//      insert data ke database
//      level 1
        boolean isInserted = myDb.insertData(1,"1", 0, 1, "2 + (-3) = ...", 1, 0);
        if (isInserted){
            Toast.makeText(MainActivity.this, "Data berhasil diinsert", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this, "Data gagal diinsert", Toast.LENGTH_LONG).show();
        }
        myDb.insertData(2,"2", 0, 1, "2 + (-3) = ...", 1, 0);
        myDb.insertData(3,"-1", 1, 1, "2 + (-3) = ...", 1, 0);
        myDb.insertData(4,"-2", 0, 1, "2 + (-3) = ...", 1, 0);

        myDb.insertData(5,"-6", 0, 2, "-5 + (-2) = ...", 1, 0);
        myDb.insertData(6,"-7", 1, 2, "-5 + (-2) = ...", 1, 0);
        myDb.insertData(7,"-3", 0, 2, "-5 + (-2) = ...", 1, 0);
        myDb.insertData(8,"-4", 0, 2, "-5 + (-2) = ...", 1, 0);

        myDb.insertData(9,"4", 0, 3, "-7 + 3 + (-1) = ...", 1, 0);
        myDb.insertData(10,"5", 0, 3, "-7 + 3 + (-1) = ...", 1, 0);
        myDb.insertData(11,"-5", 1, 3, "-7 + 3 + (-1) = ...", 1, 0);
        myDb.insertData(12,"-4", 0, 3, "-7 + 3 + (-1) = ...", 1, 0);

//      level 2
        myDb.insertData(13,"10", 0, 4, "3 x 4 = ...", 2, 0);
        myDb.insertData(14,"12", 1, 4, "3 x 4 = ...", 2, 0);
        myDb.insertData(15,"14", 0, 4, "3 x 4 = ...", 2, 0);
        myDb.insertData(16,"16", 0, 4, "3 x 4 = ...", 2, 0);

        myDb.insertData(17,"4", 1, 5, "32 : 8 = ...", 2, 0);
        myDb.insertData(18,"6", 0, 5, "32 : 8 = ...", 2, 0);
        myDb.insertData(19,"8", 0, 5, "32 : 8 = ...", 2, 0);
        myDb.insertData(20,"10", 0, 5, "32 : 8 = ...", 2, 0);

        myDb.insertData(21,"2", 0, 6, "2 x 5 - 6 : 2 = ...", 2, 0);
        myDb.insertData(22,"-1", 0, 6, "2 x 5 - 6 : 2 = ...", 2, 0);
        myDb.insertData(23,"7", 1, 6, "2 x 5 - 6 : 2 = ...", 2, 0);
        myDb.insertData(24,"4", 0, 6, "2 x 5 - 6 : 2 = ...", 2, 0);

//      level 3
        myDb.insertData(25,"25", 0, 7, "1, 3, 6, 10, 15, 21, ...", 3, 0);
        myDb.insertData(26,"26", 0, 7, "1, 3, 6, 10, 15, 21, ...", 3, 0);
        myDb.insertData(27,"28", 1, 7, "1, 3, 6, 10, 15, 21, ...", 3, 0);
        myDb.insertData(28,"32", 0, 7, "1, 3, 6, 10, 15, 21, ...", 3, 0);

        myDb.insertData(29,"140", 0, 8, "4.096, 2.048, 1.024, 512, 256, ...", 3, 0);
        myDb.insertData(30,"143", 0, 8, "4.096, 2.048, 1.024, 512, 256, ...", 3, 0);
        myDb.insertData(31,"132", 0, 8, "4.096, 2.048, 1.024, 512, 256, ...", 3, 0);
        myDb.insertData(32,"128", 1, 8, "4.096, 2.048, 1.024, 512, 256, ...", 3, 0);

        myDb.insertData(33,"14", 0, 9, "50, 40, 31, 23, 16, ...", 3, 0);
        myDb.insertData(34,"12", 0, 9, "50, 40, 31, 23, 16, ...", 3, 0);
        myDb.insertData(35,"10", 1, 9, "50, 40, 31, 23, 16, ...", 3, 0);
        myDb.insertData(36,"8", 0, 9, "50, 40, 31, 23, 16, ...", 3, 0);

//      level 4
        myDb.insertData(37,"35%", 0, 10, "Berapa persenkah 280 dari 700?", 4, 0);
        myDb.insertData(38,"37%", 0, 10, "Berapa persenkah 280 dari 700?", 4, 0);
        myDb.insertData(39,"40%", 1, 10, "Berapa persenkah 280 dari 700?", 4, 0);
        myDb.insertData(40,"42,5%", 0, 10, "Berapa persenkah 280 dari 700?", 4, 0);

        myDb.insertData(41,"41%", 0, 11, "Berapakah 2/3 dari 66%?", 4, 0);
        myDb.insertData(42,"42%", 0, 11, "Berapakah 2/3 dari 66%?", 4, 0);
        myDb.insertData(43,"43%", 0, 11, "Berapakah 2/3 dari 66%?", 4, 0);
        myDb.insertData(44,"44%", 1, 11, "Berapakah 2/3 dari 66%?", 4, 0);

        myDb.insertData(45,"17,25", 0, 12, "18,5 + 34% = ...", 4, 0);
        myDb.insertData(46,"18,34", 0, 12, "18,5 + 34% = ...", 4, 0);
        myDb.insertData(47,"18,84", 1, 12, "18,5 + 34% = ...", 4, 0);
        myDb.insertData(48,"19,20", 0, 12, "18,5 + 34% = ...", 4, 0);

//      level 5
        myDb.insertData(49,"13", 0, 13, "Akar kuadrat dari 529 = ...", 5, 0);
        myDb.insertData(50,"23", 1, 13, "Akar kuadrat dari 529 = ...", 5, 0);
        myDb.insertData(51,"27", 0, 13, "Akar kuadrat dari 529 = ...", 5, 0);
        myDb.insertData(52,"33", 0, 13, "Akar kuadrat dari 529 = ...", 5, 0);

        myDb.insertData(53,"13", 0, 14, "Akar kubik dari 4.913 = ...", 5, 0);
        myDb.insertData(54,"15", 0, 14, "Akar kubik dari 4.913 = ...", 5, 0);
        myDb.insertData(55,"17", 1, 14, "Akar kubik dari 4.913 = ...", 5, 0);
        myDb.insertData(56,"19", 0, 14, "Akar kubik dari 4.913 = ...", 5, 0);

        myDb.insertData(57,"24", 0, 15, "Akar kubik dari 39.304 = ...", 5, 0);
        myDb.insertData(58,"28", 0, 15, "Akar kubik dari 39.304 = ...", 5, 0);
        myDb.insertData(59,"32", 0, 15, "Akar kubik dari 39.304 = ...", 5, 0);
        myDb.insertData(60,"34", 1, 15, "Akar kubik dari 39.304 = ...", 5, 0);

    }

    public void play(View view){
        Intent intent = new Intent(this, LevelActivity.class);
        startActivity(intent);
    }

    public void highscore(View view){
        Intent intent = new Intent(this, HighscoreActivity.class);
        startActivity(intent);
    }
}
