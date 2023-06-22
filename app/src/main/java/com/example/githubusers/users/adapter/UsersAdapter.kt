package com.example.githubusers.users.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.users.model.Users
import com.example.githubusers.databinding.UserItemBinding
import com.example.githubusers.extension.loadImage

class UsersAdapter(
    var list: List<Users>? = listOf()
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = UserItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UsersViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val view = (holder as UsersViewHolder)
        val item = list?.get(position)

        view.tvName.text = item?.login
        view.tvUser.text = item?.type
        view.ivImage.loadImage(item?.avatar_url)
    }
}