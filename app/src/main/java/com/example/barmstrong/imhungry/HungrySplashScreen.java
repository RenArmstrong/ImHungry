package com.example.barmstrong.imhungry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

/**
 * Created by barmstrong on 20/12/2017.
 */
//Splash Screen for "I'm Hungry" Application
public class HungrySplashScreen extends Activity {

    //Duration of wait
    private static final int SPLASH_DISPLAY_LENGTH = 1000;

    //Called when activity is first created
    @Override
    public void onCreate(Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
//Start new menu-activity as well as close the splash-screen after few seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //create an intent to start the menu activity
                Intent mainIntent = new Intent(HungrySplashScreen.this, Menu.class);
                HungrySplashScreen.this.startActivity(mainIntent);
                HungrySplashScreen.this.finish();
            }
        },SPLASH_DISPLAY_LENGTH);
    }
}
