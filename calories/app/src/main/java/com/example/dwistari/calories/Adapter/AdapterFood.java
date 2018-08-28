//package com.example.dwistari.calories.Adapter;
//
//import android.content.Intent;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import com.example.dwistari.calories.CaloresiAct;
//import com.example.dwistari.calories.Model.Food.Food;
//import com.example.dwistari.calories.Model.Profile;
//import com.example.dwistari.calories.R;
//
//import java.util.List;
//
///**
// * Created by root on 2/3/17.
// */
//
//public class AdapterFood extends RecyclerView.Adapter<AdapterFood.MyViewHolder>{
//    List<Food> mFoodList;
//
//    public AdapterFood(List<Food> FoodList) {
//        mFoodList = FoodList;
//    }
//
//    @Override
//    public MyViewHolder onCreateViewHolder (ViewGroup parent,int viewType){
//        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.kontak_list, parent, false);
//        MyViewHolder mViewHolder = new MyViewHolder(mView);
//        return mViewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder (MyViewHolder holder,final int position){
//        holder.mTextViewId.setText("Id = " +mFoodList .get(position).getId());
//        holder.mTextViewNama.setText("Nama = " + mFoodList .get(position).getNama());
////        holder.mTextViewNama.setText("Jenis Kelamin = " + mProfileList .get(position).getKelamin());
////        holder.mTextViewKelamin.setText("Umur = " + mProfileList .get(position).getUmur());
////        holder.mTextViewBerat.setText("Berat Badan = " + mProfileList .get(position).getBerat());
////        holder.mTextViewTinggi.setText("Tinggi Badan = " + mProfileList .get(position).getTinggi());
////        holder.mTextViewAktifitas.setText("Aktifitas = " + mProfileList .get(position).getAktifitas());
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent mIntent = new Intent(view.getContext(), CaloresiAct.class);
//                mIntent.putExtra("Id", mFoodList .get(position).getId());
//                mIntent.putExtra("Nama", mProfileList .get(position).getNama());
////                mIntent.putExtra("Jenis Kelamin", mProfileList.get(position).getKelamin());
////                mIntent.putExtra("Umur", mProfileList .get(position).getUmur());
////                mIntent.putExtra("Berat Badan", mProfileList .get(position).getBerat());
////                mIntent.putExtra("Tinggi Badan", mProfileList .get(position).getTinggi());
////                mIntent.putExtra("Aktifitas", mProfileList .get(position).getAktifitas());
////                view.getContext().startActivity(mIntent);
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount () {
//        return mProfileList .size();
//    }
//
//    public class MyViewHolder extends RecyclerView.ViewHolder {
//        public TextView mTextViewId, mTextViewNama, mTextViewKelamin, mTextViewUmur, mTextViewBerat,
//                mTextViewTinggi, mTextViewAktifitas;
//
//        public MyViewHolder(View itemView) {
//            super(itemView);
//            mTextViewId = (TextView) itemView.findViewById(R.id.tvId);
//            mTextViewNama = (TextView) itemView.findViewById(R.id.tvNama);
////            mTextViewKelamin = (TextView) itemView.findViewById(R.id.tvKelamin);
////            mTextViewUmur = (TextView) itemView.findViewById(R.id.tvUmur);
////            mTextViewBerat = (TextView) itemView.findViewById(R.id.tvBerat);
////            mTextViewTinggi = (TextView) itemView.findViewById(R.id.tvTinggi);
////            mTextViewAktifitas = (TextView) itemView.findViewById(R.id.tvAktifitas);
//        }
//    }
//}