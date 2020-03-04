package com.example.toolkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clicks(View v)
    {
        Intent i = new Intent(this,converter.class);
        startActivity(i);
    }
    public void holiday(View v)
    {
        Intent j = new Intent(this,holiday.class);
        startActivity(j);
    }
    public void calculator(View v)
    {
        Intent i = new Intent(this,calculator.class);
        startActivity(i);
    }
    public void news(View v)
    {
        Intent i = new Intent(this,newspaper.class);
        startActivity(i);
    }
    public void health(View v)
    {
        Intent i = new Intent(this,health.class);
        startActivity(i);
    }
}
