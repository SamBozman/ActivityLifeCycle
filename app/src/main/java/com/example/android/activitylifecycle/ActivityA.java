package com.example.android.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityA extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_a);
        Log.d("ActivityA","onCreate");
        }

        // android:onClick="buttonHandlerA" in XML design file
        public void buttonHandlerA(View v) {

            if(v.getId()==R.id.button_a){
                    Log.i("Bozman", "Button A was clicked!");
            Intent i = new Intent (ActivityA.this, ActivityB.class);
            startActivity(i);

            }//END if

        }//END buttonHandlerA

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityA","onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityA","onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityA","onDestroy");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("ActivityA","onPostResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityA","onRestart");
    }

}//END class ActivityA
