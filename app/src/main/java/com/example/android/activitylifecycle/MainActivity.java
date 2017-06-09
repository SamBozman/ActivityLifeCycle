package com.example.android.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // android:onClick="buttonHandlerA" in XML design file
    public void buttonHandlerA(View v) {

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
