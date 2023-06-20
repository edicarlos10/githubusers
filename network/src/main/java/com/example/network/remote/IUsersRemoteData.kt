package com.example.network.remote

import com.example.domain.users.model.Users
import io.reactivex.Single

interface IUsersRemoteData {
    fun getUsers(): Single<Users>
}