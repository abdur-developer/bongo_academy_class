package com.abdurrahman.ramjantimes.division;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.abdurrahman.ramjantimes.MainActivity;
import com.abdurrahman.ramjantimes.R;
import com.abdurrahman.ramjantimes.first_btn.devition;

public class moymon_division extends AppCompatActivity {
    private ImageView back_icon, home_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moymon_division);
        back_icon= findViewById(R.id.back_moy);
        home_icon= findViewById(R.id.home_moy);

        back_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(moymon_division.this, devition.class);
                startActivity(intent);
            }
        });
        home_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(moymon_division.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}