package com.example.movieskmm.data.remote

@kotlinx.serialization.Serializable
internal data class MoviesResponce(
    val results: List<MovieRemote>
)