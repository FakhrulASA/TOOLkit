package com.example.toolkit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class degreetofaren extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degreetofaren);
    }

    public void convert(View v)
    {
        EditText a = (EditText)findViewById(R.id.d);
        EditText b = (EditText)findViewById(R.id.f);

        if(a.length()==0 && b.length()== 0)
        {
            Toast.makeText(getApplicationContext(), "Enter a valu", Toast.LENGTH_LONG).show();
        }
        else if (a.length() == 0) {
            double num1 =Double.parseDouble(b.getText().toString());
            double ans= (num1-32)*5/9;
            a.setText(Double.toString(ans));

            b.setText("");

        }
        else if (b.length() == 0) {

                double num2 =Double.parseDouble(a.getText().toString());
                double ans=((num2*9)/5)+32;
                b.setText(Double.toString(ans));
                a.setText("");
            }

        else if(a.length()!=0 && b.length()!= 0)
        {
            Toast.makeText(getApplicationContext(), "Please choose one to convert", Toast.LENGTH_LONG).show();
        }


    }
}
