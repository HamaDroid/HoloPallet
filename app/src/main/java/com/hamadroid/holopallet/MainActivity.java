package com.hamadroid.holopallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void about(View v) {
        Intent intent = new Intent(getApplicationContext(), about.class);
        startActivity(intent);
    }
}
