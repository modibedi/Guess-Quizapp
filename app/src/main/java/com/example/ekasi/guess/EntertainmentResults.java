package com.example.ekasi.guess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class EntertainmentResults extends AppCompatActivity {

    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_results);
        Bundle thing = getIntent().getExtras();
        int score = thing.getInt("score");

        resultTextView = (TextView) findViewById(R.id.results);
        resultTextView.setText(" "+score);


    }



}
