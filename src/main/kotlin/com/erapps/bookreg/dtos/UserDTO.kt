package com.erapps.bookreg.dtos

data class UserDTO(
    val id: Long,
    val name: String,
    val email: String,
    val role: String,
    val pictureRef: String,
    val createdAt: String
)
