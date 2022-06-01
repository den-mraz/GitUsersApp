package net.denis.domain.repositories

import net.denis.domain.model.UserParams

class UserRepository {

    fun getName(): UserParams {
        return UserParams(0, "TestName0")
    }
}