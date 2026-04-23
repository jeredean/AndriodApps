package com.example.lifecycledemo;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView lifecycleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lifecycleTextView = findViewById(R.id.lifecycleTextView);
        lifecycleTextView.setText("Activity Created");
        Log.d(TAG, "onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        lifecycleTextView.setText("Activity Started");
        Log.d(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        lifecycleTextView.setText("Activity Resumed");
        Log.d(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        lifecycleTextView.setText("Activity Paused");
        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        lifecycleTextView.setText("Activity Stopped");
        Log.d(TAG, "onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        lifecycleTextView.setText("Activity Restarted");
        Log.d(TAG, "onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        lifecycleTextView.setText("Activity Destroyed");
        Log.d(TAG, "onDestroy called");
    }
}
