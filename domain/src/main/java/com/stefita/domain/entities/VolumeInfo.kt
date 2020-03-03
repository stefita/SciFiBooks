package com.stefita.domain.entities

data class VolumeInfo(
    val title: String,
    val subtitle: String,
    val authors: List<String>,
    val publisher: String,
    val publishedDate: String,
    val description: String,
    val industryIdentifiers: List<IndustryIdentifier>,
    val pageCount: Int,
    val categories: List<String>,
    val averageRating: Double,
    val ratingsCount: Int,
    val imageLinks: ImageLinks
)