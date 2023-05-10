package com.verizon.androidactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "ActivityLifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate Invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart Invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume Invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause Invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop Invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart Invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy Invoked");
    }
}