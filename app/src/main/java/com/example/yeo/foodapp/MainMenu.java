package com.example.yeo.foodapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Yeo on 8/6/2016.
 */
public class MainMenu extends Activity {

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setTitle("Main Menu");
        setContentView(R.layout.main_menu);
    }
}
