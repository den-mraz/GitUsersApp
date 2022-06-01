package net.denis.data.repositories

import net.denis.data.model.UserParams

class UserRepository {

    fun getName(): UserParams {
        return UserParams(0, "TestName0")
    }
}