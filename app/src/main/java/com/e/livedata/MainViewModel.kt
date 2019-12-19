package com.e.livedata

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _observeTextState = MutableLiveData<String>()
    val observeText : LiveData<String>
        get() = _observeTextState

    fun setValue(){
        _observeTextState.value = "Text Changed"

    }
}