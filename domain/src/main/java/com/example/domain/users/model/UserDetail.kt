package com.example.domain.users.model

import java.io.Serializable

data class UserDetail(
    val avatar_url: String? = null, // https://avatars.githubusercontent.com/u/1?v=4
    val bio: Any? = null, // null
    val blog: String? = null, // http://tom.preston-werner.com
    val company: String? = null, // @chatterbugapp, @redwoodjs, @preston-werner-ventures 
    val created_at: String? = null, // 2007-10-20T05:24:19Z
    val email: Any? = null, // null
    val events_url: String? = null, // https://api.github.com/users/mojombo/events{/privacy}
    val followers: Int? = null, // 23516
    val followers_url: String? = null, // https://api.github.com/users/mojombo/followers
    val following: Int? = null, // 11
    val following_url: String? = null, // https://api.github.com/users/mojombo/following{/other_user}
    val gists_url: String? = null, // https://api.github.com/users/mojombo/gists{/gist_id}
    val gravatar_id: String? = null,
    val hireable: Any? = null, // null
    val html_url: String? = null, // https://github.com/mojombo
    val id: Int? = null, // 1
    val location: String? = null, // San Francisco
    val login: String? = null, // mojombo
    val name: String? = null, // Tom Preston-Werner
    val node_id: String? = null, // MDQ6VXNlcjE=
    val organizations_url: String? = null, // https://api.github.com/users/mojombo/orgs
    val public_gists: Int? = null, // 62
    val public_repos: Int? = null, // 65
    val received_events_url: String? = null, // https://api.github.com/users/mojombo/received_events
    val repos_url: String? = null, // https://api.github.com/users/mojombo/repos
    val site_admin: Boolean? = null, // false
    val starred_url: String? = null, // https://api.github.com/users/mojombo/starred{/owner}{/repo}
    val subscriptions_url: String? = null, // https://api.github.com/users/mojombo/subscriptions
    val twitter_username: String? = null, // mojombo
    val type: String? = null, // User
    val updated_at: String? = null, // 2023-03-22T15:06:06Z
    val url: String? = null // https://api.github.com/users/mojombo
): Serializable