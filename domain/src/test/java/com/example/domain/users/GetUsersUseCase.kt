package com.example.domain.users

import com.example.domain.IUsersRepository
import com.example.domain.base.BaseTest
import com.example.domain.base.Event
import com.example.domain.users.model.Users
import com.example.domain.users.usecase.GetUsersUseCase
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.RelaxedMockK
import io.reactivex.Single
import org.junit.Test

class GetUsersUseCase : BaseTest() {
    @RelaxedMockK
    private lateinit var repository: IUsersRepository

    @InjectMockKs
    private lateinit var usecase: GetUsersUseCase

    private val expected = arrayListOf(
        Users(
            login = "mojombo",
            id = 1,
            node_id = "MDQ6VXNlcjE=",
            avatar_url = "https://avatars.githubusercontent.com/u/1?v=4",
            gravatar_id = "",
            url = "https://api.github.com/users/mojombo",
            html_url = "https://github.com/mojombo",
            followers_url = "https://api.github.com/users/mojombo/followers",
            following_url = "https://api.github.com/users/mojombo/following{/other_user}",
            gists_url = "https://api.github.com/users/mojombo/gists{/gist_id}",
            starred_url = "https://api.github.com/users/mojombo/starred{/owner}{/repo}",
            subscriptions_url = "https://api.github.com/users/mojombo/subscriptions",
            organizations_url = "https://api.github.com/users/mojombo/orgs",
            repos_url = "https://api.github.com/users/mojombo/repos",
            events_url = "https://api.github.com/users/mojombo/events{/privacy}",
            received_events_url = "https://api.github.com/users/mojombo/received_events",
            type = "User",
            site_admin = false
        )
    )

    @Test
    fun `Should return users`() {

        every { repository.getUsers() } returns
                Single.just(expected)

        usecase.execute()
            .test()
            .assertValueAt(0, Event.Loading)
            .assertValueAt(1) { (it as Event.Data).data == expected }
    }

    @Test
    fun `Should return users error`() {
        every { repository.getUsers() } returns Single.error(mockErrorResponse)

        usecase.execute()
            .test()
            .assertValueAt(0, Event.Loading)
            .assertValueAt(1, Event.error(mockErrorResponse))
    }
}