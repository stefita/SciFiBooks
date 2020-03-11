package com.stefita.data.api

import com.google.gson.annotations.SerializedName
import com.stefita.domain.entities.Book

class BooksResult {

    @SerializedName("items")
    lateinit var books: List<Book>
}