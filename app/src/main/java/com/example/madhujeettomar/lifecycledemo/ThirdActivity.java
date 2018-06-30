package com.example.madhujeettomar.lifecycledemo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    private static String TAG="ThirdActivity";
    Button callFirstScreen;
    Button callSecondScreen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.d(TAG, "onCreate: "+"Called");
        callSecondScreen=(Button)findViewById(R.id.btn_secondd_screen_clicked);
        callSecondScreen.setOnClickListener(this);
        callFirstScreen=(Button)findViewById(R.id.btn_first_clicked_frm_third);
        callFirstScreen.setOnClickListener(this);
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
            case(R.id.btn_first_clicked_frm_third):
               startActivity(new Intent(ThirdActivity.this,MainActivity.class));
               finish();
               break;

            case(R.id.btn_secondd_screen_clicked):
                startActivity(new Intent(ThirdActivity.this,SecondActivity.class));
                finish();
                break;

            case(R.id.btn_show_alert):
                showAlert();
                break;
        }
    }

    private void showAlert() {

        AlertDialog alertDialog = new AlertDialog.Builder(
                ThirdActivity.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("Alert Dialog");

        // Setting Dialog Message
        alertDialog.setMessage("Welcome to AndroidHive.info");

        // Setting Icon to Dialog
       // alertDialog.setIcon(R.drawable.tick);

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
                Toast.makeText(getApplicationContext(), "You clicked on OK", Toast.LENGTH_SHORT).show();
            }
        });

        // Showing Alert Message
        alertDialog.show();

    }


}
/**
 * Being in Third screen, if application will go in background and when come back in foreground then following method will call
 * 06-30 18:06:07.115 12504-12504/com.example.madhujeettomar.lifecycledemo D/ThirdActivity: onPause: Called
   06-30 18:06:07.435 12504-12504/com.example.madhujeettomar.lifecycledemo D/ThirdActivity: onStop: Called
   06-30 18:06:18.178 12504-12504/com.example.madhujeettomar.lifecycledemo D/ThirdActivity: onStart: Called
   06-30 18:06:18.178 12504-12504/com.example.madhujeettomar.lifecycledemo D/ThirdActivity: onResume: Called
 *
 */

/**
 * If we go to second activity then following state will call
 * 06-30 18:09:38.202 12504-12504/com.example.madhujeettomar.lifecycledemo D/ThirdActivity: onPause: Called
 06-30 18:09:38.232 12504-12504/com.example.madhujeettomar.lifecycledemo D/SecondActivity: onCreate: Called
 06-30 18:09:38.234 12504-12504/com.example.madhujeettomar.lifecycledemo D/SecondActivity: onStart: Called
 06-30 18:09:38.235 12504-12504/com.example.madhujeettomar.lifecycledemo D/SecondActivity: onResume: Called
 06-30 18:09:39.889 12504-12504/com.example.madhujeettomar.lifecycledemo D/ThirdActivity: onStop: Called

 if we use finish() while calling intent then
 06-30 18:09:38.202 12504-12504/com.example.madhujeettomar.lifecycledemo D/ThirdActivity: onPause: Called
 06-30 18:09:38.232 12504-12504/com.example.madhujeettomar.lifecycledemo D/SecondActivity: onCreate: Called
 06-30 18:09:38.234 12504-12504/com.example.madhujeettomar.lifecycledemo D/SecondActivity: onStart: Called
 06-30 18:09:38.235 12504-12504/com.example.madhujeettomar.lifecycledemo D/SecondActivity: onResume: Called
 06-30 18:09:39.889 12504-12504/com.example.madhujeettomar.lifecycledemo D/ThirdActivity: onStop: Called
 onDestroy: Called
 */
/**
 * calling first activity from third
 *06-30 18:16:56.052 12504-12504/com.example.madhujeettomar.lifecycledemo D/ThirdActivity: onPause: Called
 06-30 18:16:56.142 12504-12504/com.example.madhujeettomar.lifecycledemo D/MainActivity: onCreate: Called
 06-30 18:16:56.144 12504-12504/com.example.madhujeettomar.lifecycledemo D/MainActivity: onStart: Called
 06-30 18:16:56.146 12504-12504/com.example.madhujeettomar.lifecycledemo D/MainActivity: onResume: Called
 06-30 18:16:57.243 12504-12504/com.example.madhujeettomar.lifecycledemo D/ThirdActivity: onStop: Called
 onDestroy: Called
 *
 */

