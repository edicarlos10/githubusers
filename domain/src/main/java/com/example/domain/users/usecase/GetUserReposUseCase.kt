package com.example.domain.users.usecase

import com.example.domain.IUsersRepository
import com.example.domain.base.Event
import com.example.domain.base.ThrowableBase
import com.example.domain.users.model.UserRepos
import io.reactivex.Observable

class GetUserReposUseCase(
    private val repository: IUsersRepository
) {
    fun execute(username: String): Observable<Event<List<UserRepos>>> {
        return Observable.concat(Observable.just(Event.loading()), getUserRepos(username))
    }

    private fun getUserRepos(username: String): Observable<Event<List<UserRepos>>>? {
        return repository.getUserRepos(username)
            .map { Event.data(it) }
            .onErrorReturn { throwable ->
                (throwable as? ThrowableBase)?.let {
                    Event.error(it.type, it)
                } ?: Event.error(throwable)
            }.toObservable()
    }
}