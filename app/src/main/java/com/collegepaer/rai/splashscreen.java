package com.collegepaer.rai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class splashscreen extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    ImageView imageView;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splashscreen);
        imageView=findViewById(R.id.image);
        lottieAnimationView=findViewById(R.id.lottie);
        constraintLayout=findViewById(R.id.background);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreen.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        },3000);
    }
}