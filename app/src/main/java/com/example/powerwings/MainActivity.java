package com.example.powerwings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton botaoWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoWeb = (ImageButton) findViewById(R.id.button_site);

        botaoWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/giviatstudio/")));
            }
        });
    }


    public void historia(View view) {
        Intent in = new Intent(MainActivity.this, historia.class);
        startActivity(in);
    }

    public void minigame(View view) {
        Intent in = new Intent(MainActivity.this, minigame.class);
        startActivity(in);
    }

    public void naves(View view) {
        Intent in = new Intent(MainActivity.this, naves.class);
        startActivity(in);
    }

    public void devs(View view) {
        Intent in = new Intent(MainActivity.this, devs.class);
        startActivity(in);
    }
}