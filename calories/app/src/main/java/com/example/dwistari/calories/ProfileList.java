package com.example.dwistari.calories;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.example.dwistari.calories.Model.Profile;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class ProfileList extends AppCompatActivity {
    //Deklarasi Variable untuk RecyclerView
//    private DatabaseReference database;
    private TextView GetNama, GetKelamin, GetUmur, GetBerat, GetTinggi,GetAktivitas;
    private FirebaseDatabase getDatabase;
    private DatabaseReference getRefenence;
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Profile> dataProfile;
    private String TAG;
    // private String GetUserID;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        getSupportActionBar().setTitle("Data Profile");
        GetNama = findViewById(R.id.tvnama);
        GetKelamin= findViewById(R.id.tvkelamin);
        GetUmur = findViewById(R.id.tvumur);
        GetBerat = findViewById(R.id.tvberat);
        GetTinggi = findViewById(R.id.tvtinggi);
        GetAktivitas = findViewById(R.id.tvaktivitas);



        getDatabase = FirebaseDatabase.getInstance();
        getRefenence = getDatabase.getReference();


        getRefenence.child("Profile").addChildEventListener(new ChildEventListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                //Mengambil daftar item dari database, setiap kali ada turunannya
                Profile user = dataSnapshot.getValue(Profile.class);


                GetNama.setText("Nama : "+user.getNama());
                GetKelamin.setText("Kelamin : "+user.getKelamin());
                GetUmur.setText("Umur : "+user.getUmur());
                GetBerat.setText("Berat : "+user.getBerat());
                GetTinggi.setText("Tinggi : "+user.getTinggi());
                GetAktivitas.setText("Aktivitas : "+user.getAktivitas());
            }


            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                //......
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                //......
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
                //.....
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                //Digunakan untuk menangani kejadian Error
                Log.e("MyListData", "Error: ", databaseError.toException());
            }
        });
    }


    public static Intent getActIntent (Activity activity){
        return new Intent(activity, ProfileList.class);
    }
}