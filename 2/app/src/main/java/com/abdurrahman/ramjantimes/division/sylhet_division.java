package com.abdurrahman.ramjantimes.division;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.abdurrahman.ramjantimes.MainActivity;
import com.abdurrahman.ramjantimes.R;
import com.abdurrahman.ramjantimes.first_btn.devition;

public class sylhet_division extends AppCompatActivity {

    private ImageView back_icon, home_icon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sylhet_division);

        back_icon= findViewById(R.id.back_sy_bivag);
        home_icon= findViewById(R.id.home_sy_bivag);

        back_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sylhet_division.this, devition.class);
                startActivity(intent);
            }
        });
        home_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sylhet_division.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}