package com.example.android.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityA extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_a);
        }

        // android:onClick="buttonHandlerA" in XML design file
        public void buttonHandlerA(View v) {

            if(v.getId()==R.id.button_a){
                    Log.i("Bozman", "Button A was clicked!");

            }//END if

        }//END buttonHandlerA

}//END class ActivityA
