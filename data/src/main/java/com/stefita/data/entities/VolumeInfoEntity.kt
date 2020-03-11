package com.stefita.data.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE

@Entity(
    tableName = "volume_info",
    foreignKeys = [
        ForeignKey(
            entity = BookEntity::class,
            childColumns = ["bookId"],
            parentColumns = ["id"],
            onDelete = CASCADE
        )]
)
data class VolumeInfoEntity(
    val bookId: String,
    val title: String,
    val subtitle: String,
    val authors: List<String>,
    val publisher: String,
    val publishedDate: String,
    val description: String,
    val industryIdentifiers: List<IndustryIdentifierEntry>,
    val pageCount: Int,
    val categories: List<String>,
    val averageRating: Double,
    val ratingsCount: Int,
    @Embedded(prefix = "il") val imageLinks: ImageLinksFields
) {
    data class ImageLinksFields(
        val smallThumbnail: String,
        val thumbnail: String
    )

    data class IndustryIdentifierEntry(
        val type: String,
        val identifier: String
    )
}