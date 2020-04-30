package com.example.mathquizzes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "mathquizzes.db";
    public static final String TABLE_NAME = "jawaban";
    public static final String COL_1 = "id_jawaban";
    public static final String COL_2 = "deskripsi_jawaban";
    public static final String COL_3 = "kebenaran_jawaban";
    public static final String COL_4 = "id_soal";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table " + TABLE_NAME + " (id_jawaban INTEGER PRIMARY KEY, deskripsi_jawaban TEXT, kebenaran_jawaban INTEGER, id_soal INTEGER)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_NAME);
        onCreate(db);
    }

    public boolean insertData(int id_jawaban, String deskripsi_jawaban, int kebenaran_jawaban, int id_soal){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, id_jawaban);
        contentValues.put(COL_2, deskripsi_jawaban);
        contentValues.put(COL_3, kebenaran_jawaban);
        contentValues.put(COL_4, id_soal);

        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1){
            return false;
        }
        else{
            return true;
        }
    }

    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
        return res;
    }

}
