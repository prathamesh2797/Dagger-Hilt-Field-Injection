package com.example.daggerhilt

import android.util.Log
import javax.inject.Inject

class Car {

    @Inject
    constructor()
    fun getCar(){
        Log.d("main","car is running")
    }
}