package com.example.animationstask;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;
    int[] animations;
    ImageView imv1, imv2, imv3, imv4, imv5, imv6, imv7, imv8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animations = new int[]{R.anim.move_to_left_side, R.anim.move_to_right_side,
                R.anim.move_to_bottom_side, R.anim.move_to_top_side,
                R.anim.move_to_corner_top_left_side, R.anim.move_to_corner_top_right_side,
        R.anim.move_to_corner_down_left_side,R.anim.move_to_corner_down_right_side};
        fab = findViewById(R.id.fab);
        imv1 = findViewById(R.id.imv1);
        imv2 = findViewById(R.id.imv2);
        imv3 = findViewById(R.id.imv3);
        imv4 = findViewById(R.id.imv4);
        imv5 = findViewById(R.id.imv5);
        imv6 = findViewById(R.id.imv6);
        imv7 = findViewById(R.id.imv7);
        imv8 = findViewById(R.id.imv8);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), animations[0]);
                imv1.startAnimation(animation);
                Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), animations[1]);
                imv2.startAnimation(animation2);
                Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(), animations[2]);
                imv3.startAnimation(animation3);
                Animation animation4 = AnimationUtils.loadAnimation(getApplicationContext(), animations[3]);
                imv4.startAnimation(animation4);
                Animation animation5 = AnimationUtils.loadAnimation(getApplicationContext(), animations[4]);
                imv5.startAnimation(animation5);
                Animation animation6 = AnimationUtils.loadAnimation(getApplicationContext(), animations[5]);
                imv6.startAnimation(animation6);
                Animation animation7 = AnimationUtils.loadAnimation(getApplicationContext(), animations[6]);
                imv7.startAnimation(animation7);
                Animation animation8 = AnimationUtils.loadAnimation(getApplicationContext(), animations[7]);
                imv8.startAnimation(animation8);
            }
        });

    }
}
