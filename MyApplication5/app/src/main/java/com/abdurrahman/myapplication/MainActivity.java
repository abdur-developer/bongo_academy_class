package com.abdurrahman.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText ed_from, ed_to;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
//        ed_from = findViewById(R.id.edText_from);
        ed_to = findViewById(R.id.edText_to);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("");
//                Integer integer_from = Integer.parseInt(ed_from.getText().toString());
                Integer integer_to = Integer.parseInt(ed_to.getText().toString());

                if (integer_to != null){

                    for (int i= 2; i <= integer_to;i++){
                        if (integer_to % i == 0) tv.setText(""+integer_to+" is not prime number");

                        else  tv.setText(""+integer_to+" is prime number");

                    }

                    }
                }

        });
    }
}