package com.example.shan.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("Activity Event", "onDestroy of SecondActivity");


    }

    public void closeActivity(View v){

        this.finish();
    }

    public void readUserName(View v){
    }

}
