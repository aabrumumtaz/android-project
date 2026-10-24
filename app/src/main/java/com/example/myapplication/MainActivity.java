package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout logoContainer = findViewById(R.id.logo_container);
        TextView titleText = findViewById(R.id.tv_serine_title);
        TextView subtitleText = findViewById(R.id.tv_serine_subtitle);

        Animation fadeInLogo = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation scaleUpTitle = AnimationUtils.loadAnimation(this, R.anim.scale_up_title);
        Animation fadeInSubtitle = AnimationUtils.loadAnimation(this, R.anim.fade_in_delayed);

        logoContainer.startAnimation(fadeInLogo);
        titleText.startAnimation(scaleUpTitle);
        subtitleText.startAnimation(fadeInSubtitle);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3500);
    }
}