package com.telran.implicitintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String action = intent.getAction();
        if(action.equals("telran.com.second.activity")){
            Toast.makeText(this, "telran.com.second.activity", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "telran.com.third.activity", Toast.LENGTH_SHORT).show();
        }
    }
}
