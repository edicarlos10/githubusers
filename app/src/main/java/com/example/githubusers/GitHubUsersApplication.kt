package com.example.githubusers

import android.app.Application
import com.example.githubusers.di.networkModule
import com.example.githubusers.users.usersModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class GitHubUsersApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        initModules()
    }

    private fun initModules(){
        startKoin {
            androidContext(this@GitHubUsersApplication)
            modules(networkModule, usersModule)
        }
    }
}