package com.example.movieskmm.data.remote

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
internal data class MovieRemote(
    @SerialName("movieId") val movieId: Int,
    @SerialName("title") val title: String,
    @SerialName("release_date") val release_date: String,
    @SerialName("poster_path") val poster_path: String,
    @SerialName("overview") val overview: String,
)
