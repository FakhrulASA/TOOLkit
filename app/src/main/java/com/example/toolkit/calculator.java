package com.example.toolkit;

import android.content.Intent;
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

public class calculator extends AppCompatActivity {
    double ans;
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("BASIC CALCULATOR");
        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.O)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.O));
        }
    }
    public void plus(View v)
    {
        EditText t1 =(EditText)findViewById(R.id.num1);
        EditText t2 =(EditText)findViewById(R.id.num2);
        TextView tv = (TextView)findViewById(R.id.textView3);

        if (t1.length() == 0 | t2.length()==0 ) {
            Toast.makeText(getApplicationContext(), "Enter a valu", Toast.LENGTH_LONG).show();
        } else {

            double num1= Double.parseDouble(t1.getText().toString());
            double num2= Double.parseDouble(t2.getText().toString());
            tv.setText("+");
            ans = num1+num2;
            t1.setText(Double.toString(ans));
            t2.setText("");


        }

    }
    public void minus(View v)
    {
        EditText t1 =(EditText)findViewById(R.id.num1);
        EditText t2 =(EditText)findViewById(R.id.num2);
        TextView tv = (TextView)findViewById(R.id.textView3);

        if (t1.length() == 0 | t2.length()==0 ) {
            Toast.makeText(getApplicationContext(), "Enter a valu", Toast.LENGTH_LONG).show();
        } else {

            double num1= Double.parseDouble(t1.getText().toString());
            double num2= Double.parseDouble(t2.getText().toString());
            tv.setText("-");
            ans = num1-num2;
            t1.setText(Double.toString(ans));
            t2.setText("");


        }

    }
    public void div(View v)
    {
        EditText t1 =(EditText)findViewById(R.id.num1);
        EditText t2 =(EditText)findViewById(R.id.num2);
        TextView tv = (TextView)findViewById(R.id.textView3);

        if (t1.length() == 0 | t2.length()==0 ) {
            Toast.makeText(getApplicationContext(), "Enter a valu", Toast.LENGTH_LONG).show();
        } else {

            double num1= Double.parseDouble(t1.getText().toString());
            double num2= Double.parseDouble(t2.getText().toString());
            tv.setText("/");
            ans = num1/num2;
            t1.setText(Double.toString(ans));
            t2.setText("");


        }

    }
    public void mul(View v)
    {
        EditText t1 =(EditText)findViewById(R.id.num1);
        EditText t2 =(EditText)findViewById(R.id.num2);
        TextView tv = (TextView)findViewById(R.id.textView3);

        if (t1.length() == 0 | t2.length()==0 ) {
            Toast.makeText(getApplicationContext(), "Enter a valu", Toast.LENGTH_LONG).show();
        } else {

            double num1= Double.parseDouble(t1.getText().toString());
            double num2= Double.parseDouble(t2.getText().toString());
            tv.setText("*");
            ans = num1*num2;
            t1.setText(Double.toString(ans));
            t2.setText("");


        }

    }
    public void per(View v)
    {
        EditText t1 =(EditText)findViewById(R.id.num1);
        EditText t2 =(EditText)findViewById(R.id.num2);
        TextView tv = (TextView)findViewById(R.id.textView3);

        if (t1.length() == 0 | t2.length()==0 ) {
            Toast.makeText(getApplicationContext(), "Enter a valu", Toast.LENGTH_LONG).show();
        } else {

            double num1= Double.parseDouble(t1.getText().toString());
            double num2= Double.parseDouble(t2.getText().toString());
            tv.setText("%");
            ans = (num1*num2)/100;
            t1.setText(Double.toString(ans));
            t2.setText("");


        }

    }
    public void cancel (View v)
    {   EditText t1 =(EditText)findViewById(R.id.num1);
        EditText t2 =(EditText)findViewById(R.id.num2);
        t1.setText("0");

        t2.setText("0");

    }
}
