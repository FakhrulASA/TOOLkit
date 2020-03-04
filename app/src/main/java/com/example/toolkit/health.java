package com.example.toolkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class health extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
    }
    public void bmi(View v)
    {
        Intent i = new Intent(this,bmi.class);
        startActivity(i);
    }
    public void bmis(View v)
    {
        Intent i = new Intent(this,medicine.class);
        startActivity(i);
    }
}
