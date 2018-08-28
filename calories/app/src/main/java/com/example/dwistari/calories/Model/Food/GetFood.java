package com.example.dwistari.calories.Model.Food;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetFood {

    @SerializedName("status")
    String status;
    @SerializedName("result")
    List<Food> listDataFood;
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

    public List<Food> getListDataFood() {

        return listDataFood;
    }

    public void setListDataFood(List<Food> listDataProfile) {
        this.listDataFood = listDataFood;
    }
}