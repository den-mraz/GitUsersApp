package net.denis.domain.api

class GitUsersApiResponse(val items: List<Item>)

data class Item(val name : String)