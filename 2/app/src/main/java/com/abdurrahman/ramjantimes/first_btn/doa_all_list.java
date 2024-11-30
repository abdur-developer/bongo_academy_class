package com.abdurrahman.ramjantimes.first_btn;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.abdurrahman.ramjantimes.MainActivity;
import com.abdurrahman.ramjantimes.R;

public class doa_all_list extends AppCompatActivity {

    private ImageView back_icon, home_icon;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doa_all_list);

        back_icon= findViewById(R.id.back_doa);
        home_icon= findViewById(R.id.home_doa);

        home_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(doa_all_list.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(doa_all_list.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}