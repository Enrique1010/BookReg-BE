package com.erapps.bookreg.dtos

data class MagazineDTO(
    val id: Long,
    val title: String,
    val author: String,
    val isbn: String,
    val publisher: String,
    val year: Int,
    val createdAt: String,
)
