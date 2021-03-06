package com.example.helloapp.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<Integer> number;

    public MutableLiveData<Integer> getNumber() {
        if (number==null){
            number = new MutableLiveData<>();
            number.setValue(0);
        }
        return number;
    }

    public void add(Integer i){
        number.setValue(number.getValue()+i);
    }
}
