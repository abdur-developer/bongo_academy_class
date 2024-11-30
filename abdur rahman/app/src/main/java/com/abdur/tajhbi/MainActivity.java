package com.abdur.tajhbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvcount;
    Button buttonAdd, buttonSub, buttonReset;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvcount = findViewById(R.id.tvcount);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonReset = findViewById(R.id.buttonReset);


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tvcount.setText("" + count);
            }
        });
    buttonSub.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        count--;
        tvcount.setText(""+count);
    }
    });
    buttonReset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            count=0;
            tvcount.setText(""+count);
        }
    });

    }
    }
