package com.abdurrahman.pdfview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;


public class Pdf extends AppCompatActivity {
    LottieAnimationView lottie;
    PDFView pdfView;
    public static String pdfFile = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        lottie =findViewById(R.id.lotti);
        pdfView = findViewById(R.id.pdfView);

        pdfView.setVisibility(View.INVISIBLE);
        lottie.setVisibility(View.VISIBLE);

        pdfView.fromAsset(pdfFile)

        .onLoad(new OnLoadCompleteListener() {
            @Override
            public void loadComplete(int nbPages) {
                lottie.setVisibility(View.GONE);
                pdfView.setVisibility(View.VISIBLE);
            }
        }).load();





    }
}