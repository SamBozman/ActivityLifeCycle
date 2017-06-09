package com.example.android.activitylifecycle;

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
    }

    // android:onClick="buttonHandlerB" in XML design file
    public void buttonHandlerB(View v) {

        switch (v.getId()) {
            case R.id.button_a:
                Log.i("Bozman", "Button A was clicked!");
                break;


            case R.id.button_b:
                Log.i("Bozman", "Button B was clicked!");
                break;
        }


    }
}
