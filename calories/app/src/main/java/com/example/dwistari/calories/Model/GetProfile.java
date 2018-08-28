package com.example.dwistari.calories.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


    public class GetProfile {
        @SerializedName("status")
        String status;
        @SerializedName("result")
        List<Profile> listDataProfile;
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
        public List<Profile> getListDataProfile() {

            return listDataProfile;
        }
        public void setListDataProfile(List<Profile> listDataProfile) {
            this.listDataProfile = listDataProfile;
        }
    }