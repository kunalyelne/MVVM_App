package com.kyodude.mvvm_app.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val textValue: MutableLiveData<String> = MutableLiveData("")
    val textDescription: MutableLiveData<String> = MutableLiveData("");
    fun setStringValue(){
        textValue.value = "Heyo!"
        textDescription.value = "Just trying out MVVM :)"
    }
}