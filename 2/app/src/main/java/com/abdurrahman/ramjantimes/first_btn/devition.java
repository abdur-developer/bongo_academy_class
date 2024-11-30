package com.abdurrahman.ramjantimes.first_btn;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.abdurrahman.ramjantimes.MainActivity;
import com.abdurrahman.ramjantimes.R;
import com.abdurrahman.ramjantimes.division.borishal_dis;
import com.abdurrahman.ramjantimes.division.chattrogram_division;
import com.abdurrahman.ramjantimes.division.dhaka_division;
import com.abdurrahman.ramjantimes.division.khulna_division;
import com.abdurrahman.ramjantimes.division.moymon_division;
import com.abdurrahman.ramjantimes.division.rajshahi_division;
import com.abdurrahman.ramjantimes.division.rangpur_distric;
import com.abdurrahman.ramjantimes.division.sylhet_division;

public class devition extends AppCompatActivity {

    private Button btn_dhaka, btn_rangpur, btn_rajshahi, btn_khulna;
    private  Button  btn_sylhet, btn_barishal, btn_chottogram, btn_moymonshinho;
    private ImageView back_icon, home_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.devition);

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

        btn_chottogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(devition.this, chattrogram_division.class);
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

        btn_sylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(devition.this, sylhet_division.class);
                startActivity(intent);
            }
        });

        btn_moymonshinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(devition.this, moymon_division.class);
                startActivity(intent);
            }

            private void startActivity(Intent intent) {

            }
        });

        btn_khulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(devition.this, khulna_division.class);
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