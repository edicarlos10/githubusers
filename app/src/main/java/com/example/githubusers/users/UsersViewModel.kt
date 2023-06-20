package com.example.githubusers.users

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.domain.base.Event
import com.example.domain.users.model.Users
import com.example.domain.users.usecase.GetUsersUseCase
import com.example.domain.util.ISchedulerProvider
import com.example.githubusers.base.BaseViewModel
import io.reactivex.rxkotlin.addTo

class UsersViewModel(
    scheduler: ISchedulerProvider,
    private val getUsersUseCase: GetUsersUseCase
) : BaseViewModel(scheduler) {

    private val _error = MutableLiveData<Event.Error?>()
    val error: LiveData<Event.Error?>
        get() = _error

    private val _loading = MutableLiveData<Boolean?>()
    val loading: LiveData<Boolean?>
        get() = _loading

    private val _users = MutableLiveData<Users?>()
    val users: LiveData<Users?>
        get() = _users

    fun getUsers() {
        getUsersUseCase.execute()
            .subscribeOn(scheduler.backgroundThread())
            .observeOn(scheduler.mainThread())
            .subscribe {
                _loading.value = it.isLoading()
                when (it) {
                    is Event.Data<*> -> {
                        _users.value = it.data as Users
                    }

                    is Event.Error -> {
                        _error.value = it
                    }

                    else -> Unit
                }
            }.addTo(disposables)
    }
}