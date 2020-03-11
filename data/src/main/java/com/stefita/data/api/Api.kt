package com.stefita.data.api

import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("volumes")
    fun getSciFiBooks(
        @Query("q") query: String = "subject:\"Science Fiction\""
    )
}