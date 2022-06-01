package net.denis.domain.repositories

import net.denis.domain.model.User

class UsersRepository {

    fun getUser(): User {

        return User(userId = 0, userName = "nameLastname")
    }


}