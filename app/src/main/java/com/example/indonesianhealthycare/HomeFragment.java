package com.example.indonesianhealthycare;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ImageView btnNotification = view.findViewById(R.id.btnNotification);
        if (btnNotification != null) btnNotification.setOnClickListener(v -> startActivity(new Intent(getActivity(), NotificationsActivity.class)));

        LinearLayout btnSearch = view.findViewById(R.id.btnSearch);
        if (btnSearch != null) btnSearch.setOnClickListener(v -> startActivity(new Intent(getActivity(), SearchActivity.class)));

        CardView btnPromo = view.findViewById(R.id.btnPromo);
        if (btnPromo != null) btnPromo.setOnClickListener(v -> startActivity(new Intent(getActivity(), PromoActivity.class)));

        // FUNGSI KLIK TOKO OBAT
        CardView btnPharmacy = view.findViewById(R.id.btnPharmacy);
        if (btnPharmacy != null) btnPharmacy.setOnClickListener(v -> startActivity(new Intent(getActivity(), PharmacyActivity.class)));

        // FUNGSI KLIK ARTIKEL
        CardView btnArticle = view.findViewById(R.id.btnArticle);
        if (btnArticle != null) btnArticle.setOnClickListener(v -> startActivity(new Intent(getActivity(), ArticleActivity.class)));

        LinearLayout catUmum = view.findViewById(R.id.catUmum);
        if (catUmum != null) catUmum.setOnClickListener(v -> startActivity(new Intent(getActivity(), DoctorListActivity.class)));

        LinearLayout catGigi = view.findViewById(R.id.catGigi);
        if (catGigi != null) catGigi.setOnClickListener(v -> startActivity(new Intent(getActivity(), DoctorListActivity.class)));

        LinearLayout catJantung = view.findViewById(R.id.catJantung);
        if (catJantung != null) catJantung.setOnClickListener(v -> startActivity(new Intent(getActivity(), DoctorListActivity.class)));

        LinearLayout catAnak = view.findViewById(R.id.catAnak);
        if (catAnak != null) catAnak.setOnClickListener(v -> startActivity(new Intent(getActivity(), DoctorListActivity.class)));

        return view;
    }
}