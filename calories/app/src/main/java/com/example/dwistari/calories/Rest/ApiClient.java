package com.example.dwistari.calories.Rest;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by root on 2/3/17.
 */

public class ApiClient {
//    public static final String BASE_URL = "http://172.16.202.52:8080/Skripsi/index.php/";
//    private static Retrofit retrofit = null;
//    public static Retrofit getClient() {
//   if(RETROFIT==null){
//        OkHttpClient client = new OkHttpClient.Builder()
//                .addInterceptor(new LoggingInterceptor())
//                .build();
//        RETROFIT = new Retrofit.Builder()
//                .baseUrl(URL)
//                .client(client)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        }
//        return retrofit;
//    }
    public static final String BASE_URL = "http://www.mocky.io/v2/5b7159ef3200005519f36cf7/";
    private static Retrofit retrofit = null;

    private static HttpLoggingInterceptor log = null;
    public static Retrofit getClient(){
        log = new HttpLoggingInterceptor();
        log.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(log)
                .retryOnConnectionFailure(true)
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .build();
        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).client(client).build();
        }
        return retrofit;
    }
}
