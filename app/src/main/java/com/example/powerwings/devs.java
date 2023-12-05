package com.example.powerwings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class devs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devs);
    }

    public void MainActivity(View view) {
        Intent in = new Intent(devs.this, MainActivity.class);
        startActivity(in);
    }
}