package com.example.yeo.foodapp;

/**
 * Created by Yeo on 12/6/2016.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Yeo on 8/6/2016.
 */
public class TagPage extends Activity {

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        android:setTitle("Tagged");
        setContentView(R.layout.tagged_page);
    }
}
