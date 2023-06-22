package com.example.githubusers.users.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.githubusers.R
import com.example.githubusers.databinding.ActivityGitHubUsersBinding
import com.example.githubusers.extension.viewBinding
import com.example.githubusers.users.fragment.UsersFragment

class GitHubUsersActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityGitHubUsersBinding::inflate)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initFragment(savedInstanceState)
    }

    private fun initFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            val usersFragment = UsersFragment.newInstance()
            supportFragmentManager.beginTransaction()
                .replace(R.id.navCampaignFragment, usersFragment)
                .addToBackStack(null)
                .commit()
        }
    }
}