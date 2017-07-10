//Git change Test

package com.example.android.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

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

                //Example of putting a quick (Toast) message on to the screen
                Toast myToast = Toast.makeText(ActivityA.this,
                        "Button was pressed on ActivityA screen!",Toast.LENGTH_LONG);
                //set.Gravity is optional. Without it the message will print on the bottom of the screen
                myToast.setGravity(Gravity.TOP,100,100);
                myToast.show();


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
        Log.d("ActivityA","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityA","onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityA", "onStart");
    }
}//END class ActivityA
