package com.stefita.domain.common

sealed class Result<T> {
    data class Success<T>(val data: T) : Result<T>()
    data class Failure<T>(val message: String? = null) : Result<T>()

    companion object {
        fun <T> of(data: T?): Result<T> = if (data == null) Failure() else Success(data)
    }
}