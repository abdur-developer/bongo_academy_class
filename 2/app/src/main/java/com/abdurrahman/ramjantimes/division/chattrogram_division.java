package com.abdurrahman.ramjantimes.division;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.abdurrahman.ramjantimes.MainActivity;
import com.abdurrahman.ramjantimes.R;
import com.abdurrahman.ramjantimes.first_btn.devition;

public class chattrogram_division extends AppCompatActivity {
    private ImageView back_icon, home_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chattrogram_division);

        back_icon= findViewById(R.id.back_ctg);
        home_icon= findViewById(R.id.home_ctg);

        back_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(chattrogram_division.this, devition.class);
                startActivity(intent);
            }
        });
        home_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(chattrogram_division.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}