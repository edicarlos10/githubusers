package com.example.network.remote.api

import com.example.network.remote.response.UserDetailResponse
import com.example.network.remote.response.UsersResponse
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface IGitHubUsersApiClient {
    @GET("users")
    fun getGitHubUsers(
    ): Single<Response<List<UsersResponse>>>

    @GET("users/{username}")
    fun getUser(username: String): Single<Response<UserDetailResponse>>

    @GET("users/{username}/repos")
    fun getUserRepos(@Path("username") username: String,): Single<Response<List<UserDetailResponse>>>

}