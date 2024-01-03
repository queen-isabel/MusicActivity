package com.asuero.queen.music_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Asmr_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asmr_list);

        ImageView backImageView = findViewById(R.id.imageView);

        backImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event, navigate to asmr_list activity
                Intent intent = new Intent(Asmr_list.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}