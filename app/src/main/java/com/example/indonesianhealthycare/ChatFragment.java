package com.example.indonesianhealthycare;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ChatFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        LinearLayout chatItem1 = view.findViewById(R.id.chatItem1);
        if (chatItem1 != null) {
            chatItem1.setOnClickListener(v -> startActivity(new Intent(getActivity(), ChatRoomActivity.class)));
        }
        return view;
    }
}