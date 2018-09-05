package com.example.dwistari.calories.Model;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

/**
     * Created by root on 2/3/17.
     */
@IgnoreExtraProperties
    public  class Profile implements Serializable {
    // @SerializedName("nama")
    private String nama;
    private String kelamin;
    private Integer umur;
    private Integer berat;
    private Integer tinggi;
    private String aktivitas;

    public Profile() {

    }

    public Profile(String nm, String klmn, Integer umr, Integer brt, Integer tgg, String aktv) {
        nama = nm;
        kelamin = klmn;
        umur = umr;
        berat = brt;
        tinggi = tgg;
        aktivitas = aktv;
    }

    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }


    public String getKelamin() {

        return kelamin;
    }

    public void setKelamin(String kelamin) {

        this.kelamin = kelamin;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {


        this.umur = umur;
    }

    public Integer getBerat() {

        return berat;
    }

    public void setBerat(Integer berat) {

        this.berat = berat;
    }

    public Integer getTinggi() {

        return tinggi;
    }

    public void setTinggi(Integer tinggi) {

        this.tinggi = tinggi;
    }

    public String getAktivitas() {

        return aktivitas;
    }

    public void setAktivitas(String aktivitas) {

        this.aktivitas = aktivitas;
    }

//    @Override
//    public String toString() {
//        return " " + nama + "\n" +
//                " " + kelamin + "\n" +
//                " " + umur + "\n" +
//                " " + berat + "\n" +
//                " " + tinggi + "\n" +
//                " " + aktivitas;
//    }


    //  public Profile(String nm, String klmn, String umr, String brt, String tgg, String aktv){


}