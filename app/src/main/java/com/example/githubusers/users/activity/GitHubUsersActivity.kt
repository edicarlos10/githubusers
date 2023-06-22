package com.example.githubusers.users.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.githubusers.R
import com.example.githubusers.databinding.ActivityGitHubUsersBinding
import com.example.githubusers.extension.viewBinding

class GitHubUsersActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityGitHubUsersBinding::inflate)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Githubusers_NoActionBar)
        setContentView(binding.root)
    }
}