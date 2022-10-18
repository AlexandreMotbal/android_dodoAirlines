package com.example.dodo_airlines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.flightarchives_2021.Utils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Utils.generateAirportList()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}