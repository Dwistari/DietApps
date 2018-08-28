package com.example.dwistari.calories.Rest;

import com.example.dwistari.calories.Model.Food.GetFood;
import com.example.dwistari.calories.Model.PostPutDelProfile;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    @GET("biodata")
    Call<GetFood> getProfil();
    @FormUrlEncoded
    @POST("biodata")
    Call<PostPutDelProfile> postProfil(@Field("nama") String nama,
                                       @Field("kelamin") String kelamin,
                                       @Field("umur") String umur,
                                       @Field("berat_badan") String berat,
                                       @Field("tinggi_badan") String tinggi,
                                       @Field("aktifitas") String aktifitas);
    @FormUrlEncoded
    @PUT("biodata")
    Call<PostPutDelProfile> putProfil(@Field("id") String id,
                                     @Field("nama") String nama,
                                      @Field("kelamin") String kelamin,
                                     @Field("umur") String umur,
                                     @Field("berat_badan") String berat,
                                      @Field("tinggi_badan") String tinggi,
                                     @Field("aktifitas") String aktifitas);
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "biodata", hasBody = true)
    Call<PostPutDelProfile> deleteKontak(@Field("id") String id);


}