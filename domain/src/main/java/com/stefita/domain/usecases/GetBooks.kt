package com.stefita.domain.usecases

import com.stefita.domain.BooksRepository
import com.stefita.domain.common.Result
import com.stefita.domain.entities.Book
import com.stefita.domain.usecases.UseCase.None

open class GetBooks(private val booksRepository: BooksRepository) : UseCase<List<Book>, None>() {

    override suspend fun run(params: None): Result<List<Book>> {
        return booksRepository.getBooks()
    }
}