package com.example.buidemproject.ui.TipusMaquines;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TipusMaquinesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TipusMaquinesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tipus maquines fragment");
    }

    public LiveData<String> getText() { return mText; }
}
