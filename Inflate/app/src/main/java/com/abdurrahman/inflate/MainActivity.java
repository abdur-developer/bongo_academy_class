package com.abdurrahman.inflate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bd,id;
    LinearLayout dteils;
    LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bd = findViewById(R.id.bangladesh);
        id = findViewById(R.id.india);
        dteils = findViewById(R.id.details);
        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        bd.setOnClickListener(this);
        id.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.bangladesh){
            if (dteils != null) {
                dteils.removeAllViews();
            }
            inflater.inflate(R.layout.bangladesh, dteils);

        } else if (view.getId() == R.id.india) {
            if (dteils != null) {
                dteils.removeAllViews();
            }
            inflater.inflate(R.layout.india, dteils);
        }
    }
}