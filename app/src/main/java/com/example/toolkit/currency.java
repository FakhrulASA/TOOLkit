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

public class currency extends AppCompatActivity {
 private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        getSupportActionBar().setTitle("CONVERT CURRENCIES");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.B)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.B));
        }

    }
    public void ustk(View v)
    {
        Intent i = new Intent(this,ustotaka.class);
        startActivity(i);
    }

    public void dhtk(View v)
    {
        Intent i = new Intent(this,dhtotaka.class);
        startActivity(i);
    }
    public void rptk(View v)
    {
        Intent i = new Intent(this,rtotaka.class);
        startActivity(i);
    }

}
