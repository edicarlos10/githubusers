package com.example.network.remote.response

import com.example.domain.users.model.UserDetail

data class UserDetailResponse(
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
) {
    fun toUserDetail(): UserDetail = UserDetail(
    avatar_url ?: "",// https://avatars.githubusercontent.com/u/1?v=4
    bio,// null
    blog ?: "",// http://tom.preston-werner.com
    company ?: "",// @chatterbugapp, @redwoodjs, @preston-werner-ventures 
    created_at ?: "",// 2007-10-20T05:24:19Z
    email,// null
    events_url ?: "",// https://api.github.com/users/mojombo/events{/privacy}
    followers ?: 0, // 23516
    followers_url ?: "",// https://api.github.com/users/mojombo/followers
    following ?: 0, // 11
    following_url ?: "",// https://api.github.com/users/mojombo/following{/other_user}
    gists_url ?: "",// https://api.github.com/users/mojombo/gists{/gist_id}
    gravatar_id ?: "",
    hireable,// null
    html_url ?: "",// https://github.com/mojombo
    id ?: 1, // 1
    location ?: "",// San Francisco
    login ?: "",// mojombo
    name ?: "",// Tom Preston-Werner
    node_id ?: "",// MDQ6VXNlcjE=
    organizations_url ?: "",// https://api.github.com/users/mojombo/orgs
    public_gists ?: 0, // 62
    public_repos ?: 0, // 65
    received_events_url ?: "",// https://api.github.com/users/mojombo/received_events
    repos_url ?: "",// https://api.github.com/users/mojombo/repos
    site_admin ?: false, // false
    starred_url ?: "",// https://api.github.com/users/mojombo/starred{/owner}{/repo}
    subscriptions_url ?: "",// https://api.github.com/users/mojombo/subscriptions
    twitter_username ?: "",// mojombo
    type ?: "",// User
    updated_at ?: "",// 2023-03-22T15:06:06Z
    url ?: "" // https://api.github.com/users/mojombo
    )
}