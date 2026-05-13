package com.example.indonesianhealthycare;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PharmacyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy);

        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        Button btnAdd1 = findViewById(R.id.btnAdd1);
        Button btnAdd2 = findViewById(R.id.btnAdd2);

        btnAdd1.setOnClickListener(v -> Toast.makeText(this, "Paracetamol dimasukkan ke keranjang!", Toast.LENGTH_SHORT).show());
        btnAdd2.setOnClickListener(v -> Toast.makeText(this, "Vitamin C dimasukkan ke keranjang!", Toast.LENGTH_SHORT).show());
    }
}