package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class wishListAdapter (private val mwishlistItems: List<wishlistItems>) : RecyclerView.Adapter<wishListAdapter.ViewHolder>() {
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemName = itemView.findViewById<TextView>(R.id.wishlistItemName)
        val itemPrice = itemView.findViewById<TextView>(R.id.wishlistItemPrice)
        val itemLink = itemView.findViewById<TextView>(R.id.wishlistItemLink)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val wishlistView = inflater.inflate(R.layout.wishlist_items, parent, false)
        return ViewHolder(wishlistView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val wishlist = wishlists[itemCount - 1]
        holder.itemName.text = wishlist.wishlistItem
        holder.itemPrice.text = wishlist.price.toString()
        holder.itemLink.text = wishlist.link
    }

    override fun getItemCount(): Int {
        return wishlists.size
    }

}


