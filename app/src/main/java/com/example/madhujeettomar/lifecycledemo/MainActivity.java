package com.example.madhujeettomar.lifecycledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static String TAG="MainActivity";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: "+"Called");
        button=(Button)findViewById(R.id.btn_clicked);
        button.setOnClickListener(this);
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

    /**
     *
     * Once app went in background the following lifecycle methods called
     * onPause: Called
       onStop: Called
     *Well once the app come back in foreground following methods called
     * onRestart: Called
     onStart: Called
     onResume: Called
     *
     *
     *
     *
     */
    /**
     * onClick of clicked button the second activity called, in such case Main activity and second activity
     * called following methods
     * 06-30 17:49:30.523 12221-12221/com.example.madhujeettomar.lifecycledemo D/MainActivity: onPause: Called
     06-30 17:49:30.564 12221-12221/com.example.madhujeettomar.lifecycledemo D/SecondActivity: onCreate: Called
     06-30 17:49:30.579 12221-12221/com.example.madhujeettomar.lifecycledemo D/SecondActivity: onStart: Called
     06-30 17:49:30.580 12221-12221/com.example.madhujeettomar.lifecycledemo D/SecondActivity: onResume: Called
     06-30 17:49:31.673 12221-12221/com.example.madhujeettomar.lifecycledemo D/MainActivity: onStop: Called

     *
     */


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: "+"Called");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_clicked:
                startActivity(new Intent(MainActivity.this, SecondActivity.class ));
                break;
        }
    }
}
