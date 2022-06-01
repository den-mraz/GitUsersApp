package net.denis.data.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GitUsersApi {

    @GET("")
    suspend fun getUsers(@Query("q") userName: String): Response<GitUsersApiResponse>

}