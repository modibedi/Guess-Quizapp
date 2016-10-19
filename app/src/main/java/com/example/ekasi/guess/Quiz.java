package com.example.ekasi.guess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logon);
    }
    public void startActivityLogOn (View view){

        Intent objIntent = new Intent (Quiz.this,Logon.class);
      startActivity(objIntent);
    }
}
