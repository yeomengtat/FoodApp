package com.example.yeo.foodapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Yeo on 8/6/2016.
 */
public class SubmitPage extends Activity {

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        android:setTitle("Submit Restaurant");
        setContentView(R.layout.submit_restaurant_page);
    }
}
