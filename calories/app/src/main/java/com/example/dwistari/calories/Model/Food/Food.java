package com.example.dwistari.calories.Model.Food;

import com.google.gson.annotations.SerializedName;

public class Food {
    @SerializedName("id_food")
    private String id;
    @SerializedName("nama_makanan")
    private String nama_makanan;
    @SerializedName("berat")
    private int berat;
    @SerializedName("kalori")
    private float kalori;


    public Food(){}

    public Food(String id, String nama_makanan, int berat,float kalori ) {
        this.id = id;
        this.nama_makanan = nama_makanan;
        this.berat=berat;
        this.kalori=kalori;
}}
