package com.example.indonesianhealthycare;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ScheduleFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_schedule, container, false);

        Button btnCancel = view.findViewById(R.id.btnCancel);
        Button btnReschedule = view.findViewById(R.id.btnReschedule);

        if (btnCancel != null) btnCancel.setOnClickListener(v -> Toast.makeText(getActivity(), "Booking Dibatalkan", Toast.LENGTH_SHORT).show());
        if (btnReschedule != null) btnReschedule.setOnClickListener(v -> startActivity(new Intent(getActivity(), RescheduleActivity.class)));

        return view;
    }
}