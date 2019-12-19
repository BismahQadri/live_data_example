package com.e.livedata

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private lateinit var observeText: MutableLiveData<String>

    fun setValue(){
        observeText.value = "Text Changed"

    }
}