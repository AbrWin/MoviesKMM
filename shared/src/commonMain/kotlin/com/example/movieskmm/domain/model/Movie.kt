package com.example.movieskmm.domain.model

data class Movie(
    val movieId: Int,
    val title: String,
    val release_date: String,
    val poster_path: String,
    val overview: String,
)
