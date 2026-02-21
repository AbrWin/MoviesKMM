package com.example.movieskmm.data.mapper

import com.example.movieskmm.data.remote.MovieRemote
import com.example.movieskmm.domain.model.Movie

internal fun MovieRemote.toDomain(): Movie {
    return Movie(
        id = id,
        title = title,
        description = overview,
        imageUrl = posterImage,
        releaseDate = releaseDate
    )
}