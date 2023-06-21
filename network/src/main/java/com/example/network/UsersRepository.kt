package com.example.network

import com.example.domain.IUsersRepository
import com.example.domain.base.ThrowableBase
import com.example.domain.users.model.UserDetail
import com.example.domain.users.model.UserRepos
import com.example.domain.users.model.Users
import com.example.network.remote.IUsersRemoteData
import io.reactivex.Single

class UsersRepository (private val usersRemoteData: IUsersRemoteData) : IUsersRepository{
    override fun getUsers(): Single<List<Users>> {
        return usersRemoteData.getUsers()
            .onErrorResumeNext { ThrowableBase.parseError(it).toSingleError()}
    }

    override fun getUserDetail(username: String): Single<UserDetail> {
        return usersRemoteData.getUserDetail(username)
            .onErrorResumeNext { ThrowableBase.parseError(it).toSingleError()}
    }

    override fun getUserRepos(username: String): Single<List<UserRepos>> {
        return usersRemoteData.getUserRepos(username)
            .onErrorResumeNext { ThrowableBase.parseError(it).toSingleError()}
    }
}