package com.example.indonesianhealthycare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class ReviewBookingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_booking);

        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        Button btnPay = findViewById(R.id.btnPay);
        btnPay.setOnClickListener(v -> {
            // Lanjut ke Pilih Pembayaran
            Intent intent = new Intent(ReviewBookingActivity.this, PaymentActivity.class);
            startActivity(intent);
        });
    }
}