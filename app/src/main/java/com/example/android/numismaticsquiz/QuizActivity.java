package com.example.android.numismaticsquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.IdRes;
import android.support.v4.text.TextUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.x;
import static android.R.string.no;
import static com.example.android.numismaticsquiz.R.id.startButton;

public class QuizActivity extends AppCompatActivity {

    //deklarasi variabel
    RadioGroup no1
            , no2
            , no3
            , no4
            , no6
            , no7
            , no9
            , no10;
    RadioButton no1_a,no1_b,no1_c,no1_d,no2_a,no2_b,no2_c,no2_d,no3_a,no3_b,no3_c,no3_d,no4_a,no4_b,no4_c,no4_d,no6_a,no6_b,no6_c,no6_d,no7_a,no7_b,no7_c,no7_d,no9_a,no9_b,no9_c,no9_d,no10_a,no10_b,n
            ,no10_c,no10_d;
    Button submitButton;
    EditText no5;
    CheckBox boxSlovenia
            ,boxSwitzerland
            ,boxSpain
            ,boxSweden;

    TextView n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;

    boolean no1Clicked = false;
    boolean no2Clicked = false;
    boolean no3Clicked = false;
    boolean no4Clicked = false;
    boolean no6Clicked = false;
    boolean no7Clicked = false;
    boolean no9Clicked = false;
    boolean no10Clicked = false;

