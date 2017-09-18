package com.example.android.numismaticsquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView txtHasil;
    TextView titleHasil;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //Changing the font of each variables
        Typeface regular_font = Typeface.createFromAsset(getAssets(),  "fonts/avenir-light.ttf");

        txtHasil = (TextView)findViewById(R.id.teks_hasil);
        titleHasil = (TextView)findViewById(R.id.result_title) ;
        nextButton = (Button)findViewById(R.id.next_button);

        txtHasil.setTypeface(regular_font);
        nextButton.setTypeface(regular_font);
        titleHasil.setTypeface(regular_font);

        Intent getData = getIntent();
        double score = getData.getDoubleExtra("score", 0);
        final boolean[] jawabBenar = getData.getBooleanArrayExtra("array");

        txtHasil.setText("" + score + "");

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pindahAktivitas = new Intent(getApplicationContext(),AnswersActivity.class);
                pindahAktivitas.putExtra("array", jawabBenar);
                startActivity(pindahAktivitas);

            }
        });

    }
}
