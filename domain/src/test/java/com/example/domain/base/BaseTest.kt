package com.example.domain.base

import io.mockk.MockKAnnotations
import io.mockk.unmockkAll
import org.junit.After
import org.junit.Before

abstract class BaseTest {

    @Before
    open fun setup() {
        MockKAnnotations.init(this)
        initialize()
    }

    @After
    fun shutdown() {
        unmockkAll()
        finish()
    }

    open fun initialize() {}

    open fun finish() {}

    val mockErrorResponse = Throwable("Error response")
}