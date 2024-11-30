package com.abdurrahman.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText weight, hight_1, hight_2;
TextView tv_display_1;
Float result;
Button calculatior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.ed_weight);
        hight_1 = findViewById(R.id.ed_hight_1);
        hight_2 = findViewById(R.id.ed_hight_2);
        tv_display_1 = findViewById(R.id.tv_display_1);
        calculatior = findViewById(R.id.calculation);
    calculatior.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View view) {
            String ed_kg = weight.getText().toString();
            String ed_feet = hight_1.getText().toString();
            String ed_inch= hight_2.getText().toString();
            float weight_s = Float.parseFloat(ed_kg);
            float feet = Float.parseFloat(ed_feet);
            float inch = Float.parseFloat(ed_inch);
            float hight = (float) ((feet * 0.3048) + (inch * 0.0254));
            result = weight_s/hight/hight;
            
            if (result<18){
                tv_display_1.setText("your bmi result: "+result+"\n----you have Underweight");
            } else if (result > 18 && result < 24) {
                tv_display_1.setText("your bmi result: "+result+"\n----you have Normal weight");
            } else if (result > 25 && result < 29) {
                tv_display_1.setText("your bmi result: "+result+"\n----you have Overweight");
            }else if (result > 30) {
                tv_display_1.setText("your bmi result: "+result+"\n----you have Most Overweight");
            }
        }
    });
    }
}