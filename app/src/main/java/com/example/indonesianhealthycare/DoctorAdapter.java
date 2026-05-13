package com.example.indonesianhealthycare;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.DoctorViewHolder> {

    private List<Doctor> doctorList;

    public DoctorAdapter(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    @NonNull
    @Override
    public DoctorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doctor, parent, false);
        return new DoctorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DoctorViewHolder holder, int position) {
        Doctor doctor = doctorList.get(position);
        holder.tvName.setText(doctor.getName());
        holder.tvSpecialist.setText(doctor.getSpecialist());
        holder.tvRating.setText(doctor.getRating());

        // LOGIKA KLIK BARU: Pindah ke DoctorDetailActivity
        holder.itemView.setOnClickListener(v -> {
            android.content.Intent intent = new android.content.Intent(v.getContext(), DoctorDetailActivity.class);

            // Bawa data dokter ke halaman detail
            intent.putExtra("DOCTOR_NAME", doctor.getName());
            intent.putExtra("DOCTOR_SPECIALIST", doctor.getSpecialist());

            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }

    public static class DoctorViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvSpecialist, tvRating;
        ImageView ivProfile;

        public DoctorViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvDoctorName);
            tvSpecialist = itemView.findViewById(R.id.tvSpecialist);
            tvRating = itemView.findViewById(R.id.tvRating);
            ivProfile = itemView.findViewById(R.id.ivDoctorProfile);
        }
    }
}