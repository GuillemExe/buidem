package com.example.buidemproject.ui.Zones;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ZonesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ZonesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is zones fragment");
    }

    public LiveData<String> getText() { return mText; }
}
