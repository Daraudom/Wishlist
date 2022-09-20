package com.example.wishlist

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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

        val recyclerView = findViewById<RecyclerView>(R.id.Wishlists)

        // Data entry from edittext
        val inputwishlistItems = findViewById<EditText>(R.id.itemName)
        val inputwishlistPrice = findViewById<EditText>(R.id.price)
        val inputwishlistLink = findViewById<EditText>(R.id.link)
        val submitButton = findViewById<Button>(R.id.submitButton)

        // Replacement Data Entry into WishLists
        val wishlistItemsEntry = inputwishlistItems.text
        val wishlistPrice = inputwishlistPrice.text
        val wishlistlink = inputwishlistLink.text

        // Adapter
        val adapter = wishListAdapter(wishlists)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Adding list when clicking button
        submitButton.setOnClickListener {
            wishlists.add(wishlistItems(wishlistItemsEntry.toString(), wishlistPrice.toString().toDouble(), wishlistlink.toString()))
            recyclerView.visibility = View.VISIBLE
            wishlistItemsEntry.clear()
            wishlistPrice.clear()
            wishlistlink.clear()
            hideKeyboard()

        }
    }
    private fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}