package com.example.buidemproject.ui.TipusMaquines;

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

public class TipusMaquinesFragment extends Fragment {

    private TipusMaquinesViewModel tipusMaquinesViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        tipusMaquinesViewModel = ViewModelProviders.of(this).get(TipusMaquinesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tipus_maquines, container, false);
        final TextView textView = root.findViewById(R.id.text_tipus_maquines);

        tipusMaquinesViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
