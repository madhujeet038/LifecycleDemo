package com.example.madhujeettomar.lifecycledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private static String TAG="SecondActivity";
    Button callFirstScreen;
    Button callThirdScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "onCreate: "+"Called");
        callFirstScreen=(Button)findViewById(R.id.btn_first_clicked);
        callFirstScreen.setOnClickListener(this);
        callThirdScreen=(Button)findViewById(R.id.btn_third_screen_clicked);
        callThirdScreen.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart: "+"Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: "+"Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: "+"Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: "+"Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: "+"Called");
    }


    @Override
    public void onClick(View view) {
switch(view.getId())
{
    case R.id.btn_first_clicked:
        startActivity(new Intent(SecondActivity.this,MainActivity.class));
        break;
    case R.id.btn_third_screen_clicked:
        startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
        break;
}
    }
/**
 * On Backpressed following method will call
 06-30 17:26:38.876 11737-11737/com.example.madhujeettomar.lifecycledemo D/SecondActivity: onPause: Called
 06-30 17:26:38.934 11737-11737/com.example.madhujeettomar.lifecycledemo D/MainActivity: onRestart: Called
 06-30 17:26:38.964 11737-11737/com.example.madhujeettomar.lifecycledemo D/MainActivity: onStart: Called
 06-30 17:26:38.965 11737-11737/com.example.madhujeettomar.lifecycledemo D/MainActivity: onResume: Called
 06-30 17:26:40.379 11737-11737/com.example.madhujeettomar.lifecycledemo D/SecondActivity: onStop: Called
 06-30 17:26:40.379 11737-11737/com.example.madhujeettomar.lifecycledemo D/SecondActivity: onDestroy: Called
 */

/**
 * calling third Activity following method will call after on Resume
 * 06-30 18:03:58.477 12504-12504/com.example.madhujeettomar.lifecycledemo D/SecondActivity: onPause: Called
 06-30 18:03:58.527 12504-12504/com.example.madhujeettomar.lifecycledemo D/ThirdActivity: onCreate: Called
 06-30 18:03:58.528 12504-12504/com.example.madhujeettomar.lifecycledemo D/ThirdActivity: onStart: Called
 06-30 18:03:58.539 12504-12504/com.example.madhujeettomar.lifecycledemo D/ThirdActivity: onResume: Called
 06-30 18:03:59.936 12504-12504/com.example.madhujeettomar.lifecycledemo D/SecondActivity: onStop: Called
 */


}
