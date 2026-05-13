package com.example.indonesianhealthycare;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class VideoCallActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_call);

        CardView btnEndCall = findViewById(R.id.btnEndCall);
        btnEndCall.setOnClickListener(v -> {
            Toast.makeText(this, "Panggilan Diakhiri", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}