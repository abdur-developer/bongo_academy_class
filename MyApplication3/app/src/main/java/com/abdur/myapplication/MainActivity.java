package com.abdur.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView click;
    Animation fade_in, left_to_right, middle_to_top, right_to_left, zoom_in ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.img);
        click= findViewById(R.id.click);
        fade_in = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
        left_to_right = AnimationUtils.loadAnimation(MainActivity.this, R.anim.left_to_right);
        middle_to_top = AnimationUtils.loadAnimation(MainActivity.this, R.anim.middle_to_top);
        right_to_left = AnimationUtils.loadAnimation(MainActivity.this, R.anim.right_to_left);
        zoom_in = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_in);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(middle_to_top);
            }
        });


    }
}