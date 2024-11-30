package com.abdurrahman.ramadan;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.abdurrahman.ramadan.first_btn.doa_all_list;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageSlider imageSlider;
    private Button division, tajbi, doa, hadis, name_of_allah, niyot_of_namaj, q_a, kalema, sura, rulse_of_namaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSlider = findViewById(R.id.image_slider);
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
                Intent intent= new Intent(MainActivity.this, com.abdurrahman.ramadan.first_btn.tajbi.class);
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

        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel(R.drawable.allah_is_one, "allah is one", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.sehri_slider,"sehri times",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.dua_slider,"all dua",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.masjid_slider,"relation of masjid",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.tajbi_slider,"tajbi counter", ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP);

    }
}