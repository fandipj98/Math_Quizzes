package com.example.mathquizzes;

public class Game {
    int id_jawaban;
    String deskripsi_jawaban;
    int kebenaran_jawaban;
    int id_soal;
    String deskripsi_soal;
    int id_level;
    int highscore;

    public Game(int id_jawaban, String deskripsi_jawaban, int kebenaran_jawaban, int id_soal, String deskripsi_soal, int id_level, int highscore) {
        this.id_jawaban = id_jawaban;
        this.deskripsi_jawaban = deskripsi_jawaban;
        this.kebenaran_jawaban = kebenaran_jawaban;
        this.id_soal = id_soal;
        this.deskripsi_soal = deskripsi_soal;
        this.id_level = id_level;
        this.highscore = highscore;
    }

    public int getId_jawaban() {
        return id_jawaban;
    }

    public void setId_jawaban(int id_jawaban) {
        this.id_jawaban = id_jawaban;
    }

    public String getDeskripsi_jawaban() {
        return deskripsi_jawaban;
    }

    public void setDeskripsi_jawaban(String deskripsi_jawaban) {
        this.deskripsi_jawaban = deskripsi_jawaban;
    }

    public int getKebenaran_jawaban() {
        return kebenaran_jawaban;
    }

    public void setKebenaran_jawaban(int kebenaran_jawaban) {
        this.kebenaran_jawaban = kebenaran_jawaban;
    }

    public int getId_soal() {
        return id_soal;
    }

    public void setId_soal(int id_soal) {
        this.id_soal = id_soal;
    }

    public String getDeskripsi_soal() {
        return deskripsi_soal;
    }

    public void setDeskripsi_soal(String deskripsi_soal) {
        this.deskripsi_soal = deskripsi_soal;
    }

    public int getId_level() {
        return id_level;
    }

    public void setId_level(int id_level) {
        this.id_level = id_level;
    }

    public int getHighscore() {
        return highscore;
    }

    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }
}
