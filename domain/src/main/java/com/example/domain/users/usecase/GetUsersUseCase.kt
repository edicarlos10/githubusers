package com.example.domain.users.usecase

import com.example.domain.IUsersRepository
import com.example.domain.base.Event
import com.example.domain.base.ThrowableBase
import com.example.domain.users.model.Users
import io.reactivex.Observable

class GetUsersUseCase(
    private val repository: IUsersRepository
) {
    fun execute(): Observable<Event<List<Users>>> {
        return Observable.concat(Observable.just(Event.loading()), getWeatherForecast())
    }

    private fun getWeatherForecast(): Observable<Event<List<Users>>>? {
        return repository.getUsers()
            .map { Event.data(it) }
            .onErrorReturn { throwable ->
                (throwable as? ThrowableBase)?.let {
                    Event.error(it.type, it)
                } ?: Event.error(throwable)
            }.toObservable()
    }
}