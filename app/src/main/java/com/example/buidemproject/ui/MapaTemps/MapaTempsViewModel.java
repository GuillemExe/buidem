package com.example.buidemproject.ui.MapaTemps;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MapaTempsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MapaTempsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is mapa and temps fragment");
    }

    public LiveData<String> getText() { return mText; }

}
