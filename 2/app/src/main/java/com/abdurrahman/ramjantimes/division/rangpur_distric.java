package com.abdurrahman.ramjantimes.division;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.abdurrahman.ramjantimes.MainActivity;
import com.abdurrahman.ramjantimes.R;
import com.abdurrahman.ramjantimes.first_btn.devition;

public class rangpur_distric extends AppCompatActivity {

    private ImageView home, back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rangpur_distric);

        home= findViewById(R.id.home_rang);
        back= findViewById(R.id.back_rang);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(rangpur_distric.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(rangpur_distric.this, devition.class);
                startActivity(intent);
            }
        });
    }
}