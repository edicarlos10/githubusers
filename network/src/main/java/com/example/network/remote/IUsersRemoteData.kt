package com.example.network.remote

import com.example.domain.users.model.UserDetail
import com.example.domain.users.model.Users
import io.reactivex.Single

interface IUsersRemoteData {
    fun getUsers(): Single<List<Users>>

    fun getUserDetail(username: String): Single<UserDetail>
}