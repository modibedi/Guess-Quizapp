package com.example.ekasi.guess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Logon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
    }

    public void startActivityCurrentAffairs (View view){

        Intent objIntent1 = new Intent (Logon.this,Currentaffairs.class);
        startActivity(objIntent1);
    }
    public void startActivitySports (View view){

        Intent objIntent3 = new Intent (Logon.this,Sports.class);
        startActivity(objIntent3);
    }
    public void startActivityEntertainment (View view){

        Intent objIntent2 = new Intent (Logon.this,Entertainment.class);
        startActivity(objIntent2);
    }




}
