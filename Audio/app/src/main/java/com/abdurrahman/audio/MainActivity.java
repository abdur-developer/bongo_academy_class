package com.abdurrahman.audio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    ImageView img;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imageView2);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (img.getTag()!= null && img.getTag().toString().contains("off")){
                    if (player!= null ) player.release();
                    player = MediaPlayer.create(MainActivity.this, R.raw.song);
                    player.start();
                    img.setImageResource(R.drawable.off);
                    img.setTag("on");

                    player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            img.setImageResource(R.drawable.on);
                            img.setTag("off");
                        }
                    });
                }else {
                    if (player!= null ) player.release();
                    img.setImageResource(R.drawable.on);
                    img.setTag("off");
                }
            }
        });



    }
}