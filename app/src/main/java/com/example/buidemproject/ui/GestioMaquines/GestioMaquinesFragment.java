package com.example.buidemproject.ui.GestioMaquines;

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

public class GestioMaquinesFragment extends Fragment {

    private GestioMaquinesViewModel gestioMaquinesViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        gestioMaquinesViewModel = ViewModelProviders.of(this).get(GestioMaquinesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gestio_maquines, container, false);
        final TextView textView = root.findViewById(R.id.text_gestio_maquines);

        gestioMaquinesViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
