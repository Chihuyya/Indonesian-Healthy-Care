package com.example.indonesianhealthycare;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RescheduleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reschedule);

        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        Button btnConfirm = findViewById(R.id.btnConfirmReschedule);
        btnConfirm.setOnClickListener(v -> {
            Toast.makeText(this, "Jadwal Berhasil Diubah!", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}