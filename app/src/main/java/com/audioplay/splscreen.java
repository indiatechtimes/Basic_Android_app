package com.audioplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;


import com.airbnb.lottie.LottieAnimationView;

public class splscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splscreen);


        // Declaring the animation view
        LottieAnimationView splAnim
                = findViewById(R.id.splAnim);
        splAnim
                .addAnimatorUpdateListener(
                        (animation) -> {
                            // Do something.
                        });
        splAnim
                .playAnimation();

        splAnim.isAnimating();// Do something.


        Intent iHome=new Intent(splscreen.this, MainActivity.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            new Handler().postDelayed(() -> {
                startActivity(iHome);
                finish();
            },
            3000);
        }
    }
}