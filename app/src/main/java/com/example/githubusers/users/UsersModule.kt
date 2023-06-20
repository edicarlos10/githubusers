package com.example.githubusers.users

import com.example.domain.IUsersRepository
import com.example.domain.users.usecase.GetUsersUseCase
import com.example.network.UsersRepository
import com.example.network.remote.IUsersRemoteData
import com.example.network.remote.UsersRemoteData
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val usersModule = module {
    viewModel { UsersViewModel(scheduler = get(), getUsersUseCase = get()) }
    factory { GetUsersUseCase(repository = get()) }
    single<IUsersRepository> { UsersRepository(usersRemoteData = get()) }
    factory<IUsersRemoteData> { UsersRemoteData(apiGitHubUsers = get()) }
}