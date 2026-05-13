package com.example.indonesianhealthycare;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Kalau lo punya file layout activity_splash.xml, ini dibiarin. Kalau merah, hapus aja sebaris ini.
        // setContentView(R.layout.activity_splash);

        // Tahan 2 detik biar ada efek loading ala aplikasi pro
        new Handler(Looper.getMainLooper()).postDelayed(() -> {

            // Cek apakah user udah login di Firebase
            if (FirebaseAuth.getInstance().getCurrentUser() != null) {
                // Udah login -> Masuk ke Home
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            } else {
                // Belum login -> Masuk ke Login
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            }
            finish();

        }, 2000); // 2000 = 2 detik
    }
}