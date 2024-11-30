package com.abdurrahman.ramjantimes.division;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.abdurrahman.ramjantimes.MainActivity;
import com.abdurrahman.ramjantimes.R;
import com.abdurrahman.ramjantimes.first_btn.devition;

public class rajshahi_division extends AppCompatActivity {
    private ImageView back_icon, home_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rajshahi_division);

        back_icon= findViewById(R.id.back_raj);
        home_icon= findViewById(R.id.home_raj);

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