package com.example.domain.util

import io.reactivex.Scheduler

interface ISchedulerProvider {
    fun mainThread(): Scheduler
    fun backgroundThread(): Scheduler
}