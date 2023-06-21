package com.example.network.remote.response

import com.example.domain.users.model.License

data class LicenseResponse(
    val key: String? = null, // mit
    val name: String? = null, // MIT License
    val node_id: String? = null, // MDc6TGljZW5zZTEz
    val spdx_id: String? = null, // MIT
    val url: String? = null  // https://api.github.com/licenses/mit
) {
    fun toLicenseResponse() : License = License(
        key ?: "",
        name ?: "",
        node_id ?: "",
        spdx_id ?: "",
        url ?: ""
    )
}