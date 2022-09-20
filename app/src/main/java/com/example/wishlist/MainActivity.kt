package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// when creating an recycler view
    /*
    1) Create a recycler view
    2) Create model class
    3) Create the wishlist items
     */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}