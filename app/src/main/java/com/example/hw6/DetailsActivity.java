package com.example.hw6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        ImageView imageView = findViewById(R.id.details_image_view);
        TextView titleTextView = findViewById(R.id.details_title_text_view);
        TextView bodyTextView = findViewById(R.id.details_body_text_view);

        imageView.setImageResource(intent.getIntExtra("photo", R.drawable.ic_launcher_background));
        titleTextView.setText(intent.getStringExtra("title"));
        bodyTextView.setText(intent.getStringExtra("body"));
    }
}
