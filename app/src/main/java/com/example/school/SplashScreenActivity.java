package com.example.school;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Delay for 3 seconds (3000 milliseconds) before starting the LoginPageActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, LoginPageActivity.class);
                startActivity(intent);
                finish(); // Close the splash activity
            }
        }, 1000); // 3000 milliseconds = 3 seconds
    }
}