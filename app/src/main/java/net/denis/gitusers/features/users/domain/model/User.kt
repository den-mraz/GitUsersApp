package net.denis.gitusers.features.users.domain.model

import android.media.Image

data class User(
    val userId: Int,
    val userName: String,
    val userAvatar: Image
    )
