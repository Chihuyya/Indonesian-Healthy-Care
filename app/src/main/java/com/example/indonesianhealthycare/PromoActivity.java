package com.example.indonesianhealthycare;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PromoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo);

        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        Button btnUsePromo = findViewById(R.id.btnUsePromo);
        btnUsePromo.setOnClickListener(v -> {
            Toast.makeText(this, "Promo Berhasil Digunakan!", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}