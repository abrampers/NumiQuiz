package com.example.android.numismaticsquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.numismaticsquiz.R.id.startButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Variable Initialization
        TextView welcomeTV = (TextView)findViewById(R.id.welcome);
        TextView titleTV = (TextView)findViewById(R.id.numismatic);
        TextView creditsTV = (TextView)findViewById(R.id.credits);
        Button startButton = (Button)findViewById(R.id.startButton);

        //Changing the font of each variables
        Typeface regular_font = Typeface.createFromAsset(getAssets(),  "fonts/avenir-light.ttf");

        welcomeTV.setTypeface(regular_font);
        titleTV.setTypeface(regular_font);
        creditsTV.setTypeface(regular_font);
        startButton.setTypeface(regular_font);

        //Function when start button is clicked
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahAktivitas = new Intent(getApplicationContext(),QuizActivity.class);
                startActivity(pindahAktivitas);
            }
        });


    }
}
