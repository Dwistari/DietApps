package com.example.dwistari.calories.Model;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

/**
     * Created by root on 2/3/17.
     */
@IgnoreExtraProperties
    public class Profile implements Serializable {
     // @SerializedName("nama")
        private String nama;
       // @SerializedName("jenis_kelamin")
        private String kelamin;
       // @SerializedName("umur")
        private String umur;
       // @SerializedName("berat_badan")
        private String berat;
       // @SerializedName("tinggi_badan")
        private String tinggi;
       // @SerializedName("aktivitas")
        private String aktivitas;


        public Profile() {

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

        public String getUmur() {
            return umur;
        }

//        public void setUmur(int umur) {
        public void setUmur(String umur) {


        this.umur = umur;
        }

        public String getBerat() {

            return berat;
        }

        public void setBerat(String berat) {

            this.berat = berat;
        }

        public String getTinggi() {

            return tinggi;
        }

        public void setTinggi(String tinggi) {

            this.tinggi = tinggi;
        }

        public String getAktivitas() {

            return aktivitas;
        }

        public void setAktivitas(String aktivitas) {

            this.aktivitas = aktivitas;
        }
    @Override
    public String toString() {
        return " "+nama+"\n" +
                " "+kelamin +"\n" +
                " "+umur +"\n" +
                " "+berat +"\n" +
                " "+tinggi+"\n" +
                " "+aktivitas;
    }

    public Profile(String nm, String klmn, String umr, String brt, String tgg, String aktv){
        nama = nm;
        kelamin = klmn;
        umur = umr;
        berat = brt;
        tinggi = tgg;
        aktivitas = aktv;
    }



    }