package com.audioplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Declaring the animation view
        LottieAnimationView lotAnim
                = findViewById(R.id.lotAnim);
        lotAnim
                .addAnimatorUpdateListener(
                        (animation) -> {
                            // Do something.
                        });
        lotAnim
                .playAnimation();

        if (lotAnim.isAnimating()) {
            // Do something.
        }
    }
}