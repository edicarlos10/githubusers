package com.example.domain.users

import com.example.domain.IUsersRepository
import com.example.domain.base.BaseTest
import com.example.domain.base.Event
import com.example.domain.users.model.Users
import com.example.domain.users.usecase.GetUserDetailUseCase
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.RelaxedMockK
import io.reactivex.Single
import org.junit.Test

class GetUserDetailUseCaseTest : BaseTest() {
    @RelaxedMockK
    private lateinit var repository: IUsersRepository

    @InjectMockKs
    private lateinit var usecase: GetUserDetailUseCase

    private val expected =
        Users(
            id = 1,
            type = "User",
            avatar_url = "https://avatars.githubusercontent.com/u/1?v=4",
            login = "mojombo",
            name = "mojombo",
            followers = 2,
            following = 2,
            public_repos = 1
        )

    @Test
    fun `Should return user detail`() {

        every { repository.getUserDetail(any()) } returns
                Single.just(expected)

        usecase.execute("mojombo")
            .test()
            .assertValueAt(0, Event.Loading)
            .assertValueAt(1) { (it as Event.Data).data == expected }
    }

    @Test
    fun `Should return user detail error`() {
        every { repository.getUserDetail(any()) } returns Single.error(mockErrorResponse)

        usecase.execute("mojombo")
            .test()
            .assertValueAt(0, Event.Loading)
            .assertValueAt(1, Event.error(mockErrorResponse))
    }
}