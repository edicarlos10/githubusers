package com.example.network

import com.example.domain.users.model.Users
import com.example.network.base.BaseTest
import com.example.network.remote.IUsersRemoteData
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.RelaxedMockK
import io.reactivex.Single
import org.junit.Test

class UsersRepositoryTest : BaseTest() {

    @RelaxedMockK
    lateinit var remote: IUsersRemoteData

    @InjectMockKs
    lateinit var repository: UsersRepository

    private val usersRemoteData = arrayListOf(
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

        every { remote.getUsers() } returns
                Single.just(usersRemoteData)

        repository.getUsers()
            .test()
            .assertValue(usersRemoteData)
    }

    @Test
    fun `Should return error users`() {
        every {
            remote.getUsers().map {
                throw genericErrorResponse
            }
        } returns
                Single.error(genericErrorResponse)

        repository.getUsers()
            .test()
            .assertError(genericErrorResponse)
    }
}