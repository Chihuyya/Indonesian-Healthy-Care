package com.example.indonesianhealthycare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ChatRoomActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);

        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        // Arahkan ke Video Call kalau dipencet
        ImageView btnCall = findViewById(R.id.btnCall);
        btnCall.setOnClickListener(v -> startActivity(new Intent(ChatRoomActivity.this, VideoCallActivity.class)));

        ImageView btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(v -> Toast.makeText(this, "Pesan Terkirim!", Toast.LENGTH_SHORT).show());
    }
}