package com.example.dwistari.calories;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.dwistari.calories.Model.Profile;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CaloresiAct extends AppCompatActivity {

    // variable yang merefers ke Firebase Realtime Database
   // private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference database;

    //deklarasi variable
    private ProgressBar progressBar;
    private EditText etNama, etKelamin, etUmur, etBerat, etTinggi, etAktivitas;
    Button Result;
  //  private ArrayList<Profile> dataProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calories);

        progressBar = findViewById(R.id.progress);
        progressBar.setVisibility(View.GONE);

        // inisialisasi fields EditText dan Button
        etNama = (EditText) findViewById(R.id.tvnama);
        etKelamin = (EditText) findViewById(R.id.kelamin);
        etUmur = (EditText) findViewById(R.id.umur);
        etBerat = (EditText) findViewById(R.id.berat);
        etTinggi = (EditText) findViewById(R.id.tinggi);
        etAktivitas = (EditText) findViewById(R.id.aktivitas);
        Result = (Button) findViewById(R.id.Result);

        // mengambil referensi ke Firebase Database
      //  mFirebaseDatabase = FirebaseDatabase.getInstance();
        database = FirebaseDatabase.getInstance().getReference();



    Result.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!isEmpty(etNama.getText().toString()) && !isEmpty(etKelamin.getText().toString()) && !isEmpty(etUmur.getText().toString())
                    && !isEmpty(etBerat.getText().toString()) && !isEmpty(etTinggi.getText().toString())&& !isEmpty(etAktivitas.getText().toString())) {
                submitProfile(new Profile(etNama.getText().toString(), etKelamin.getText().toString(), etUmur.getText().toString(),
                        etBerat.getText().toString(),etTinggi.getText().toString(), etAktivitas.getText().toString()));
            } else
                   Snackbar.make(findViewById(R.id.Result), "Data tidak boleh kosong!!", Snackbar.LENGTH_LONG).show();

                    InputMethodManager imm = (InputMethodManager)
                    getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(
                           etNama.getWindowToken(), 0);
            }
        });
}
//         public void saveProfile (View view){
//            //      View view = LayoutInflater.from(this).inflate(R.layout.profile_list, null, false);
//            String nama = etNama.getText().toString();
//            String kelamin = etKelamin.getText().toString();
//            String umur = etUmur.getText().toString();
//            String berat = etBerat.getText().toString();
//            String tinggi = etTinggi.getText().toString();
////        int umur = Integer.parseInt(Umur.getText().toString());
////        double berat = Integer.parseInt(Berat.getText().toString());
////        int tinggi = Integer.parseInt(Tinggi.getText().toString());
//            String aktivitas = Aktivitas.getText().toString();

//            String id = mFirebaseReference.push().getKey();
//
//            Profile profile = new Profile(id, nama, kelamin, umur, berat, tinggi, aktivitas);
//
//            mFirebaseReference.child(id).setValue(profile);
//            Toast.makeText(this, "Data profile ditambahkan", Toast.LENGTH_LONG).show();
//
//        }
//
//    }

        private boolean isEmpty(String s) {
                // Cek apakah ada fields yang kosong, sebelum disubmit
                return TextUtils.isEmpty(s);
                }

//        private void updateBarang(Profile barang) {
//                // kodingan untuk next tutorial ya :p
//                }

        private void submitProfile(Profile profile) {
                /**
                 * Ini adalah kode yang digunakan untuk mengirimkan data ke Firebase Realtime Database
                 * dan juga kita set onSuccessListener yang berisi kode yang akan dijalankan
                 * ketika data berhasil ditambahkan
                 */
          database.child("Profile").push().setValue(profile).addOnSuccessListener(this, new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                    etNama.setText("");
                    etKelamin.setText("");
                    etUmur.setText("");
                    etBerat.setText("");
                    etTinggi.setText("");
                    etAktivitas.setText("");
                    Snackbar.make(findViewById(R.id.Result), "Data berhasil ditambahkan", Snackbar.LENGTH_LONG).show();

//                Intent i = new Intent(getApplicationContext(),ProfileList.class);
//                startActivity(i);
//                setContentView(R.layout.result);
                }
                    });
                    }

        public static Intent getActIntent(Activity activity) {
                // kode untuk pengambilan Intent
                return new Intent(activity, CaloresiAct.class);
        }
    }