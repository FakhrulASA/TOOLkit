package com.example.toolkit;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class bmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("BASIC CALCULATOR");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.O)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.O));
        }
    }

    public void calculatebmi(View v) {
        EditText h = (EditText) findViewById(R.id.height);
        EditText w = (EditText) findViewById(R.id.weighth);
        EditText a = (EditText) findViewById(R.id.age);
        TextView an = (TextView) findViewById(R.id.anss);
        if (a.length() == 0 || h.length() == 0 || w.length() == 0) {
            Toast.makeText(getApplicationContext(), "Value is missing", Toast.LENGTH_LONG).show();
        } else {
            DecimalFormat df = new DecimalFormat("#.##");
            double heigth = Double.parseDouble(h.getText().toString());
            double weigth = Double.parseDouble(w.getText().toString());
            double bmi = (weigth / (heigth * heigth));
            if (bmi > 25 && bmi <30) {
                an.setText("BMI=" + Double.parseDouble(df.format(bmi)) + " kg/m2 \n You are overweigth");
            } else if (bmi >= 18.5 && bmi <= 25) {
                an.setText("BMI=" + Double.parseDouble(df.format(bmi)) + " kg/m2 \n You are normal");
            } else if (bmi <= 18) {
                an.setText("BMI=" + Double.parseDouble(df.format(bmi)) + " kg/m2 \n You are underweigth");
            } else if (bmi > 30) {
                an.setText("BMI=" + Double.parseDouble(df.format(bmi)) + " kg/m2 \n Obesity");
            }

        }
    }
}
