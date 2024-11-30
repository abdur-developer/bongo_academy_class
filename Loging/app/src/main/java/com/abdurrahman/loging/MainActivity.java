package com.abdurrahman.loging;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    TextView forget, create;
    Button button;
    EditText phone, pass;
    String pas, num, in_pas, in_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        forget = findViewById(R.id.forget);
        create = findViewById(R.id.createAc);
        button = findViewById(R.id.login);
        phone = findViewById(R.id.editTextPhone);
        pass = findViewById(R.id.editTextTextPassword);

        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ScoundActivity.class));
            }
        });
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ScoundActivity.class));
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in_num = phone.getText().toString();
                in_pas = pass.getText().toString();

                if (in_pas.isEmpty() || in_num.isEmpty()) {
                    phone.setError("enter a value number");
                    pass.setError("enter a value passwword");
                }
                else if (ScoundActivity.preferences.contains("phone_number") && ScoundActivity.preferences.contains("password")){
                    num = ScoundActivity.preferences.getString("phone_number","Data not found!");
                    pas = ScoundActivity.preferences.getString("password","Data not found!");

                    if (in_num.equals(num) && in_pas.equals(pas)){
                        Toast.makeText(MainActivity.this, "Loging Success", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                    }else {
                        new AlertDialog.Builder(MainActivity.this)
                                .setTitle("Error").setIcon(R.drawable.img)
                                .setMessage("your input password\nOr phone number is Null")
                                .setCancelable(false).setNeutralButton("it's OK",(dialogInterface, i) -> dialogInterface.dismiss())
                                .show();
                    }
                }
            }
        });

    }

}