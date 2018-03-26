package com.example.vadstep.mvvmaac

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

/**
 * Created by User1 on 26/03/2018.
 */
class CounterViewModel : ViewModel() {
    val counter = MutableLiveData<Int>()
    var number = 0
    fun onButtonClick() {
        counter.value = ++number
    }
}