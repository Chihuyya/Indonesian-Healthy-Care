package com.example.indonesianhealthycare;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SelectPackageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_package);

        // Tombol kembali
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        // Tombol lanjut ke Patient Details
        android.widget.Button btnContinue = findViewById(R.id.btnContinuePackage);
        btnContinue.setOnClickListener(v -> {
            android.content.Intent intent = new android.content.Intent(SelectPackageActivity.this, PatientDetailsActivity.class);
            startActivity(intent);
        });
    }
}