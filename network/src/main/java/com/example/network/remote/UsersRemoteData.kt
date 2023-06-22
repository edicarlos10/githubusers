package com.example.network.remote

import com.example.domain.users.model.UserRepos
import com.example.domain.users.model.Users
import com.example.network.remote.api.IGitHubUsersApiClient
import io.reactivex.Single

class UsersRemoteData (private val apiGitHubUsers: IGitHubUsersApiClient) : IUsersRemoteData{
    private var errorBody: String? = null
    override fun getUsers(): Single<List<Users>> {
        return apiGitHubUsers.getGitHubUsers()
            .map {
                errorBody = it.errorBody()?.string()

                it.body()?.map { list ->
                    list.toUsers()
                } ?: throw Exception(errorBody)
            }
    }

    override fun getUserDetail(username: String): Single<Users> {
        return apiGitHubUsers.getUserDetail(username)
            .map {
                errorBody = it.errorBody()?.string()

                it.body()?.toUsers()
                    ?: throw Exception(errorBody)

            }
    }

    override fun getUserRepos(username: String): Single<List<UserRepos>> {
        return apiGitHubUsers.getUserRepos(username)
            .map {
                errorBody = it.errorBody()?.string()

                it.body()?.map { list ->
                    list.toUsersRepos()
                } ?: throw Exception(errorBody)
            }
    }
}