package com.example.powerwings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class minigame extends AppCompatActivity {

    ImageView playBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minigame);

        AppConstants.initialization(this.getApplicationContext());

        playBtn = findViewById(R.id.playBtn);

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(minigame.this, "Play!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(minigame.this, GameActivity.class);
                startActivity(intent);
            }
        });
    }

    public void MainActivity(View view) {
        Intent in = new Intent(minigame.this, MainActivity.class);
        startActivity(in);
    }
}