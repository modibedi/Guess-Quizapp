package com.example.ekasi.guess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Currentaffairs extends AppCompatActivity {

    //RadioButton rbtrue,rbfalse;
    private RadioGroup rgOne;
    private RadioGroup rgtwo;
    private RadioGroup rgthree;
    private RadioGroup rgfour;
    private RadioGroup rgFive;

    TextView tvDisplay;
    int score;
    int score2;
    int score3;
    int score4;
    int score5;
    int totalScore;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currentaffairs);

        rgOne = (RadioGroup) findViewById(R.id.Radiogroup1);
        rgtwo = (RadioGroup) findViewById(R.id.Radiogroup2);
        rgthree = (RadioGroup) findViewById(R.id.Radiogroup3);
        rgfour = (RadioGroup) findViewById(R.id.Radiogroup4);
        rgFive = (RadioGroup) findViewById(R.id.Radiogroup5);

        rgOne.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override


            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rdbLekota) {
                    //do work when radioButton1 is active
                    score = 3;
                } else {
                    score = 0;
                }


            }

        });


        rgtwo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override


            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rdbMpofu) {
                    //do work when radioButton1 is active
                    score2 = 3;
                } else {
                    score2 = 0;
                }


            }
        });


        rgthree.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override


            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rdbDesmond) {
                    //do work when radioButton1 is active
                    score3 = 3;

                } else {
                    score3 = 0;
                }


            }
        });
        rgfour.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override


            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rdb2017) {
                    //do work when radioButton1 is active
                    score4 = 3;


                } else {
                    score4 = 0;
                }


            }
        });

        rgFive.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override


            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rdb2010) {
                    //do work when radioButton1 is active
                    score5 = 3;


                } else {
                    score5 = 0;
                }


            }
        });

    }


    public void submit(View view) {


        totalScore = score + score2 + score3 + score4 + score5;
        Intent stuff = new Intent(Currentaffairs.this, CurrentAffairsResults.class);
        stuff.putExtra("score", totalScore);
        startActivity(stuff);
    }



}