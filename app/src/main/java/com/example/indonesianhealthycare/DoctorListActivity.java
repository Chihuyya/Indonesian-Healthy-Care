package com.example.indonesianhealthycare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class DoctorListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list);

        // Tombol kembali
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        // Tombol Book (Arahkan ke DoctorDetailActivity)
        Button btnBook1 = findViewById(R.id.btnBook1);
        btnBook1.setOnClickListener(v -> {
            Intent intent = new Intent(DoctorListActivity.this, DoctorDetailActivity.class);
            startActivity(intent);
        });
    }
}