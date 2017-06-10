package com.example.android.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by SamB64 on 6/8/2017.
 */

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_b);
        Log.d("ActivityB","onCreate");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityB","onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityB","onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityB","onDestroy");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("ActivityB","onPostResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityB","onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityB", "onStart");
    }




}//END class ActivityB

