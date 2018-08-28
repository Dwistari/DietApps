package com.example.dwistari.calories.Model;


import com.google.gson.annotations.SerializedName;

    /**
     * Created by root on 2/3/17.
     */

    public class PostPutDelProfile {
        @SerializedName("status")
        String status;
        @SerializedName("result")
       Profile mProfil;
        @SerializedName("message")
        String message;
        public String getStatus() {
            return status;
        }
        public void setStatus(String status) {
            this.status = status;
        }
        public String getMessage() {
            return message;
        }
        public void setMessage(String message) {
            this.message = message;
        }
        public Profile getProfil() {
            return mProfil;
        }
        public void setProfil(Profile Profil) {
            mProfil = Profil;
        }

    }