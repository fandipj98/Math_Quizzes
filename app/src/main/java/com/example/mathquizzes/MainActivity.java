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

        addData();
    }

    public void addData(){
        myDb = new DatabaseHelper(this);
//      insert data ke database
//      level 1
//        boolean isInserted = myDb.insertData(1,"1", 0, 1, "2 + (-3) = ...", 1, 0);
//        if (isInserted){
//            Toast.makeText(MainActivity.this, "Data berhasil diinsert", Toast.LENGTH_LONG).show();
//        }
//        else{
//            Toast.makeText(MainActivity.this, "Data gagal diinsert", Toast.LENGTH_LONG).show();
//        }
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

//        level 6
        myDb.insertData(61,"2", 0, 16, "2 + 6 : 3 = ...", 6, 0);
        myDb.insertData(62,"4", 1, 16, "2 + 6 : 3 = ...", 6, 0);
        myDb.insertData(63,"6", 0, 16, "2 + 6 : 3 = ...", 6, 0);
        myDb.insertData(64,"8", 0, 16, "2 + 6 : 3 = ...", 6, 0);

//        level 7
        myDb.insertData(65,"-1", 1, 17, "3 - 2 x 2 = ...", 7, 0);
        myDb.insertData(66,"0", 0, 17, "3 - 2 x 2 = ...", 7, 0);
        myDb.insertData(67,"1", 0, 17, "3 - 2 x 2 = ...", 7, 0);
        myDb.insertData(68,"2", 0, 17, "3 - 2 x 2 = ...", 7, 0);

//        level 8
        myDb.insertData(69,"2", 0, 18, "4 + 4 : 2 + 2 = ...", 8, 0);
        myDb.insertData(70,"4", 0, 18, "4 + 4 : 2 + 2 = ...", 8, 0);
        myDb.insertData(71,"6", 0, 18, "4 + 4 : 2 + 2 = ...", 8, 0);
        myDb.insertData(72,"8", 1, 18, "4 + 4 : 2 + 2 = ...", 8, 0);

//        level 9
        myDb.insertData(73,"8", 0, 19, "2 x 4 + 6 : 3 = ...", 9, 0);
        myDb.insertData(74,"10", 1, 19, "2 x 4 + 6 : 3 = ...", 9, 0);
        myDb.insertData(75,"12", 0, 19, "2 x 4 + 6 : 3 = ...", 9, 0);
        myDb.insertData(76,"14", 0, 19, "2 x 4 + 6 : 3 = ...", 9, 0);

//        level 10
        myDb.insertData(77,"2,5", 1, 20, "2 + 50% = ...", 10, 0);
        myDb.insertData(78,"3,5", 0, 20, "2 + 50% = ...", 10, 0);
        myDb.insertData(79,"4,5", 0, 20, "2 + 50% = ...", 10, 0);
        myDb.insertData(80,"5,5", 0, 20, "2 + 50% = ...", 10, 0);

//        level 11
        myDb.insertData(81,"2,25", 0, 21, "3 + 25% = ...", 11, 0);
        myDb.insertData(82,"2,5", 0, 21, "3 + 25% = ...", 11, 0);
        myDb.insertData(83,"3,25", 1, 21, "3 + 25% = ...", 11, 0);
        myDb.insertData(84,"3,5", 0, 21, "3 + 25% = ...", 11, 0);

//        level 12
        myDb.insertData(85,"5,25", 0, 22, "5 + 75% = ...", 12, 0);
        myDb.insertData(86,"5,5", 0, 22, "5 + 75% = ...", 12, 0);
        myDb.insertData(87,"5,75", 1, 22, "5 + 75% = ...", 12, 0);
        myDb.insertData(88,"5,85", 0, 22, "5 + 75% = ...", 12, 0);

//        level 13
        myDb.insertData(89,"5,55", 0, 23, "6 - 25% = ...", 13, 0);
        myDb.insertData(90,"5,75", 1, 23, "6 - 25% = ...", 13, 0);
        myDb.insertData(91,"5,85", 0, 23, "6 - 25% = ...", 13, 0);
        myDb.insertData(92,"5,95", 0, 23, "6 - 25% = ...", 13, 0);

//        level 14
        myDb.insertData(93,"1", 0, 24, "2 x 50% + 2 = ...", 14, 0);
        myDb.insertData(94,"2", 0, 24, "2 x 50% + 2 = ...", 14, 0);
        myDb.insertData(95,"3", 1, 24, "2 x 50% + 2 = ...", 14, 0);
        myDb.insertData(96,"4", 0, 24, "2 x 50% + 2 = ...", 14, 0);

//        level 15
        myDb.insertData(97,"0,5", 1, 25, "5 x 50% - 2 = ...", 15, 0);
        myDb.insertData(98,"1,5", 0, 25, "5 x 50% - 2 = ...", 15, 0);
        myDb.insertData(99,"2,5", 0, 25, "5 x 50% - 2 = ...", 15, 0);
        myDb.insertData(100,"3,5", 0, 25, "5 x 50% - 2 = ...", 15, 0);

//        level 16
        myDb.insertData(101,"0,3", 1, 26, "3 x 50% : 5 = ...", 16, 0);
        myDb.insertData(102,"0,4", 0, 26, "3 x 50% : 5 = ...", 16, 0);
        myDb.insertData(103,"0,5", 0, 26, "3 x 50% : 5 = ...", 16, 0);
        myDb.insertData(104,"0,6", 0, 26, "3 x 50% : 5 = ...", 16, 0);

//        level 17
        myDb.insertData(105,"2", 0, 27, "2 + 4 x 50% : 2 = ...", 17, 0);
        myDb.insertData(106,"3", 1, 27, "2 + 4 x 50% : 2 = ...", 17, 0);
        myDb.insertData(107,"4", 0, 27, "2 + 4 x 50% : 2 = ...", 17, 0);
        myDb.insertData(108,"5", 0, 27, "2 + 4 x 50% : 2 = ...", 17, 0);

//        level 18
        myDb.insertData(109,"-1", 0, 28, "-2 + 4 x 25% + 1 = ...", 18, 0);
        myDb.insertData(110,"0", 1, 28, "-2 + 4 x 25% + 1 = ...", 18, 0);
        myDb.insertData(111,"1", 0, 28, "-2 + 4 x 25% + 1 = ...", 18, 0);
        myDb.insertData(112,"2", 0, 28, "-2 + 4 x 25% + 1 = ...", 18, 0);

//        level 19
        myDb.insertData(113,"-1", 1, 29, "-2 + 8 x 25% : 2 = ...", 19, 0);
        myDb.insertData(114,"0", 0, 29, "-2 + 8 x 25% : 2 = ...", 19, 0);
        myDb.insertData(115,"1", 0, 29, "-2 + 8 x 25% : 2 = ...", 19, 0);
        myDb.insertData(116,"2", 0, 29, "-2 + 8 x 25% : 2 = ...", 19, 0);

//        level 20
        myDb.insertData(117,"-1", 1, 30, "2 - 8 x 75% : 2 = ...", 20, 0);
        myDb.insertData(118,"0", 0, 30, "2 - 8 x 75% : 2 = ...", 20, 0);
        myDb.insertData(119,"1", 0, 30, "2 - 8 x 75% : 2 = ...", 20, 0);
        myDb.insertData(120,"2", 0, 30, "2 - 8 x 75% : 2 = ...", 20, 0);

//        level 21
        myDb.insertData(121,"3", 0, 31, "2 + akar kuadrat dari 4 = ...", 21, 0);
        myDb.insertData(122,"4", 1, 31, "2 + akar kuadrat dari 4 = ...", 21, 0);
        myDb.insertData(123,"5", 0, 31, "2 + akar kuadrat dari 4 = ...", 21, 0);
        myDb.insertData(124,"6", 0, 31, "2 + akar kuadrat dari 4 = ...", 21, 0);

//        level 22
        myDb.insertData(125,"2", 0, 32, "7 - akar kuadrat dari 16 = ...", 22, 0);
        myDb.insertData(126,"3", 1, 32, "7 - akar kuadrat dari 16 = ...", 22, 0);
        myDb.insertData(127,"4", 0, 32, "7 - akar kuadrat dari 16 = ...", 22, 0);
        myDb.insertData(128,"5", 0, 32, "7 - akar kuadrat dari 16 = ...", 22, 0);

//        level 23
        myDb.insertData(129,"5", 0, 33, "3 x akar kuadrat dari 25 = ...", 23, 0);
        myDb.insertData(130,"10", 0, 33, "3 x akar kuadrat dari 25 = ...", 23, 0);
        myDb.insertData(131,"15", 1, 33, "3 x akar kuadrat dari 25 = ...", 23, 0);
        myDb.insertData(132,"20", 0, 33, "3 x akar kuadrat dari 25 = ...", 23, 0);

//        level 24
        myDb.insertData(133,"0,25", 1, 34, "2 : akar kuadrat dari 64 = ...", 24, 0);
        myDb.insertData(134,"0,5", 0, 34, "2 : akar kuadrat dari 64 = ...", 24, 0);
        myDb.insertData(135,"0,75", 0, 34, "2 : akar kuadrat dari 64 = ...", 24, 0);
        myDb.insertData(136,"1", 0, 34, "2 : akar kuadrat dari 64 = ...", 24, 0);

//        level 25
        myDb.insertData(137,"2,2", 0, 35, "2 + 3 : akar kubik dari 125 = ...", 25, 0);
        myDb.insertData(138,"2,4", 0, 35, "2 + 3 : akar kubik dari 125 = ...", 25, 0);
        myDb.insertData(139,"2,6", 1, 35, "2 + 3 : akar kubik dari 125 = ...", 25, 0);
        myDb.insertData(140,"2,8", 0, 35, "2 + 3 : akar kubik dari 125 = ...", 25, 0);

//        level 26
        myDb.insertData(141,"-2", 0, 36, "10 - 2 x akar kubik dari 512 = ...", 26, 0);
        myDb.insertData(142,"-4", 0, 36, "10 - 2 x akar kubik dari 512 = ...", 26, 0);
        myDb.insertData(143,"-6", 1, 36, "10 - 2 x akar kubik dari 512 = ...", 26, 0);
        myDb.insertData(144,"-8", 0, 36, "10 - 2 x akar kubik dari 512 = ...", 26, 0);

//        level 27
        myDb.insertData(145,"-2", 0, 37, "20 - 2 x akar kubik dari 2.197 = ...", 27, 0);
        myDb.insertData(146,"-4", 0, 37, "20 - 2 x akar kubik dari 2.197 = ...", 27, 0);
        myDb.insertData(147,"-6", 1, 37, "20 - 2 x akar kubik dari 2.197 = ...", 27, 0);
        myDb.insertData(148,"-8", 0, 37, "20 - 2 x akar kubik dari 2.197 = ...", 27, 0);

//        level 28
        myDb.insertData(149,"-2", 0, 38, "2 - akar kubik dari 1.728 : 6 = ...", 28, 0);
        myDb.insertData(150,"-1", 0, 38, "2 - akar kubik dari 1.728 : 6 = ...", 28, 0);
        myDb.insertData(151,"0", 1, 38, "2 - akar kubik dari 1.728 : 6 = ...", 28, 0);
        myDb.insertData(152,"1", 0, 38, "2 - akar kubik dari 1.728 : 6 = ...", 28, 0);

//        level 29
        myDb.insertData(153,"-2", 0, 39, "5 - akar kuadrat dari 484 : 2 = ...", 29, 0);
        myDb.insertData(154,"-4", 0, 39, "5 - akar kuadrat dari 484 : 2 = ...", 29, 0);
        myDb.insertData(155,"-6", 1, 39, "5 - akar kuadrat dari 484 : 2 = ...", 29, 0);
        myDb.insertData(156,"-8", 0, 39, "5 - akar kuadrat dari 484 : 2 = ...", 29, 0);

//        level 30
        myDb.insertData(157,"-10", 0, 40, "8 x 3 - akar kuadrat dari 729 : 2 = ...", 30, 0);
        myDb.insertData(158,"-20", 0, 40, "8 x 3 - akar kuadrat dari 729 : 2 = ...", 30, 0);
        myDb.insertData(159,"-30", 1, 40, "8 x 3 - akar kuadrat dari 729 : 2 = ...", 30, 0);
        myDb.insertData(160,"-40", 0, 40, "8 x 3 - akar kuadrat dari 729 : 2 = ...", 30, 0);

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
