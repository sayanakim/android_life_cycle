package com.sayana.mysecondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG="MainActivity"


//Сегодня солнышко печёт.
//Сегодня праздник — Май.
//Влезай, сынишка, на плечо
//И флаг свой поднимай!
//А через год пойдёшь пешком
//С красным праздничным флажком.


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Сегодня солнышко печёт.")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Сегодня праздник — Май.")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Влезай, сынишка, на плечо")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "И флаг свой поднимай!")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "А через год пойдёшь пешком")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "RESTART")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "С красным праздничным флажком.")
    }
}