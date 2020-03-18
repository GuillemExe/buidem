package com.example.buidemproject.ui.Zones;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.buidemproject.R;

public class ZonesFragment extends Fragment {

    private ZonesViewModel zonesViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        zonesViewModel = ViewModelProviders.of(this).get(ZonesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_zones, container, false);
        final TextView textView = root.findViewById(R.id.text_zones);

        zonesViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
