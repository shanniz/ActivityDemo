package com.example.shan.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d("Activity Event", "onStart of MainActivity");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d("Activity Event", "onResume of MainActivity");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d("Activity Event","onPause of MainActivity");
    }
    public void openSecondActivity(View v){
        Intent intent = new Intent(MainActivity.this,
                UserActivity.class);

        EditText editText = (EditText)
                findViewById(R.id.editText);
        String uname = editText.getText().toString();
        intent.putExtra("username",uname);

        //startActivity(intent);
        startActivityForResult(intent, 2);
    }

    @Override
    public void onActivityResult(int reqCode,
                                 int resCode,
                                 Intent intent){
        String wifiPass =
                intent.getStringExtra("wifi_password");
        Toast.makeText(getApplicationContext(),
                "Wifi Password = "+wifiPass,
                Toast.LENGTH_LONG).show();

    }



}
