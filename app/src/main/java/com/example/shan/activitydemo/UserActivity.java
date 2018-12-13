package com.example.shan.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }

    public void closeActivity(View v){
        Intent resultIntent = new Intent();
        resultIntent.putExtra("wifi_password","1234567");
        setResult(RESULT_OK, resultIntent);
        finish();
    }

    public void getUserName(View v){
        Intent i = getIntent();
        String uname = i.getStringExtra("username");
        Toast.makeText(getApplicationContext(), uname,
                Toast.LENGTH_LONG).show();

    }
}
