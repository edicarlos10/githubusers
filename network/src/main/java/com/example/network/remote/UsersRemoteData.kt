package com.example.network.remote

import com.example.domain.users.model.Users
import com.example.network.remote.api.IGitHubUsersApiClient
import io.reactivex.Single

class UsersRemoteData (private val apiGitHubUsers: IGitHubUsersApiClient) : IUsersRemoteData{
    override fun getUsers(): Single<Users> {
        return apiGitHubUsers.getGitHubUsers()
            .map {
                it.body()?.toUsers() ?: throw Exception(it.errorBody()?.string())
            }
    }
}