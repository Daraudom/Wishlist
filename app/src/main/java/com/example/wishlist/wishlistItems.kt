package com.example.wishlist
// have a mutable list that takes in data entry
var wishlists : MutableList<wishlistItems> = ArrayList()

data class wishlistItems(
    val wishlistItem : String,
    val price : Double,
    val link : String){

}


