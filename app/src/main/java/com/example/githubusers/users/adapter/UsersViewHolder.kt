package com.example.githubusers.users.adapter

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.githubusers.databinding.UserItemBinding

class UsersViewHolder (binding: UserItemBinding) : RecyclerView.ViewHolder(binding.root) {
    var tvName: TextView = binding.tvName
    var tvUser: TextView = binding.tvUser
    var ivImage: ImageView = binding.ivImage
}