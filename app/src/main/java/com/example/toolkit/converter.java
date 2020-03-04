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

public class converter extends AppCompatActivity {
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        getSupportActionBar().setTitle("Converter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.G)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.G));
        }
    }
    public void L(View v)
    {
        Intent i = new Intent(this,weigth.class);
        startActivity(i);
    }
    public void C(View v)
    {
        Intent i = new Intent(this,currency.class);
        startActivity(i);
    }
    public void W(View v)
    {
        Intent i = new Intent(this,weigthr.class);
        startActivity(i);
    }
    public void T(View v)
    {
        Intent i = new Intent(this,tempe.class);
        startActivity(i);
    }
}
