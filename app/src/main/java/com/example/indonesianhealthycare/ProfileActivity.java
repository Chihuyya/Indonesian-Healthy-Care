package com.example.indonesianhealthycare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvProfileName, tvProfileEmail;
    private FirebaseAuth mAuth;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Sambungin ke ID yang ada di XML
        tvProfileName = findViewById(R.id.tvProfileName);
        tvProfileEmail = findViewById(R.id.tvProfileEmail);

        // Panggil Firebase
        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        // LOGIKA MENARIK DATA PROFIL DARI FIRESTORE
        if (mAuth.getCurrentUser() != null) {
            String userId = mAuth.getCurrentUser().getUid(); // Ambil ID user saat ini

            // Tarik data dari database
            db.collection("users").document(userId).get()
                    .addOnSuccessListener(documentSnapshot -> {
                        if (documentSnapshot.exists()) {
                            String name = documentSnapshot.getString("name");
                            String email = documentSnapshot.getString("email");

                            // Ubah teks di layar pakai data asli!
                            if (name != null) tvProfileName.setText(name);
                            if (email != null) tvProfileEmail.setText(email);
                        } else {
                            tvProfileName.setText("User Baru");
                            tvProfileEmail.setText(mAuth.getCurrentUser().getEmail());
                        }
                    })
                    .addOnFailureListener(e -> {
                        Toast.makeText(this, "Gagal muat profil: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                    });
        }

        // TOMBOL-TOMBOL MENU
        ImageView btnBack = findViewById(R.id.btnBackProfile);
        if (btnBack != null) btnBack.setOnClickListener(v -> finish());

        LinearLayout btnWallet = findViewById(R.id.btnWallet);
        if (btnWallet != null) btnWallet.setOnClickListener(v -> startActivity(new Intent(ProfileActivity.this, WalletActivity.class)));

        LinearLayout btnFavorite = findViewById(R.id.btnFavorite);
        if (btnFavorite != null) btnFavorite.setOnClickListener(v -> startActivity(new Intent(ProfileActivity.this, FavoriteActivity.class)));

        LinearLayout btnEditProfile = findViewById(R.id.btnEditProfile);
        if (btnEditProfile != null) btnEditProfile.setOnClickListener(v -> startActivity(new Intent(ProfileActivity.this, EditProfileActivity.class)));

        LinearLayout btnSettings = findViewById(R.id.btnSettings);
        if (btnSettings != null) btnSettings.setOnClickListener(v -> startActivity(new Intent(ProfileActivity.this, SettingsActivity.class)));

        // LOGIKA LOGOUT
        LinearLayout btnLogout = findViewById(R.id.btnLogout);
        if (btnLogout != null) {
            btnLogout.setOnClickListener(v -> {
                mAuth.signOut(); // Logout dari Firebase
                Toast.makeText(ProfileActivity.this, "Berhasil Log Out", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            });
        }
    }
}