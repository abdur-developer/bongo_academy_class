package com.abdurrahman.loging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ScoundActivity extends AppCompatActivity{
    private TextView loginTv;
    private Button signUp;
    private EditText first, last, in_phone, in_pass, repass;
    private String fst_st, lst_st, phn_st, pas_st, repas_st;
    public static SharedPreferences preferences;
    public static SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scound);

        loginTv = findViewById(R.id.login);
        signUp = findViewById(R.id.signUp);

        first = findViewById(R.id.firstName);
        last = findViewById(R.id.LastName);

        in_phone = findViewById(R.id.phone);
        in_pass = findViewById(R.id.Password1);
        repass = findViewById(R.id.Password2);

        preferences = getPreferences( Context.MODE_PRIVATE);
        editor = preferences.edit();

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fst_st = first.getText().toString();
                lst_st = last.getText().toString();
                phn_st = in_phone.getText().toString();
                pas_st = in_pass.getText().toString();
                repas_st = repass.getText().toString();

                editor.putString("first_name",fst_st);
                editor.putString("last_name",lst_st);
                editor.putString("phone_number",phn_st);
                editor.putString("password",pas_st);
                editor.putString("re_pass",repas_st);
                editor.apply();

                Toast.makeText(ScoundActivity.this, "Registration Complete",Toast.LENGTH_SHORT).show();
            }
        });
        loginTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScoundActivity.this, MainActivity.class));
            }
        });
    }

}