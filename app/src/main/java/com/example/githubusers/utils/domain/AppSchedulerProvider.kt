package com.example.githubusers.utils.domain

import com.example.domain.util.ISchedulerProvider
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class AppSchedulerProvider : ISchedulerProvider {
    override fun mainThread(): Scheduler = AndroidSchedulers.mainThread()
    override fun backgroundThread(): Scheduler = Schedulers.io()
}