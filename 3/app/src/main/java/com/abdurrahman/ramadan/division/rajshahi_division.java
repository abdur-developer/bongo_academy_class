package com.abdurrahman.ramadan.division;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.abdurrahman.ramadan.MainActivity;
import com.abdurrahman.ramadan.R;
import com.abdurrahman.ramadan.devition;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class rajshahi_division extends AppCompatActivity {
    private ImageView back_icon, home_icon;
    ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rajshahi_division);
        imageSlider = findViewById(R.id.image_slider);

        back_icon= findViewById(R.id.back_raj);
        home_icon= findViewById(R.id.home_raj);

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
                Intent intent= new Intent(rajshahi_division.this, devition.class);
                startActivity(intent);

            }
        });

        home_icon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=  new Intent(rajshahi_division.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}