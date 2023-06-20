package com.example.network.remote.api

import com.example.network.remote.response.UsersResponse
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface IGitHubUsersApiClient {
    @GET("users")
    fun getGitHubUsers(
    ): Single<Response<UsersResponse>>
}