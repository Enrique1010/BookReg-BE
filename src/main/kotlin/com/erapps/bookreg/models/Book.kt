package com.erapps.bookreg.models

import com.erapps.bookreg.dtos.BookDTO

data class Book(
    val id: Long,
    val title: String,
    val author: String,
    val isbn: String,
    val publisher: String,
    val year: Int,
    val createdAt: String,
    val updatedAt: String,
    val uploadedByUserId: Long,
    val uploadedByUser: User
)

fun Book.toBookDTO(): BookDTO {
    return BookDTO(
        id = this.id,
        title = this.title,
        author = this.author,
        isbn = this.isbn,
        publisher = this.publisher,
        year = this.year,
        createdAt = this.createdAt
    )
}