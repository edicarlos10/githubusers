package com.example.githubusers.users.adapter

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.githubusers.databinding.FragmentUserDetailBinding
import com.example.githubusers.databinding.ItemUserRepositoriesBinding
import com.example.githubusers.databinding.UserItemBinding

class UserDetailViewHolder (binding: ItemUserRepositoriesBinding) : RecyclerView.ViewHolder(binding.root) {
    var tvRepoName: TextView = binding.tvRepoName
    var tvWatchers: TextView = binding.tvWatchers
    var tvReposForksCount: TextView = binding.tvReposForksCount
    var tvReposStarsCount: TextView = binding.tvReposStarsCount
    var tvReposLang: TextView = binding.tvReposLang
}