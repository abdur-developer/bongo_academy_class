package com.abdurrahman.fectorial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText ed;
    View btn;
    String string;
    int fectorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv= findViewById(R.id.tv);
        ed= findViewById(R.id.ed);
        btn= findViewById(R.id.btn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fectorial=1;

                if (ed.getText().toString().trim().equalsIgnoreCase("")) {
                    ed.setError("This field can not be blank");
                }

                else {
                    string = ed.getText().toString();
                    Integer input = Integer.parseInt(string);

                    for (int i = 1;i <= input;i++){
                        fectorial = fectorial*i;
                    }
                    tv.setText(input+"\t Fectorial is::"+fectorial);
                }
            }
        });
    }
}