package com.example.network

import com.example.domain.IUsersRepository
import com.example.domain.base.ThrowableBase
import com.example.domain.users.model.Users
import com.example.network.remote.IUsersRemoteData
import io.reactivex.Single

class UsersRepository (private val usersRemoteData: IUsersRemoteData) : IUsersRepository{
    override fun getUsers(): Single<Users> {
        return usersRemoteData.getUsers()
            .onErrorResumeNext { ThrowableBase.parseError(it).toSingleError()}
    }
}