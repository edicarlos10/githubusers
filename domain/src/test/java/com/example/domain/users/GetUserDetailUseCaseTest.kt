package com.example.domain.users

import com.example.domain.IUsersRepository
import com.example.domain.base.BaseTest
import com.example.domain.base.Event
import com.example.domain.users.model.UserDetail
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
        UserDetail(
            avatar_url = "https://avatars.githubusercontent.com/u/1?v=4",
            bio = null,
            blog = "http://tom.preston-werner.com",
            company = "@chatterbugapp",
            created_at = "2007-10-20T05:24:19Z",
            email = null,
            events_url = "https://api.github.com/users/mojombo/events{/privacy}",
            followers = 23516,
            followers_url = "https://api.github.com/users/mojombo/followers",
            following = 11,
            following_url = "https://api.github.com/users/mojombo/following{/other_user}",
            gists_url = "https://api.github.com/users/mojombo/gists{/gist_id}",
            gravatar_id = "",
            hireable = null,
            html_url = "https://github.com/mojombo",
            id = 1,
            location = "San Francisco",
            login = "mojombo",
            name = "Tom Preston-Werner",
            node_id = "MDQ6VXNlcjE=",
            organizations_url = "https://api.github.com/users/mojombo/orgs",
            public_gists = 62,
            public_repos = 65,
            received_events_url = "https://api.github.com/users/mojombo/received_events",
            repos_url = "https://api.github.com/users/mojombo/repos",
            site_admin = false,
            starred_url = "https://api.github.com/users/mojombo/starred{/owner}{/repo}",
            subscriptions_url = "https://api.github.com/users/mojombo/subscriptions",
            twitter_username = "mojombo",
            type = "",
            updated_at = "2023-03-22T15:06:06Z",
            url = "https://api.github.com/users/mojombo"
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