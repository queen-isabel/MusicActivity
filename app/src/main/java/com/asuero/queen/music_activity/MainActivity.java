package com.asuero.queen.music_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] musicItemIds = {R.id.asmrmusic1};

        for (int musicItemId : musicItemIds) {
            ImageView musicItem = findViewById(musicItemId);
            setMusicItemOnClickListener(musicItem);
        }
    }

    private void setMusicItemOnClickListener(ImageView musicItem) {
        musicItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event, navigate to PlayMusicActivity
                Intent intent = new Intent(MainActivity.this, Play_music.class);
                startActivity(intent);
            }
        });

        ImageView ImageView12 = findViewById(R.id.imageView12);
        ImageView ImageView13 = findViewById(R.id.imageView13);

        ImageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event, navigate to asmr_list activity
                Intent intent = new Intent(MainActivity.this, Asmr_list.class);
                startActivity(intent);
            }
        });

        ImageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event, navigate to asmr_list activity
                Intent intent = new Intent(MainActivity.this, Nature_list.class);
                startActivity(intent);
            }
        });
    }
}