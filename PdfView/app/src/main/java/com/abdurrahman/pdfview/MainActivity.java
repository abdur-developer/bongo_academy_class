package com.abdurrahman.pdfview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pdf.pdfFile ="file.pdf";
                Intent intent = new Intent(MainActivity.this, Pdf.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pdf.pdfFile = "sample.pdf";
                Intent intent = new Intent(MainActivity.this, Pdf.class);
                startActivity(intent);

            }
        });
    }
}