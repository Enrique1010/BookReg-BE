package com.erapps.bookreg.models

import com.erapps.bookreg.dtos.UserDTO

data class User(
    val id: Long,
    val name: String,
    val email: String,
    val password: String,
    val role: String,
    val pictureRef: String,
    val createdAt: String,
    val updatedAt: String
)

fun User.toUserDTO(): UserDTO {
    return UserDTO(
        id = this.id,
        name = this.name,
        email = this.email,
        role = this.role,
        pictureRef = this.pictureRef,
        createdAt = this.createdAt
    )
}
