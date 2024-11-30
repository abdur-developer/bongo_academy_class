package com.abdur.gassing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText edittext;
    private Button check;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);



        edittext = findViewById(R.id.edittext);
        check = findViewById( R.id.check);
        result = findViewById(R.id.textview);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gressString = edittext.getText().toString();
                int guess = Integer.parseInt(gressString);
                if (gressString.length() <= 0) {
                    edittext.setError("This field can not be blank");
                }
                else {
                    Random random = new Random();
                    int randomNum = random.nextInt(5)+1;

                    if (randomNum == guess)
                    {
                        result.setText("congrats! You have won");
                    } else {
                        result.setText("Sorry! You have lost. Random number was "+randomNum);
                    }
                }
            }
        });

    }
}