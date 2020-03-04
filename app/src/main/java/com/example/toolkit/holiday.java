package com.example.toolkit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class holiday extends AppCompatActivity {
    int[] IMAGES = {R.drawable.f21,R.drawable.m17,R.drawable.m26,R.drawable.a14,R.drawable.a21,R.drawable.m1,R.drawable.m19,R.drawable.m31,R.drawable.j1,R.drawable.j56,R.drawable.a12,R.drawable.a15,R.drawable.a24,R.drawable.s10,R.drawable.o10,R.drawable.n10,R.drawable.d16,R.drawable.d25};
    String[] NAMES = {"Internation Mothers Language Day","Father of Nation birthday","Independence Day","Bangali New Year","Sab-E-Barat","May Day","Buddha Purnima","Jannatul Bidha","Night of destiny","Eid Ul Fitr", "Eid Ul Adha","National Mourning Day","Jarmasthami","Ashura","Durga Puza","Eid e milad-un-nabin","Victory Day","Christmas Day"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiday);
        ListView l = (ListView)findViewById(R.id.list1);

        CustomAdapter cust = new CustomAdapter();
        l.setAdapter(cust);
    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.custom,null);
            ImageView  img = (ImageView)view.findViewById(R.id.imageView);
            TextView tv = (TextView)view.findViewById(R.id.textView);
            img.setImageResource(IMAGES[i]);
            tv.setText(NAMES[i]);
            return view;
        }
    }

}
