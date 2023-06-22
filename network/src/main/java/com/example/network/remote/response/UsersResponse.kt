package com.example.network.remote.response

import com.example.domain.users.model.Users

data class UsersResponse(
    val id: Int? = null,
    val type: String? = null,
    val avatar_url: String? = null,
    val login: String? = null,
    val name: String? = null,
    val followers: Int? = null,
    val following: Int? = null,
    val public_repos: Int? = null
) {
    fun toUsers(): Users = Users(
        id ?: 0,
        type ?: "",
        avatar_url ?: "",
        login ?: "",
        name ?: "",
        followers ?: 0,
        following ?: 0,
        public_repos ?: 0
    )
}