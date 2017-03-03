package com.example.vicapps.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MySplash extends AppCompatActivity {
    TextView titleM;
    TextView titler;
    TextView titleF;
    TextView titleo;
    TextView titlex;
    ImageView image ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);
        titleM = (TextView)findViewById(R.id.tvM);
        titler = (TextView)findViewById(R.id.tvr);
        titleF = (TextView)findViewById(R.id.tvF);
        titleo = (TextView)findViewById(R.id.tvo);
        titlex = (TextView)findViewById(R.id.tvx);
        image = (ImageView) findViewById(R.id.image_Splash);


        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        titleM.setTypeface(myFont);
        titler.setTypeface(myFont);
        titleF.setTypeface(myFont);
        titleo.setTypeface(myFont);
        titlex.setTypeface(myFont);




        Animation animImage = AnimationUtils.loadAnimation(this, R.anim.slide_down);
        image.setAnimation(animImage);
        Animation upAndDown = AnimationUtils.loadAnimation(this, R.anim.translation);
        titleM.setAnimation(upAndDown);
        titleF.setAnimation(upAndDown);
        titlex.setAnimation(upAndDown);
        Animation upAndDownInv = AnimationUtils.loadAnimation(this, R.anim.translationinv);
        titler.setAnimation(upAndDownInv);
        titleo.setAnimation(upAndDownInv);



        openApp();
    }

    private void openApp() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MySplash.this, MyLogin.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}
