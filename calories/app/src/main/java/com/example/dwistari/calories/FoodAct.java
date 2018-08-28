//package com.example.dwistari.calories;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//
//import com.example.dwistari.calories.Adapter.AdapterFood;
//import com.example.dwistari.calories.Model.Food.Food;
//import com.example.dwistari.calories.Model.Food.GetFood;
//import com.example.dwistari.calories.Rest.ApiClient;
//import com.example.dwistari.calories.Rest.ApiInterface;
//
//import java.util.List;
//
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//
//public class FoodAct extends AppCompatActivity {
//
//    Button btIns;
//    ApiInterface mApiInterface;
//    private RecyclerView mRecyclerView;
//    private RecyclerView.Adapter mAdapter;
//    private RecyclerView.LayoutManager mLayoutManager;
//    public static FoodAct ma;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.result);
//
//        btIns = (Button) findViewById (R.id.btIns);
//        btIns.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(FoodAct.this, CaloresiAct.class));
//            }
//        });
//        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//        mLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManager);
//        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
//        ma=this;
//        refresh();
//    }
//
//    public void refresh() {
//        Call<GetFood> ProfilCall = mApiInterface.getProfil();
//        ProfilCall.enqueue(new Callback<GetFood>() {
//            @Override
//            public void onResponse(Call<GetFood> call, Response<GetFood>
//                    response) {
//                List<Food> FoodList = response.body().getListDataFood();
//                Log.d("Retrofit Get", "Jumlah data Kontak: " +
//                        String.valueOf(FoodList.size()));
//                mAdapter = new AdapterFood(FoodList);
//                mRecyclerView.setAdapter(mAdapter);
//            }
//
////            @Override
////            public void onResponse(Call<GetProfile> call, Response<GetProfile> response) {
////
////            }
//
//            @Override
//            public void onFailure(Call<GetFood> call, Throwable t) {
//                Log.e("Retrofit Get", t.toString());
//            }
//        });
//    }
//}