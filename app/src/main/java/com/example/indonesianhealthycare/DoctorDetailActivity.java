package com.example.indonesianhealthycare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class DoctorDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_detail);

        // Tombol Kembali
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        // Tombol Book Appointment (Akan pindah ke halaman Booking Tanggal)
        Button btnBookAppointment = findViewById(R.id.btnBookAppointment);
        btnBookAppointment.setOnClickListener(v -> {
            Intent intent = new Intent(DoctorDetailActivity.this, BookingActivity.class);
            startActivity(intent);
        });
    }
}