package com.example.light.lesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        TextView tView = (TextView)findViewById(R.id.textView);
        String data = getIntent().getExtras().getString("transfer");

        //myText = new TextView();
        tView.setText(data);


    }


}
