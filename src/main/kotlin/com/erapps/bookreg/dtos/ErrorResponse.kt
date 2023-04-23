package com.erapps.bookreg.dtos

import com.erapps.bookreg.utils.StatusCodes
import org.springframework.http.HttpStatusCode

data class ErrorResponse(
    val status: Boolean = false,
    val statusCode: HttpStatusCode = HttpStatusCode.valueOf(StatusCodes.BAD_REQUEST.code),
    val error: String
)
