package com.example.githubusers.users.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.users.model.UserRepos
import com.example.domain.users.model.Users
import com.example.githubusers.databinding.FragmentUserDetailBinding
import com.example.githubusers.databinding.ItemUserRepositoriesBinding
import com.example.githubusers.databinding.UserItemBinding
import com.example.githubusers.extension.loadImage

class UserDetailAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var list: List<UserRepos>? = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemUserRepositoriesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserDetailViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val view = (holder as UserDetailViewHolder)
        val item = list?.get(position)

        view.tvRepoName.text = item?.name
        view.tvWatchers.text = item?.watchers_count.toString()
        view.tvReposForksCount.text = item?.forks_count.toString()
        view.tvReposStarsCount.text = item?.stargazers_count.toString()
        view.tvReposLang.text = item?.language.toString()
    }
}