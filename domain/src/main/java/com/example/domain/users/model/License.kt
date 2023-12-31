package com.example.domain.users.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class License(
    val key: String? = null, // mit
    val name: String? = null, // MIT License
    val node_id: String? = null, // MDc6TGljZW5zZTEz
    val spdx_id: String? = null, // MIT
    val url: String? = null  // https://api.github.com/licenses/mit
): Parcelable