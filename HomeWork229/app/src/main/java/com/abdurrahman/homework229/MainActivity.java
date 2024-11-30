package com.abdurrahman.homework229;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button odd_btn, even_btn, all_btn;
    EditText ed_nam, ed_num;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        odd_btn = findViewById(R.id.odd_btn);
        even_btn = findViewById(R.id.even_btn);
        all_btn = findViewById(R.id.all_btn);

        ed_nam = findViewById(R.id.ed_name);
        ed_num = findViewById(R.id.ed_num);

        tv = findViewById(R.id.tv);
        String input = ed_num.getText().toString();

       if (input.length() < 3){
           all_btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   ed_num.setError("Enter a value number");
                   ed_nam.setError("Enter a value name");
                   tv.setVisibility(View.VISIBLE);
                   tv.setText("");
                   Integer no = Integer.parseInt(input);
                   StringBuilder ans = new StringBuilder();

                   for (int i = 1; i <= no; i++ ){
                       ans.append("\t\t\t"+i);
                       tv.setText(ans);
                   }

               }
           });
           odd_btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   ed_num.setError("Enter a value number");
                   ed_nam.setError("Enter a value name");
                   tv.setVisibility(View.VISIBLE);
                   tv.setText("");
                   Integer no = Integer.parseInt(input);
                   StringBuilder ans = new StringBuilder();

                   for (int i = 1; i <= no; i = i+2 ){
                       ans.append("\t\t\t"+i);
                       tv.setText(ans);
                   }

               }
           });
           even_btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   ed_num.setError("Enter a value number");
                   ed_nam.setError("Enter a value name");
                   tv.setVisibility(View.VISIBLE);
                   tv.setText("");
                   Integer no = Integer.parseInt(input);
                   StringBuilder ans = new StringBuilder();

                   for (int i = 2; i <= no; i = i+2 ){
                       ans.append("\t\t\t"+i);
                       tv.setText(ans);
                   }

               }
           });
       }else if (input.length() > 2){
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Error")
                    .setMessage("enter an valueable number in 2 crecter.........")
                    .setIcon(R.drawable.baseline_error_24)
                    .setPositiveButton("sorry....", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            ed_num.setText("");
                            tv.setText("");
                        }
                    }).show();
       }
    }
}