package com.example.githubusers.users

import com.example.domain.IUsersRepository
import com.example.domain.users.usecase.GetUserDetailUseCase
import com.example.domain.users.usecase.GetUserReposUseCase
import com.example.domain.users.usecase.GetUsersUseCase
import com.example.network.UsersRepository
import com.example.network.remote.IUsersRemoteData
import com.example.network.remote.UsersRemoteData
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val usersModule = module {
    viewModel { UsersViewModel(scheduler = get(), getUsersUseCase = get(), getUserDetailUseCase = get(), getUserReposUseCase = get()) }
    factory { GetUsersUseCase(repository = get()) }
    factory { GetUserDetailUseCase(repository = get()) }
    factory { GetUserReposUseCase(repository = get()) }
    single<IUsersRepository> { UsersRepository(usersRemoteData = get()) }
    factory<IUsersRemoteData> { UsersRemoteData(apiGitHubUsers = get()) }
}