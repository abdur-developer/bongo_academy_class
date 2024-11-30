package com.abdurrahman.runningtext;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btn;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        editText = findViewById(R.id.ed);
        btn = findViewById(R.id.btn);
        tv.setSelected(true);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                method(""+editText.getText().toString());
            }
        });


    }

    private void method(String marqee){
        tv.setText(" "+ marqee);
    }
}