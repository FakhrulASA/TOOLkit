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
import android.widget.Toast;

public class kggm extends AppCompatActivity {
private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kggm);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("KILOGRAM - GRAM");
        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.V)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.V1));
        }
    }
    public void convertos(View v)
    {
        EditText a = (EditText)findViewById(R.id.k);
        EditText b = (EditText)findViewById(R.id.f);

        if(a.length()==0 && b.length()== 0)
        {
            Toast.makeText(getApplicationContext(), "Enter a valu", Toast.LENGTH_LONG).show();
        }
        else if (a.length() == 0) {
            double num1 =Double.parseDouble(b.getText().toString());
            double ans=num1/1000;
            a.setText(Double.toString(ans));

            b.setText("");

        }
        else if (b.length() == 0) {

            double num2 =Double.parseDouble(a.getText().toString());
            double ans=num2*1000;
            b.setText(Double.toString(ans));
            a.setText("");
        }

        else if(a.length()!=0 && b.length()!= 0)
        {
            Toast.makeText(getApplicationContext(), "Please choose one to convert", Toast.LENGTH_LONG).show();
        }


    }
}
