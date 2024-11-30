package com.abdurrahman.ramadan.division;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


import com.abdurrahman.ramadan.MainActivity;
import com.abdurrahman.ramadan.R;
import com.abdurrahman.ramadan.devition;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class borishal_dis extends AppCompatActivity {
    private ImageView back_icon, home_icon;
    ImageSlider imageSlider;
    LinearLayout borishal_clnd,borguna_clnd,potuakhali_clnd,pirojpur_clnd,vola_clnd,jalkathi_clnd;
    LinearLayout borishal_division_option;
    Button borishal, jalkati, potuakhali, pirojpur, vola, borguna;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.borishal_dis);

        back_icon= findViewById(R.id.back_bari);
        home_icon= findViewById(R.id.home_bari);

        borishal_clnd=findViewById(R.id.borishal_clnd);
        borishal_clnd=findViewById(R.id.borishal_clnd);
        borishal_clnd=findViewById(R.id.borishal_clnd);
        borishal_clnd=findViewById(R.id.borishal_clnd);
        borishal_clnd=findViewById(R.id.borishal_clnd);
        borishal_clnd=findViewById(R.id.borishal_clnd);
        borishal_clnd=findViewById(R.id.borishal_clnd);

        borishal_division_option=findViewById(R.id.borishal_division_option);

        borishal=findViewById(R.id.btn_barishal_dis);
        borishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                borishal_division_option.setVisibility(View.GONE);
                borishal_clnd.setVisibility(View.VISIBLE);
            }
        });

        jalkati=findViewById(R.id.btn_jalkati);
        borishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                borishal_division_option.setVisibility(View.GONE);
                borishal_clnd.setVisibility(View.VISIBLE);
            }
        });

        potuakhali=findViewById(R.id.btn_ptuyakhali);
        borishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                borishal_division_option.setVisibility(View.GONE);
                borishal_clnd.setVisibility(View.VISIBLE);
            }
        });

        pirojpur=findViewById(R.id.btn_pirojpur);
        borishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                borishal_division_option.setVisibility(View.GONE);
                borishal_clnd.setVisibility(View.VISIBLE);
            }
        });

        vola=findViewById(R.id.btn_vola);
        borishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                borishal_division_option.setVisibility(View.GONE);
                borishal_clnd.setVisibility(View.VISIBLE);
                borguna_clnd.setVisibility(View.GONE);

            }
        });

        borguna=findViewById(R.id.btn_borguna);
        borguna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                borishal_division_option.setVisibility(View.GONE);
                borguna_clnd.setVisibility(View.VISIBLE);
                borishal_clnd.setVisibility(View.GONE);
            }
        });


        imageSlider = findViewById(R.id.image_slider);

        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel(R.drawable.allah_is_one, "allah is one", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.sehri_slider,"sehri times",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.dua_slider,"all dua",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.masjid_slider,"relation of masjid",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.tajbi_slider,"tajbi counter", ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP);




        back_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(borishal_dis.this, devition.class);
                startActivity(intent);
            }
        });
        home_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(borishal_dis.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}