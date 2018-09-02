package com.example.dwistari.calories;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    private Button btKalori;
    private Button btViewDB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        btKalori = (Button) findViewById(R.id.bt_kalori);
        btViewDB = (Button) findViewById(R.id.bt_viewdata);

        btKalori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // kelas yang akan dijalankan ketika tombol Create/Insert Data diklik
                startActivity(CaloresiAct.getActIntent(Menu.this));
            }
        });

        btViewDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(ProfileList.getActIntent(Menu.this));
            }
        });
    }

}