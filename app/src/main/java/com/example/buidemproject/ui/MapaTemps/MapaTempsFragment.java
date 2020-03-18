package com.example.buidemproject.ui.MapaTemps;

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

public class MapaTempsFragment extends Fragment {

    private MapaTempsViewModel mapaTempsViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mapaTempsViewModel = ViewModelProviders.of(this).get(MapaTempsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_mapa_temps, container, false);
        final TextView textView = root.findViewById(R.id.text_mapa_temps);

        mapaTempsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
