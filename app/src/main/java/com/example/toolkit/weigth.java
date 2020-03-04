package com.example.toolkit;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

public class weigth extends AppCompatActivity {
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weigth);
        getSupportActionBar().setTitle("CONVERT DISTANCE");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.B)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.V1));
        }
        ActionBar.LayoutParams p = new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        p.gravity = Gravity.CENTER;
    }
    public void mtkm(View v)
    {
        Intent i = new Intent(this,mtcm.class);
        startActivity(i);
    }

    public void mkm(View v)
    {
        Intent i = new Intent(this,milekm.class);
        startActivity(i);
    }
    public void fch(View v)
    {
        Intent i = new Intent(this,ftinch.class);
        startActivity(i);
    }
    public void inmm(View v)
    {
        Intent i = new Intent(this,inmm.class);
        startActivity(i);
    }

}
