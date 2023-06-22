package com.example.githubusers.users

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.domain.base.Event
import com.example.domain.users.model.UserRepos
import com.example.domain.users.model.Users
import com.example.domain.users.usecase.GetUserDetailUseCase
import com.example.domain.users.usecase.GetUserReposUseCase
import com.example.domain.users.usecase.GetUsersUseCase
import com.example.domain.util.ISchedulerProvider
import com.example.githubusers.base.BaseViewModel
import io.reactivex.rxkotlin.addTo

class UsersViewModel(
    scheduler: ISchedulerProvider,
    private val getUsersUseCase: GetUsersUseCase,
    private val getUserDetailUseCase: GetUserDetailUseCase,
    private val getUserReposUseCase: GetUserReposUseCase
) : BaseViewModel(scheduler) {

    private val _error = MutableLiveData<Event.Error?>()
    val error: LiveData<Event.Error?>
        get() = _error

    private val _errorRepos = MutableLiveData<Event.Error?>()
    val errorRepos: LiveData<Event.Error?>
        get() = _errorRepos

    private val _loading = MutableLiveData<Boolean?>()
    val loading: LiveData<Boolean?>
        get() = _loading

    private val _loadingRepos = MutableLiveData<Boolean?>()
    val loadingRepos: LiveData<Boolean?>
        get() = _loadingRepos

    private val _users = MutableLiveData<List<Users>?>()
    val users: LiveData<List<Users>?>
        get() = _users

    private val _userDetails = MutableLiveData<Users?>()
    val userDetail: LiveData<Users?>
        get() = _userDetails

    private val _userRepos = MutableLiveData<List<UserRepos>?>()
    val userRepos: LiveData<List<UserRepos>?>
        get() = _userRepos

    fun getUsers() {
        getUsersUseCase.execute()
            .subscribeOn(scheduler.backgroundThread())
            .observeOn(scheduler.mainThread())
            .subscribe {
                _loading.value = it.isLoading()
                when (it) {
                    is Event.Data<List<Users>> -> {
                        _users.value = it.data
                    }

                    is Event.Error -> {
                        _error.value = it
                    }

                    else -> Unit
                }
            }.addTo(disposables)
    }

    fun getUserDetail(username: String) {
        getUserDetailUseCase.execute(username)
            .subscribeOn(scheduler.backgroundThread())
            .observeOn(scheduler.mainThread())
            .subscribe {
                _loading.value = it.isLoading()
                when (it) {
                    is Event.Data<*> -> {
                        _userDetails.value = it.data as Users
                    }

                    is Event.Error -> {
                        _error.value = it
                    }

                    else -> Unit
                }
            }.addTo(disposables)
    }

    fun getUserRepos(username: String) {
        getUserReposUseCase.execute(username)
            .subscribeOn(scheduler.backgroundThread())
            .observeOn(scheduler.mainThread())
            .subscribe {
                _loadingRepos.value = it.isLoading()
                when (it) {
                    is Event.Data<List<UserRepos>> -> {
                        _userRepos.value = it.data
                    }

                    is Event.Error -> {
                        _errorRepos.value = it
                    }

                    else -> Unit
                }
            }.addTo(disposables)
    }
}