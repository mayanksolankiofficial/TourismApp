package com.dgproduction.erdeepak_kumar.tourismapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashActivity extends AppCompatActivity {
    ImageView img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        img1=findViewById(R.id.splash_worldtour);
        img2=findViewById(R.id.splash_snappic);
        Glide.with(this)
                .load(R.drawable.worldtour)
                .into(img1);
        Glide.with(this)
                .load(R.drawable.snappic)
                .into(img2);


        Thread background = new Thread() {
            public void run() {

                try {
                    // Thread will sleep for 5 seconds
                    sleep(8*1000);

                    // After 5 seconds redirect to another intent

                    Intent intent = new Intent(SplashActivity.this,PlacesActivity.class);
                    startActivity(intent);

                    //Remove activity
                    finish();

                } catch (Exception e) {

                }
            }
        };

        // start thread
        background.start();

    }
}
