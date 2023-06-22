package com.example.domain.users.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Users(
    val id: Int? = null,
    val type: String? = null,
    val avatar_url: String? = null,
    val login: String? = null,
    val name: String? = null,
    val followers: Int? = null,
    val following: Int? = null,
    val public_repos: Int? = null
): Serializable