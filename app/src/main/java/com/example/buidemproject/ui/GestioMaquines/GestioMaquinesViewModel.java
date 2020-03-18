package com.example.buidemproject.ui.GestioMaquines;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GestioMaquinesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GestioMaquinesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gestio maquines fragment");
    }

    public LiveData<String> getText() { return mText; }
}
