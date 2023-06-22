package com.example.domain

import com.example.domain.users.model.UserRepos
import com.example.domain.users.model.Users
import io.reactivex.Single

interface IUsersRepository {
    fun getUsers(): Single<List<Users>>

    fun getUserDetail(username: String): Single<Users>

    fun getUserRepos(username: String): Single<List<UserRepos>>
}