    boolean[] jawabBenar = {false,false,false,false,false,false,false,false,false,false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Questions");

        Typeface regular_font = Typeface.createFromAsset(getAssets(),  "fonts/avenir-light.ttf");

        no1 = (RadioGroup)findViewById(R.id.q1);
        no2 = (RadioGroup)findViewById(R.id.q2);
        no3 = (RadioGroup)findViewById(R.id.q3);
        no4 = (RadioGroup)findViewById(R.id.q4);
        no6 = (RadioGroup)findViewById(R.id.q6);
        no7 = (RadioGroup)findViewById(R.id.q7);
        no10 = (RadioGroup)findViewById(R.id.q10);
        no9 = (RadioGroup)findViewById(R.id.q9);

        no1_a = (RadioButton)findViewById(R.id.q1_a);
        no1_a.setTypeface(regular_font);
        no1_b = (RadioButton)findViewById(R.id.q1_b);
        no1_b.setTypeface(regular_font);
        no1_c = (RadioButton)findViewById(R.id.q1_c);
        no1_c.setTypeface(regular_font);
        no1_d = (RadioButton)findViewById(R.id.q1_d);
        no1_d.setTypeface(regular_font);

        no2_a = (RadioButton)findViewById(R.id.q2_a);
        no2_b = (RadioButton)findViewById(R.id.q2_b);
        no2_c = (RadioButton)findViewById(R.id.q2_c);
        no2_d = (RadioButton)findViewById(R.id.q2_d);
        no2_a.setTypeface(regular_font);
        no2_b.setTypeface(regular_font);
        no2_c.setTypeface(regular_font);
        no2_d.setTypeface(regular_font);

        no3_a = (RadioButton)findViewById(R.id.q3_a);
        no3_b = (RadioButton)findViewById(R.id.q3_b);
        no3_c = (RadioButton)findViewById(R.id.q3_c);
        no3_d = (RadioButton)findViewById(R.id.q3_d);
        no3_a.setTypeface(regular_font);
        no3_b.setTypeface(regular_font);
        no3_c.setTypeface(regular_font);
        no3_d.setTypeface(regular_font);

        no4_a = (RadioButton)findViewById(R.id.q4_a);
        no4_b = (RadioButton)findViewById(R.id.q4_b);
        no4_c = (RadioButton)findViewById(R.id.q4_c);
        no4_d = (RadioButton)findViewById(R.id.q4_d);
        no4_a.setTypeface(regular_font);
        no4_b.setTypeface(regular_font);
        no4_c.setTypeface(regular_font);
        no4_d.setTypeface(regular_font);

        no6_a = (RadioButton)findViewById(R.id.q6_a);
        no6_b = (RadioButton)findViewById(R.id.q6_b);
        no6_c = (RadioButton)findViewById(R.id.q6_c);
        no6_d = (RadioButton)findViewById(R.id.q6_d);
        no6_a.setTypeface(regular_font);
        no6_b.setTypeface(regular_font);
        no6_c.setTypeface(regular_font);
        no6_d.setTypeface(regular_font);

        no7_a = (RadioButton)findViewById(R.id.q7_a);
        no7_b = (RadioButton)findViewById(R.id.q7_b);
        no7_c = (RadioButton)findViewById(R.id.q7_c);
        no7_d = (RadioButton)findViewById(R.id.q7_d);
        no7_a.setTypeface(regular_font);
        no7_b.setTypeface(regular_font);
        no7_c.setTypeface(regular_font);
        no7_d.setTypeface(regular_font);

        no9_a = (RadioButton)findViewById(R.id.q9_a);
        no9_b = (RadioButton)findViewById(R.id.q9_b);
        no9_c = (RadioButton)findViewById(R.id.q9_c);
        no9_d = (RadioButton)findViewById(R.id.q9_d);
        no9_a.setTypeface(regular_font);
        no9_b.setTypeface(regular_font);
        no9_c.setTypeface(regular_font);
        no9_d.setTypeface(regular_font);

        no10_a = (RadioButton)findViewById(R.id.q10_a);
        no10_b = (RadioButton)findViewById(R.id.q10_b);
        no10_c = (RadioButton)findViewById(R.id.q10_c);
        no10_d = (RadioButton)findViewById(R.id.q10_d);
        no10_a.setTypeface(regular_font);
        no10_b.setTypeface(regular_font);
        no10_c.setTypeface(regular_font);
        no10_d.setTypeface(regular_font);


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

        no5 = (EditText)findViewById(R.id.q5);
        no5.setTypeface(regular_font);
        boxSlovenia = (CheckBox)findViewById(R.id.slovenia);
        boxSlovenia.setTypeface(regular_font);
        boxSpain = (CheckBox)findViewById(R.id.spain);
        boxSpain.setTypeface(regular_font);
        boxSweden = (CheckBox)findViewById(R.id.sweden);
        boxSweden.setTypeface(regular_font);
        boxSwitzerland = (CheckBox)findViewById(R.id.switzerland);
        boxSwitzerland.setTypeface(regular_font);

        submitButton = (Button)findViewById(R.id.submit_button);
        submitButton.setTypeface(regular_font);



        //Question 1
        no1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                no1Clicked = true;

                if (i == R.id.q1_b)
                    jawabBenar[0] = true;
                else jawabBenar[0] = false;

            }
        });


        //Question 2
        no2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                no2Clicked = true;
                if (i == R.id.q2_a)
                    jawabBenar[1] = true;
                else jawabBenar[1] = false;

            }
        });

        //Question3
        no3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                no3Clicked = true;
                if (i == R.id.q3_c)
                    jawabBenar[2] = true;
                else jawabBenar[2] = false;
            }
        });

        //Question4
        no4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                no4Clicked = true;
                if (i == R.id.q4_a)
                    jawabBenar[3] = true;
                else jawabBenar[3] = false;
            }
        });

        //Question5

        //Question6
        no6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                no6Clicked = true;
                if (i == R.id.q6_c)
                    jawabBenar[5] = true;
                else jawabBenar[5] = false;
            }
        });

        //Question7
        no7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                no7Clicked = true;
                if (i == R.id.q7_c)
                    jawabBenar[6] = true;
                else jawabBenar[6] = false;
            }
        });

        //Question8

        //Question9
        no9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                no9Clicked = true;
                if (i == R.id.q9_d)
                    jawabBenar[8] = true;
                else jawabBenar[8] = false;
            }
        });

        //Question9
        no10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                no10Clicked = true;
                if (i == R.id.q10_a)
                    jawabBenar[9] = true;
                else jawabBenar[9] = false;
            }
        });

        //Switch Activity
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int jumlahBenar = 0;

                String ans5 = no5.getText().toString();

                if (!no1Clicked)
                    Toast.makeText(getApplicationContext(), "Question no 1 is not answered", Toast.LENGTH_SHORT).show();
                else if (!no2Clicked)
                    Toast.makeText(getApplicationContext(), "Question no 2 is not answered", Toast.LENGTH_SHORT).show();
                else if (!no3Clicked)
                    Toast.makeText(getApplicationContext(), "Question no 3 is not answered", Toast.LENGTH_SHORT).show();
                else if (!no4Clicked)
                    Toast.makeText(getApplicationContext(), "Question no 4 is not answered", Toast.LENGTH_SHORT).show();
                else if (TextUtils.isEmpty(no5.getText()))
                    Toast.makeText(getApplicationContext(), "Question no 5 is not answered", Toast.LENGTH_SHORT).show();
                else if (!no6Clicked)
                    Toast.makeText(getApplicationContext(), "Question no 6 is not answered", Toast.LENGTH_SHORT).show();
                else if (!no7Clicked)
                    Toast.makeText(getApplicationContext(), "Question no 7 is not answered", Toast.LENGTH_SHORT).show();
                else if (!no9Clicked)
                    Toast.makeText(getApplicationContext(), "Question no 9 is not answered", Toast.LENGTH_SHORT).show();
                else if (!no10Clicked)
                    Toast.makeText(getApplicationContext(), "Question no 10 is not answered", Toast.LENGTH_SHORT).show();
                else {

                    //Question 5
                    ans5 = ans5.toLowerCase();
                    if (ans5.equals("gold"))
                        jawabBenar[4] = true;
                    else jawabBenar[4] = false;

                    //Question 8
                    if (boxSlovenia.isChecked() && boxSpain.isChecked() && !boxSwitzerland.isChecked() && !boxSweden.isChecked())
                        jawabBenar[7] = true;
                    else jawabBenar[7] = false;

                    //Sum of Correct Answer
                    for (int i = 0; i < jawabBenar.length; i++) {

                        if (jawabBenar[i])
                            jumlahBenar++;

                    }

                    double score = jumlahBenar * 100 / jawabBenar.length;


                    Intent pindahAktivitas = new Intent(getApplicationContext(),ResultActivity.class);
                    pindahAktivitas.putExtra("score",score);
                    pindahAktivitas.putExtra("array", jawabBenar);
                    startActivity(pindahAktivitas);
                    finish();

                }


            }
        });
    }
}
