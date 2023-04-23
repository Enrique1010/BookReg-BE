package com.erapps.bookreg.dtos

data class ListResponse<T>(
    val status: Boolean = true,
    val message: String = "",
    val page: Int = 1,
    val pageCount: Int = 10,
    val data: List<T> = emptyList()
)