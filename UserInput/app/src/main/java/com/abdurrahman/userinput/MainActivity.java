package com.abdurrahman.userinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button chack_btn;
    EditText input;
    TextView question, tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chack_btn=findViewById(R.id.chack_btn);
        input=findViewById(R.id.input);
        question=findViewById(R.id.question);
        tvDisplay=findViewById(R.id.tvDisplay);

        chack_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = input.getText().toString();

                if (username.length() <= 0){
                    input.setError("Error! Please enter a value name");
                    
                }
                else {
                    tvDisplay.setText("Hello!! " + username + "\ngreat work");
                    tvDisplay.setVisibility(View.VISIBLE);
                }

            }
        });
    }
}