package com.erapps.bookreg.dtos

data class Response <T>(
    val status: Boolean = true,
    val message: String = "",
    val data: T? = null
)
