package com.example.indonesianhealthycare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class BookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        // Tombol kembali
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        // Tombol untuk lanjut ke halaman Pilih Paket
        Button btnMakeAppointment = findViewById(R.id.btnMakeAppointment);
        btnMakeAppointment.setOnClickListener(v -> {
            Intent intent = new Intent(BookingActivity.this, SelectPackageActivity.class);
            startActivity(intent);
        });
    }
}