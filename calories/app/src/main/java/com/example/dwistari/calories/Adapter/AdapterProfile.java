package com.example.dwistari.calories.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dwistari.calories.R;
import com.example.dwistari.calories.Model.Profile;

import java.util.ArrayList;

//Class Adapter ini Digunakan Untuk Mengatur Bagaimana Data akan Ditampilkan
public class AdapterProfile extends RecyclerView.Adapter<AdapterProfile.ViewHolder>{


    //Deklarasi Variable
    private ArrayList<Profile> listProfile;
    private Context context;

    //Membuat Konstruktor, untuk menerima input dari Database
    public AdapterProfile(ArrayList<Profile> listProfile, Context context) {
        this.listProfile = listProfile;
        this.context = context;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView Nama, Kelamin, Umur, Berat, Tinggi, Aktivitas;
        private LinearLayout ListItem;

        ViewHolder(View ProfileView) {
            super(ProfileView);
            //Menginisialisasi View-View yang terpasang pada layout RecyclerView kita
            Nama = ProfileView.findViewById(R.id.nama);
            Kelamin = ProfileView.findViewById(R.id.kelamin);
            Umur = ProfileView.findViewById(R.id.umur);
            Berat = ProfileView.findViewById(R.id.berat);
            Tinggi = ProfileView.findViewById(R.id.tinggi);
            Aktivitas = ProfileView.findViewById(R.id.aktivitas);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.result, parent, false);
        return new ViewHolder(V);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        //Mengambil Nilai/Value yenag terdapat pada RecyclerView berdasarkan Posisi Tertentu
        final String Nama = listProfile.get(position).getNama();
        final String Kelamin = listProfile.get(position).getKelamin();
        final String Umur = listProfile.get(position).getUmur();
        final String Berat = listProfile.get(position).getBerat();
        final String Tinggi = listProfile.get(position).getTinggi();
        final String Aktivitas = listProfile.get(position).getAktivitas();

        //Memasukan Nilai/Value kedalam View (TextView)
        holder.Nama.setText("Nama: "+Nama);
        holder.Kelamin.setText("Kelamin: "+Kelamin);
        holder.Umur.setText("Umur: "+Umur);
        holder.Berat.setText("Berat badan: "+Berat);
        holder.Tinggi.setText("Tinggi badan: "+Tinggi);
        holder.Aktivitas.setText("Aktivitas: "+Aktivitas);


        holder.ListItem.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                /*
                  Kodingan untuk membuat fungsi Edit dan Delete,
                  yang akan dibahas pada Tutorial Berikutnya.
                 */
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        //Menghitung Ukuran/Jumlah Data Yang Akan Ditampilkan Pada RecyclerView
        return listProfile.size();
    }

}