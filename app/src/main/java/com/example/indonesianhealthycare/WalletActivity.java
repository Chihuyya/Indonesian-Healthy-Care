package com.example.indonesianhealthycare;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class WalletActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);

        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        Button btnTopUp = findViewById(R.id.btnTopUp);
        btnTopUp.setOnClickListener(v -> Toast.makeText(this, "Fitur Top Up sedang dalam pemeliharaan", Toast.LENGTH_SHORT).show());
    }
}