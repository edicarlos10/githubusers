package com.example.githubusers.users.adapter

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.githubusers.databinding.ItemUserRepositoriesBinding

class UserDetailViewHolder (binding: ItemUserRepositoriesBinding) : RecyclerView.ViewHolder(binding.root) {
    var tvRepoName: TextView = binding.tvRepoName
    var tvWatchers: TextView = binding.tvWatchers
    var tvReposForksCount: TextView = binding.tvReposForksCount
    var tvReposStarsCount: TextView = binding.tvReposStarsCount
    var tvReposLang: TextView = binding.tvReposLang
}