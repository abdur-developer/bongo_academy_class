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

public class khulna_division extends AppCompatActivity {

        private ImageView home, back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.khulna_division);

        home = findViewById(R.id.home_khul);
        back = findViewById(R.id.back_khul);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(khulna_division.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(khulna_division.this, devition.class);
                startActivity(intent);
            }
        });
    }
}