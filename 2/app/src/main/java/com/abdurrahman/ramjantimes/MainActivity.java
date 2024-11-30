package com.abdurrahman.ramjantimes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.abdurrahman.ramjantimes.first_btn.devition;
import com.abdurrahman.ramjantimes.first_btn.doa_all_list;

public class MainActivity extends AppCompatActivity {

    private Button division, tajbi, doa, hadis, name_of_allah, niyot_of_namaj, q_a, kalema, sura, rulse_of_namaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        division= findViewById(R.id.btn_divition);
        tajbi= findViewById(R.id.btn_tajbi);
        doa= findViewById(R.id.btn_doa);
        hadis= findViewById(R.id.btn_hadis);
        name_of_allah= findViewById(R.id.btn_nama_of_allah);
        niyot_of_namaj= findViewById(R.id.btn_niyot);
        q_a= findViewById(R.id.btn_q_a);
        kalema= findViewById(R.id.btn_kalema);
        sura= findViewById(R.id.btn_sura);
        rulse_of_namaj= findViewById(R.id.btn_rules_of_prayer);

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, devition.class);
                startActivity(intent);
            }
        });
        tajbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, com.abdurrahman.ramjantimes.first_btn.tajbi.class);
                startActivity(intent);
            }
        });
        doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, doa_all_list.class);
                startActivity(intent);
            }
        });

    }
}