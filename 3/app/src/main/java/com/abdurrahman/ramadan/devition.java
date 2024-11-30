package com.abdurrahman.ramadan;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abdurrahman.ramadan.division.borishal_dis;
import com.abdurrahman.ramadan.division.chattrogram_division;
import com.abdurrahman.ramadan.division.dhaka_division;
import com.abdurrahman.ramadan.division.khulna_division;
import com.abdurrahman.ramadan.division.moymon_division;
import com.abdurrahman.ramadan.division.rajshahi_division;
import com.abdurrahman.ramadan.division.rangpur_distric;
import com.abdurrahman.ramadan.division.sylhet_division;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class devition extends AppCompatActivity {
    private Button btn_dhaka, btn_rangpur, btn_rajshahi, btn_khulna;
    private  Button  btn_sylhet, btn_barishal, btn_chottogram, btn_moymonshinho;
    private ImageView back_icon, home_icon;
    ImageSlider imageSlider;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.devition);

        imageSlider = findViewById(R.id.image_slider);
        btn_dhaka= findViewById(R.id.btn_dhaka);
        btn_rangpur= findViewById(R.id.btn_rangpur);
        btn_rajshahi= findViewById(R.id.btn_rajshahi);
        btn_khulna= findViewById(R.id.btn_khulna);
        btn_barishal= findViewById(R.id.btn_barishal);
        btn_sylhet= findViewById(R.id.btn_sylhet);
        btn_chottogram= findViewById(R.id.btn_chattagram);
        btn_moymonshinho= findViewById(R.id.btn_moymonshingho);
        back_icon= findViewById(R.id.back_icon);
        home_icon= findViewById(R.id.home_icon);

        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel(R.drawable.allah_is_one, "allah is one", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.sehri_slider,"sehri times",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.dua_slider,"all dua",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.masjid_slider,"relation of masjid",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.tajbi_slider,"tajbi counter", ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP);




        btn_dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(devition.this, dhaka_division.class);
                startActivity(intent);
            }
        });

        btn_rangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(devition.this, rangpur_distric.class);
                startActivity(intent);
            }
        });

        btn_rajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(devition.this, rajshahi_division.class);
                startActivity(intent);
            }
        });

        btn_sylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(devition.this, sylhet_division.class);
                startActivity(intent);
            }
        });

        btn_chottogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(devition.this, chattrogram_division.class);
                startActivity(intent);
            }
        });

        btn_khulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(devition.this, khulna_division.class);
                startActivity(intent);
            }
        });

        btn_barishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(devition.this, borishal_dis.class);
                startActivity(intent);
            }
        });

        btn_moymonshinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(devition.this, moymon_division.class);
                startActivity(intent);
            }
        });

        home_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(devition.this, MainActivity.class);
                startActivity(intent);
            }
        });

        back_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(devition.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}
