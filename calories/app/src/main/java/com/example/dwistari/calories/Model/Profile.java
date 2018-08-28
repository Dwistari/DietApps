package com.example.dwistari.calories.Model;

    import com.google.gson.annotations.SerializedName;

    /**
     * Created by root on 2/3/17.
     */

    public class Profile {
        @SerializedName("nama")
        private String nama;
        @SerializedName("jenis_kelamin")
        private String kelamin;
        @SerializedName("umur")
        private String umur;
        @SerializedName("berat_badan")
        private String berat;
        @SerializedName("tinggi_badan")
        private String tinggi;
        @SerializedName("aktivitas")
        private String aktivitas;

  //      public Profile(String id, String nama, String kelamin, int umur, double berat, double tinggi, String aktivitas){}


        public Profile(String nama, String kelamin, String umur, String tinggi, String berat, String aktivitas) {
            this.nama = nama;
            this.kelamin = kelamin;
            this.umur = umur;
            this.berat=  berat;
            this.tinggi = tinggi;
            this.aktivitas=aktivitas;
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


    }