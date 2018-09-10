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
import android.widget.Spinner;

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
    private EditText etNama,  etUmur, etBerat, etTinggi;
    private Spinner etKelamin, etAktivitas;
    Button Result;
  //  private ArrayList<Profile> dataProfile;
//
//    String name[] ={"Pria", "Wanita"};
//    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calories);

        progressBar = findViewById(R.id.progress);
        progressBar.setVisibility(View.GONE);

        // inisialisasi fields EditText dan Button
        etNama = (EditText) findViewById(R.id.etnama);
        etUmur = (EditText) findViewById(R.id.etumur);
        etBerat = (EditText) findViewById(R.id.etberat);
        etTinggi = (EditText) findViewById(R.id.ettinggi);
        etKelamin = (Spinner) findViewById(R.id.etkelamin);
        etAktivitas = (Spinner) findViewById(R.id.etaktivitas);
        Result = (Button) findViewById(R.id.Result);

        // mengambil referensi ke Firebase Database
        database = FirebaseDatabase.getInstance().getReference();

    Result.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!isEmpty(etNama.getText().toString()) && !isEmpty(etKelamin.getSelectedItem().toString()) && !isEmpty(etUmur.getText().toString())
                    && !isEmpty(etBerat.getText().toString()) && !isEmpty(etTinggi.getText().toString())&& !isEmpty(etAktivitas.getSelectedItem().toString())) {

                final int Umur = Integer.parseInt(etUmur.getText().toString());
                final int Berat = Integer.parseInt(etBerat.getText().toString());
                final int Tinggi = Integer.parseInt(etTinggi.getText().toString());
//
                submitProfile(new Profile(etNama.getText().toString(), etKelamin.getSelectedItem().toString(), Umur, Berat, Tinggi,
                        etAktivitas.getSelectedItem().toString()));


                Intent i = new Intent(CaloresiAct.this, ProfileList.class);
                startActivity(i);
            } else
                   Snackbar.make(findViewById(R.id.Result), "Data tidak boleh kosong!!", Snackbar.LENGTH_LONG).show();

                    InputMethodManager imm = (InputMethodManager)
                    getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(
                           etNama.getWindowToken(), 0);


            }
        });
}

        private boolean isEmpty(String s) {
                // Cek apakah ada fields yang kosong, sebelum disubmit
                return TextUtils.isEmpty(s);
                }

//        private void updateBarang(Profile barang) {
//                // kodingan untuk next tutorial ya :p
//                }

        private void submitProfile(Profile profile) {

          database.child("Profile").push().setValue(profile).addOnSuccessListener(this, new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                    etNama.setText("");
             //       etKelamin.setSelectedItem("");
                    etUmur.setText("");
                    etBerat.setText("");
                    etTinggi.setText("");
               //     etAktivitas.setSelectedItem("");
                    Snackbar.make(findViewById(R.id.Result), "Data berhasil ditambahkan", Snackbar.LENGTH_LONG).show();

        }
              });
         }
        public static Intent getActIntent(Activity activity) {
                // kode untuk pengambilan Intent
                return new Intent(activity, CaloresiAct.class);
        }
    }