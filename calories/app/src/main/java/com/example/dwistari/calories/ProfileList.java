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


        /**
         * Inisialisasi RecyclerView & komponennya
//         */
//        rvView = (RecyclerView) findViewById(R.id.datalist);
//        rvView.setHasFixedSize(true);
//        layoutManager = new LinearLayoutManager(this);
//        rvView.setLayoutManager(layoutManager);

        /**
         * Inisialisasi adapter dan data barang dalam bentuk ArrayList
         * dan mengeset Adapter ke dalam RecyclerView
         */
//        dataProfile = new ArrayList<>();
//        adapter = new AdapterProfile(dataProfile, ProfileList.this);
//        rvView.setAdapter(adapter);

        /**
         * Inisialisasi dan mengambil Firebase Database Reference
         */

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

//        final FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference ref = database.getReference("Profile");
      //   database = FirebaseDatabase.getInstance().getReference();
        /**
         * Mengambil data profile dari Firebase Realtime DB
         */
//        database.child("Profile").addValueEventListener(new ValueEventListener() {
//          database.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
//
//                     AdapterProfile.Add(postSnapshot.getValue(Profile.class));
//
//                Profile profile = dataSnapshot.getValue(Profile.class);
//                System.out.println(profile);
//                }
//            }

//                /**
//                 * Saat ada data baru, masukkan datanya ke ArrayList
//                 */
//                for (DataSnapshot noteDataSnapshot : dataSnapshot.getChildren()) {
//                    /**
//                     * Mapping data pada DataSnapshot ke dalam object Barang
//                     * Dan juga menyimpan primary key pada object Barang
//                     * untuk keperluan Edit dan Delete data
//                     */
//                    Profile profile = noteDataSnapshot.getValue(Profile.class);
//                    profile.setNama(noteDataSnapshot.getKey());
//
//                    /**
//                     * Menambahkan object Barang yang sudah dimapping
//                     * ke dalam ArrayList
//                     */
//                    dataProfile.add(profile);
//                }


//
//            ArrayList profile = new ArrayList(); // nomor adalah variabel
//            private void main(String[] args) {
//                ArrayList profile = new ArrayList();
//                int jumlah_data = 10;
//                profile.add(jumlah_data);
//            }

//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//                Log.d(TAG,"LoadProfile: onCancelled", databaseError.toException());
//
//               // System.out.println("The read failed: " + databaseError.getCode());
//            }
//        });
//    }
//        @Override
//        protected void onResume() {
//            super.onResume();
//
//           adapter.notifyDataSetChanged();

        public static Intent getActIntent (Activity activity){
            return new Intent(activity, ProfileList.class);
        }
    }

