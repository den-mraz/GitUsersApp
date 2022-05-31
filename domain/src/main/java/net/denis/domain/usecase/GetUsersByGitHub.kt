package net.denis.domain.usecase

import net.denis.domain.model.User

class GetUsersByGitHub {

    fun execute(): User {
         return User(userId = 0, userName = "den-mraz")
    }
}