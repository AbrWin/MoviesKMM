package com.example.movieskmm.data.util

import com.example.movieskmm.domain.model.Movie
import com.example.movieskmm.data.remote.MovieRemote

internal fun MovieRemote.toMovie(): Movie {
    return Movie(
        movieId = movieId,
        title = title,
        overview  = overview,
        release_date = release_date,
        poster_path = getImageUrl(poster_path)
    )
}

private fun getImageUrl(posterImg: String) = "https://image.tmdb.org/t/p/original/${posterImg}"