package com.stefita.data.database

import androidx.room.Database
import com.stefita.data.entities.BookEntity
import com.stefita.data.entities.VolumeInfoEntity

@Database(entities = [
    BookEntity::class,
    VolumeInfoEntity::class
], version = 1)
abstract class BooksDatabase {

    abstract fun getBooksDao(): BooksDao
}