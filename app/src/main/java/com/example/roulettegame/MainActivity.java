package com.example.roulettegame;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView iVRoulette;
    float startDegree = 0f;
    float endDegree = 0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iVRoulette = findViewById(R.id.roulette);
    }
    public void rotate(View v) {
        startDegree = endDegree;
        Random rand = new Random();
        int degree_rand = rand.nextInt(360);
        endDegree = startDegree + 360*3 + degree_rand;
        ObjectAnimator object = ObjectAnimator.ofFloat(iVRoulette, "rotation",
                startDegree, endDegree);
        object.setInterpolator(new AccelerateDecelerateInterpolator());
        object.setDuration(5000);
        object.start();
    }
}