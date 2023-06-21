package com.example.domain.users.model

import java.io.Serializable

data class Owner(
    val avatar_url: String? = null, // https://avatars.githubusercontent.com/u/3?v=4
    val events_url: String? = null, // https://api.github.com/users/pjhyett/events{/privacy}
    val followers_url: String? = null, // https://api.github.com/users/pjhyett/followers
    val following_url: String? = null, // https://api.github.com/users/pjhyett/following{/other_user}
    val gists_url: String? = null, // https://api.github.com/users/pjhyett/gists{/gist_id}
    val gravatar_id: String? = null,
    val html_url: String? = null, // https://github.com/pjhyett
    val id: Int? = null, // 3
    val login: String? = null, // pjhyett
    val node_id: String? = null, // MDQ6VXNlcjM=
    val organizations_url: String? = null, // https://api.github.com/users/pjhyett/orgs
    val received_events_url: String? = null, // https://api.github.com/users/pjhyett/received_events
    val repos_url: String? = null, // https://api.github.com/users/pjhyett/repos
    val site_admin: Boolean? = null, // false
    val starred_url: String? = null, // https://api.github.com/users/pjhyett/starred{/owner}{/repo}
    val subscriptions_url: String? = null, // https://api.github.com/users/pjhyett/subscriptions
    val type: String? = null, // User
    val url: String? = null // https://api.github.com/users/pjhyett
): Serializable