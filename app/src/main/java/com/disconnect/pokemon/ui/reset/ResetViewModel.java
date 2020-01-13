package com.disconnect.pokemon.ui.reset;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ResetViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ResetViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Reset fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}