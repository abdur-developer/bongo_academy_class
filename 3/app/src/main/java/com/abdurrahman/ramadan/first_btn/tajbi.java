package com.abdurrahman.ramadan.first_btn;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abdurrahman.ramadan.MainActivity;
import com.abdurrahman.ramadan.R;

public class tajbi extends AppCompatActivity {
    int count=0;
    Button addone_1,addone_2,addone_3,addone_4;
    TextView tvcount;
    ImageView reset_img;
    private ImageView back_icon, home_icon;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tajbi);

        addone_1= findViewById(R.id.addone_1);
        addone_2= findViewById(R.id.addone_2);
        addone_3= findViewById(R.id.addone_3);
        addone_4= findViewById(R.id.addone_4);
        tvcount = findViewById(R.id.tvcount);
        reset_img = findViewById(R.id.reset_img);
        back_icon= findViewById(R.id.back_icon);
        home_icon= findViewById(R.id.home_icon);



        addone_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;

                tvcount.setText(""+count);
            }
        });

        addone_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;

                tvcount.setText(""+count);
            }
        });
        addone_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;

                tvcount.setText(""+count);
            }
        });
        addone_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;

                tvcount.setText(""+count);
            }
        });

        addone_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;

                tvcount.setText(""+count);
            }
        });

        reset_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;

                tvcount.setText(""+count);
            }
        });

        home_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(tajbi.this, MainActivity.class);
                startActivity(intent);

            }
        });

        back_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(tajbi.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}