package com.example.powerwings;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class naves extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naves);

        findViewById(R.id.imagenaveum)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Dialog dialog = new Dialog(naves.this);
                        dialog.setContentView(R.layout.custom_dialog);

                        ImageView imageView =
                                dialog.findViewById(R.id.imageview_custom_dialog);
                        imageView.setImageResource(R.drawable.tst1);

                        dialog.show();
                    }

                });

        findViewById(R.id.imagenavedois)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Dialog dialog = new Dialog(naves.this);
                        dialog.setContentView(R.layout.custom_dialog2);

                        ImageView imageView =
                                dialog.findViewById(R.id.imageview_custom_dialog2);
                        imageView.setImageResource(R.drawable.tst2);

                        dialog.show();
                    }

                });

        findViewById(R.id.imagenavetres)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Dialog dialog = new Dialog(naves.this);
                        dialog.setContentView(R.layout.custom_dialog3);

                        ImageView imageView =
                                dialog.findViewById(R.id.imageview_custom_dialog3);
                        imageView.setImageResource(R.drawable.tst3);

                        dialog.show();
                    }

                });

    }
    public void MainActivity(View view) {
        Intent in = new Intent(naves.this, MainActivity.class);
        startActivity(in);
    }
}