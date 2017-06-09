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
    }

    // android:onClick="buttonHandlerA" in XML design file
    public void buttonHandlerB(View v) {

        if(v.getId()==R.id.button_b){
            Log.i("Bozman", "Button B was clicked!");
            Intent i = new Intent (ActivityB.this, ActivityA.class);
            startActivity(i);
        }//END if

    }//END buttonHandlerB

}//END class ActivityB

