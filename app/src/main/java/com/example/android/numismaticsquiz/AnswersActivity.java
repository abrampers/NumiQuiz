package com.example.android.numismaticsquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.example.android.numismaticsquiz.R.id.a1;
import static com.example.android.numismaticsquiz.R.id.a10;
import static com.example.android.numismaticsquiz.R.id.a2;
import static com.example.android.numismaticsquiz.R.id.a3;
import static com.example.android.numismaticsquiz.R.id.a4;
import static com.example.android.numismaticsquiz.R.id.a5;
import static com.example.android.numismaticsquiz.R.id.a6;
import static com.example.android.numismaticsquiz.R.id.a8;
import static com.example.android.numismaticsquiz.R.id.a9;
import static com.example.android.numismaticsquiz.R.id.n1;
import static com.example.android.numismaticsquiz.R.id.n10;
import static com.example.android.numismaticsquiz.R.id.n2;
import static com.example.android.numismaticsquiz.R.id.n3;
import static com.example.android.numismaticsquiz.R.id.n4;
import static com.example.android.numismaticsquiz.R.id.n5;
import static com.example.android.numismaticsquiz.R.id.n6;
import static com.example.android.numismaticsquiz.R.id.n7;
import static com.example.android.numismaticsquiz.R.id.n8;
import static com.example.android.numismaticsquiz.R.id.n9;

public class AnswersActivity extends AppCompatActivity {

    //deklarasi variabel
    TextView n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
    Button retryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Answer");

        Typeface regular_font = Typeface.createFromAsset(getAssets(),  "fonts/avenir-light.ttf");

        retryButton = (Button)findViewById(R.id.retry_button);
        retryButton.setTypeface(regular_font);

        n1 = (TextView)findViewById(R.id.n1);
        n2 = (TextView)findViewById(R.id.n2);
        n3 = (TextView)findViewById(R.id.n3);
        n4 = (TextView)findViewById(R.id.n4);
        n5 = (TextView)findViewById(R.id.n5);
        n6 = (TextView)findViewById(R.id.n6);
        n7 = (TextView)findViewById(R.id.n7);
        n8 = (TextView)findViewById(R.id.n8);
        n9 = (TextView)findViewById(R.id.n9);
        n10 = (TextView)findViewById(R.id.n10);

        n1.setTypeface(regular_font);
        n2.setTypeface(regular_font);
        n3.setTypeface(regular_font);
        n4.setTypeface(regular_font);
        n5.setTypeface(regular_font);
        n6.setTypeface(regular_font);
        n7.setTypeface(regular_font);
        n8.setTypeface(regular_font);
        n9.setTypeface(regular_font);
        n10.setTypeface(regular_font);

        i1 = (TextView)findViewById(R.id.i1);
        i2 = (TextView)findViewById(R.id.i2);
        i3 = (TextView)findViewById(R.id.i3);
        i4 = (TextView)findViewById(R.id.i4);
        i5 = (TextView)findViewById(R.id.i5);
        i6 = (TextView)findViewById(R.id.i6);
        i7 = (TextView)findViewById(R.id.i7);
        i8 = (TextView)findViewById(R.id.i8);
        i9 = (TextView)findViewById(R.id.i9);
        i10 = (TextView)findViewById(R.id.i10);

        i1.setTypeface(regular_font);
        i2.setTypeface(regular_font);
        i3.setTypeface(regular_font);
        i4.setTypeface(regular_font);
        i5.setTypeface(regular_font);
        i6.setTypeface(regular_font);
        i7.setTypeface(regular_font);
        i8.setTypeface(regular_font);
        i9.setTypeface(regular_font);
        i10.setTypeface(regular_font);

        a1 = (TextView)findViewById(R.id.a1);
        a2 = (TextView)findViewById(R.id.a2);
        a3 = (TextView)findViewById(R.id.a3);
        a4 = (TextView)findViewById(R.id.a4);
        a5 = (TextView)findViewById(R.id.a5);
        a6 = (TextView)findViewById(R.id.a6);
        a7 = (TextView)findViewById(R.id.a7);
        a8 = (TextView)findViewById(R.id.a8);
        a9 = (TextView)findViewById(R.id.a9);
        a10 = (TextView)findViewById(R.id.a10);

        a1.setTypeface(regular_font);
        a2.setTypeface(regular_font);
        a3.setTypeface(regular_font);
        a4.setTypeface(regular_font);
        a5.setTypeface(regular_font);
        a6.setTypeface(regular_font);
        a7.setTypeface(regular_font);
        a8.setTypeface(regular_font);
        a9.setTypeface(regular_font);
        a10.setTypeface(regular_font);


        Intent getData = getIntent();
        boolean[] jawabBenar = getData.getBooleanArrayExtra("array");

        if (jawabBenar[0])
            a1.setTextColor(getResources().getColor(R.color.correctAnswer));
        else a1.setTextColor(getResources().getColor(R.color.wrongAnswer));

        if (jawabBenar[1])
            a2.setTextColor(getResources().getColor(R.color.correctAnswer));
        else a2.setTextColor(getResources().getColor(R.color.wrongAnswer));

        if (jawabBenar[2])
            a3.setTextColor(getResources().getColor(R.color.correctAnswer));
        else a3.setTextColor(getResources().getColor(R.color.wrongAnswer));

        if (jawabBenar[3])
            a4.setTextColor(getResources().getColor(R.color.correctAnswer));
        else a4.setTextColor(getResources().getColor(R.color.wrongAnswer));

        if (jawabBenar[4])
            a5.setTextColor(getResources().getColor(R.color.correctAnswer));
        else a5.setTextColor(getResources().getColor(R.color.wrongAnswer));

        if (jawabBenar[5])
            a6.setTextColor(getResources().getColor(R.color.correctAnswer));
        else a6.setTextColor(getResources().getColor(R.color.wrongAnswer));

        if (jawabBenar[6])
            a7.setTextColor(getResources().getColor(R.color.correctAnswer));
        else a7.setTextColor(getResources().getColor(R.color.wrongAnswer));

        if (jawabBenar[7])
            a8.setTextColor(getResources().getColor(R.color.correctAnswer));
        else a8.setTextColor(getResources().getColor(R.color.wrongAnswer));

        if (jawabBenar[8])
            a9.setTextColor(getResources().getColor(R.color.correctAnswer));
        else a9.setTextColor(getResources().getColor(R.color.wrongAnswer));

        if (jawabBenar[9])
            a10.setTextColor(getResources().getColor(R.color.correctAnswer));
        else a10.setTextColor(getResources().getColor(R.color.wrongAnswer));

        retryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pindahAktivitas = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(pindahAktivitas);
                finish();

            }
        });

    }
}
