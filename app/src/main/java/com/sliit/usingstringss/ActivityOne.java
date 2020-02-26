package com.sliit.usingstringss;

import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;




public class ActivityOne extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    TextView textView2;
    //TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        textView2 = findViewById(R.id.textView2);
        textView2.setText(R.string.mes2);
        Log.d(TAG, "onCreate: text"+textView2.getText().toString());
    }
            }
