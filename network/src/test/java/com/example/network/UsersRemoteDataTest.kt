package com.example.network

import com.example.network.base.BaseTest
import com.example.network.remote.UsersRemoteData
import com.example.network.remote.api.IGitHubUsersApiClient
import com.example.network.remote.response.UsersResponse
import io.mockk.every
import io.mockk.impl.annotations.RelaxedMockK
import io.reactivex.Single
import org.junit.Test
import retrofit2.Response

class UsersRemoteDataTest : BaseTest() {

    lateinit var remoteData: UsersRemoteData

    @RelaxedMockK
    lateinit var client: IGitHubUsersApiClient

    private fun responseUsers(): Response<List<UsersResponse>> {
        return Response.success(
            arrayListOf(
                UsersResponse(
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
        )
    }

    override fun initialize() {
        super.initialize()

        remoteData = UsersRemoteData(client)
    }

    @Test
    fun `Should get users from API`() {

        every { client.getGitHubUsers() } returns
                Single.just(responseUsers())

        remoteData.getUsers()
            .test()
            .assertValue(responseUsers().body()?.map { it.toUsers() })
    }
}