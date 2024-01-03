package com.asuero.queen.music_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Nature_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nature_list);

        ImageView backButton = findViewById(R.id.back);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event, navigate back to MainActivity
                Intent intent = new Intent(Nature_list.this, MainActivity.class);
                startActivity(intent);
                finish(); // This finishes the current activity (AsmrListActivity)
            }
        });
    }
}