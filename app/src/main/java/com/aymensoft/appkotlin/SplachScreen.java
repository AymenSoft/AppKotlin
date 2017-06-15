package com.aymensoft.appkotlin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplachScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splach_screen);
        // METHOD 1

        // After 5 seconds redirect to another intent
        /****** Create Thread that will sleep for 5 seconds *************/
        Thread background = new Thread() {
            public void run() {

                try {
                    // Thread will sleep for 5 seconds
                    sleep(5*1000);

                    Intent i=new Intent(getBaseContext(),Main.class);
                    startActivity(i);

                    //Remove activity
                    finish();

                } catch (Exception e) {

                }
            }
        };


        // start thread
        background.start();
    }
    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}
