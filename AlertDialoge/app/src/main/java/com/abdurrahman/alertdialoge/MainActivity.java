package com.abdurrahman.alertdialoge;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
       new AlertDialog.Builder(MainActivity.this)
                .setTitle("this is a title")
                .setMessage("are you Exit now!!")
                .setNeutralButton("share app", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        shareapp(MainActivity.this);

                    }
                })
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                       dialogInterface.dismiss();
                       finishAndRemoveTask();
                    }
                })
                .setNegativeButton("more app", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:Dean iT")));
                        }catch (ActivityNotFoundException e){
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Dean iT")));
                        }
                    }
                })
                .setCancelable(false)
                .show();



    }
    private void shareapp(Context cveriable){
        final String pakegVeriable = cveriable.getPackageName();
        Intent iveriable = new Intent();
        iveriable.setAction(Intent.ACTION_SEND);
        iveriable.putExtra(Intent.EXTRA_TEXT, "share this apps....\n https://play.google.com/store/apps/details?id="+ pakegVeriable);
        iveriable.setType("text/plain");
        cveriable.startActivity(iveriable);
    }
}