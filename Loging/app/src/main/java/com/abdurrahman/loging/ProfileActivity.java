package com.abdurrahman.loging;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    TextView tv;
    String num, First,Last, Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        tv = findViewById(R.id.textView);

        First = ScoundActivity.preferences.getString("first_name","Data not found!");
        Last = ScoundActivity.preferences.getString("last_name","Data not found!");
        num = ScoundActivity.preferences.getString("phone_number","Data not found!");
        Pass = ScoundActivity.preferences.getString("password","Data not found!");

        tv.setText("Name: "+ First +" "+ Last+"\nMobail Number: "+num+"\nPassword: "+Pass);
    }
}