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

public class weigthr extends AppCompatActivity {
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_weigthr);
        getSupportActionBar().setTitle("CONVERT WEIGTH's");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weigthr);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.R)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.R1));
        }
    }

    public void kgtow(View v)
    {
        Intent i= new Intent(this,kggm.class);
        startActivity(i);
    }
    public void pg(View v)
    {
        Intent i= new Intent(this,ptogm.class);
        startActivity(i);
    }
    public void kg(View v)
    {
        Intent i= new Intent(this,ptokg.class);
        startActivity(i);
    }


}
