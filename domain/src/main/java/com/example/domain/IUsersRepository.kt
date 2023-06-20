package com.example.domain

import com.example.domain.users.model.Users
import io.reactivex.Single

interface IUsersRepository {
    fun getUsers(): Single<List<Users>>
}