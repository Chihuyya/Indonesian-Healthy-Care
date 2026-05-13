package com.example.indonesianhealthycare;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class EditProfileActivity extends AppCompatActivity {

    private EditText etEditName, etEditEmail;
    private FirebaseAuth mAuth;
    private FirebaseFirestore db;
    private String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        etEditName = findViewById(R.id.etEditName);
        etEditEmail = findViewById(R.id.etEditEmail);
        Button btnSaveChanges = findViewById(R.id.btnSaveChanges);
        ImageView btnBack = findViewById(R.id.btnBackEditProfile);

        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        btnBack.setOnClickListener(v -> finish());

        // Tarik data profil saat ini buat ditampilin di kolom
        if (mAuth.getCurrentUser() != null) {
            userId = mAuth.getCurrentUser().getUid();

            db.collection("users").document(userId).get()
                    .addOnSuccessListener(documentSnapshot -> {
                        if (documentSnapshot.exists()) {
                            String name = documentSnapshot.getString("name");
                            String email = documentSnapshot.getString("email");

                            if (name != null) etEditName.setText(name);
                            if (email != null) etEditEmail.setText(email);
                        }
                    });
        }

        // Logika pas tombol Save dipencet
        btnSaveChanges.setOnClickListener(v -> {
            String newName = etEditName.getText().toString().trim();

            if (newName.isEmpty()) {
                Toast.makeText(this, "Nama tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                return;
            }

            // Siapin paketan data baru yang mau dikirim (Update)
            Map<String, Object> updates = new HashMap<>();
            updates.put("name", newName);

            // Tembak datanya ke Firestore
            db.collection("users").document(userId).update(updates)
                    .addOnSuccessListener(aVoid -> {
                        Toast.makeText(EditProfileActivity.this, "Profil berhasil diupdate!", Toast.LENGTH_SHORT).show();
                        finish(); // Tutup halaman edit dan balik ke profil
                    })
                    .addOnFailureListener(e -> {
                        Toast.makeText(EditProfileActivity.this, "Gagal update: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                    });
        });
    }
}