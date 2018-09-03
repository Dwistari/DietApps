package com.example.dwistari.calories.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dwistari.calories.Model.Profile;
import com.example.dwistari.calories.R;

import java.util.ArrayList;

//Class Adapter ini Digunakan Untuk Mengatur Bagaimana Data akan Ditampilkan
public class AdapterProfile extends RecyclerView.Adapter<AdapterProfile.ViewHolder>{


    //Deklarasi Variable
    private ArrayList<Profile> dataProfile;
    private Context context;

    //Membuat Konstruktor, untuk menerima input dari Database
    public AdapterProfile(ArrayList<Profile> profile, Context ctx) {
        /**
         * Inisiasi data dan variabel yang akan digunakan
         */
        dataProfile = profile;
        context = ctx;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView Nama, Kelamin, Umur, Berat, Tinggi, Aktivitas;


        ViewHolder(View ProfileView) {
            super(ProfileView);
            //Menginisialisasi View-View yang terpasang pada layout RecyclerView kita
            Nama =  (TextView) ProfileView.findViewById(R.id.tvnama);
            Kelamin = (TextView) ProfileView.findViewById(R.id.tvkelamin);
            Umur = (TextView) ProfileView.findViewById(R.id.tvumur);
            Berat =(TextView) ProfileView.findViewById(R.id.tvberat);
            Tinggi = (TextView) ProfileView.findViewById(R.id.tvtinggi);
            Aktivitas = (TextView) ProfileView.findViewById(R.id.tvaktivitas);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.result, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        //Mengambil Nilai/Value yenag terdapat pada RecyclerView berdasarkan Posisi Tertentu
        final String Nama = dataProfile.get(position).getNama();
        final String Kelamin = dataProfile.get(position).getKelamin();
        final String Umur = dataProfile.get(position).getUmur();
        final String Berat = dataProfile.get(position).getBerat();
        final String Tinggi = dataProfile.get(position).getTinggi();
        final String Aktivitas = dataProfile.get(position).getAktivitas();

        //Memasukan Nilai/Value kedalam View (TextView)
        holder.Nama.setText("Nama: "+Nama);
        holder.Kelamin.setText("Kelamin: "+Kelamin);
        holder.Umur.setText("Umur: "+Umur);
        holder.Berat.setText("Berat badan: "+Berat);
        holder.Tinggi.setText("Tinggi badan: "+Tinggi);
        holder.Aktivitas.setText("Aktivitas: "+Aktivitas);

        holder.Nama.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            /**
             *  Kodingan untuk tutorial Selanjutnya :p Read detail data
             */
        }
    });

        holder.Nama.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                /*
                  Kodingan untuk membuat fungsi Edit dan Delete,
                  yang akan dibahas pada Tutorial Berikutnya.
                 */
                return true;
            }
        });
        holder.Nama.setText(Nama);
        holder.Kelamin.setText(Kelamin);
        holder.Umur.setText(Umur);
        holder.Berat.setText(Berat);
        holder.Tinggi.setText(Tinggi);
        holder.Aktivitas.setText(Aktivitas);
    }

    @Override
    public int getItemCount() {
        //Menghitung Ukuran/Jumlah Data Yang Akan Ditampilkan Pada RecyclerView
        return dataProfile.size();
    }

}