package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonRollBall = (Button) findViewById(R.id.button_AskBall);

        final ImageView imageMagicBall = (ImageView) findViewById(R.id.image_Ball);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        buttonRollBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("8Ball","Button pressed");

                Random randomNumberGenerator = new Random();

                int randomBallImage = randomNumberGenerator.nextInt(5);
                Log.d("8Ball","Ball Image Selected: "+ randomBallImage);
                imageMagicBall.setImageResource(ballArray[randomBallImage]);
            }
        });
    }
}
