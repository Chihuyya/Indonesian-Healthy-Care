package com.example.indonesianhealthycare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class PatientDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details);

        // Tombol kembali
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        // Tombol Next (Sekarang menuju halaman Review Booking / Rincian Tagihan dulu)
        Button btnNext = findViewById(R.id.btnNextPayment);
        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(PatientDetailsActivity.this, ReviewBookingActivity.class);
            startActivity(intent);
        });
    }
}