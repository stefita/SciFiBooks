package com.stefita.domain

import com.stefita.domain.common.Result
import com.stefita.domain.entities.Book

interface BooksRepository {
    fun getBooks(): Result<List<Book>>
    fun getBook(bookId: String): Result<Book>
}