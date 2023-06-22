package com.example.domain.users.usecase

import com.example.domain.IUsersRepository
import com.example.domain.base.Event
import com.example.domain.base.ThrowableBase
import com.example.domain.users.model.Users
import io.reactivex.Observable

class GetUserDetailUseCase(
    private val repository: IUsersRepository
) {
    fun execute(username: String): Observable<Event<Users>> {
        return Observable.concat(Observable.just(Event.loading()), getUserDetail(username))
    }

    private fun getUserDetail(username: String): Observable<Event<Users>>? {
        return repository.getUserDetail(username)
            .map { Event.data(it) }
            .onErrorReturn { throwable ->
                (throwable as? ThrowableBase)?.let {
                    Event.error(it.type, it)
                } ?: Event.error(throwable)
            }.toObservable()
    }
}