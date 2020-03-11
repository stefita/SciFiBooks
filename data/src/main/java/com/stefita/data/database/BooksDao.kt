package com.stefita.data.database

import androidx.room.Dao
import androidx.room.Query
import com.stefita.data.entities.BookEntity

@Dao
interface BooksDao {

    @Query("SELECT * FROM books")
    fun getSciFiBooks(): List<BookEntity>
}