package com.example.movieskmm.data.util

import com.example.movieskmm.domain.model.Movie
import com.example.movieskmm.data.remote.MovieRemote

internal fun MovieRemote.toMovie(): Movie {
    return Movie(
        id = id,
        title = title,
        description  = overview,
        imageUrl = getImageUrl(posterImage),
        releaseDate = releaseDate,
    )
}

private fun getImageUrl(posterImg: String) = "https://image.tmdb.org/t/p/original/${posterImg}"