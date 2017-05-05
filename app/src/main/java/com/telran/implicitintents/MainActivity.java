package com.telran.implicitintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button senFirstAction = (Button) findViewById(R.id.send_first_btn);
        Button sendSecondAction = (Button) findViewById(R.id.send_second_btn);
        senFirstAction.setOnClickListener(this);
        sendSecondAction.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.send_first_btn:
                Intent intent = new Intent("telran.com.second.activity");
                startActivity(intent);
                break;
            case R.id.send_second_btn:
                Intent intent1 = new Intent("telran.com.third.activity");
                startActivity(intent1);
                break;
        }
    }
}
