package com.example.movieskmm.data.repository

import com.example.movieskmm.data.remote.RemoteDataSource
import com.example.movieskmm.data.util.toMovie
import com.example.movieskmm.domain.model.Movie
import com.example.movieskmm.domain.repository.MovieRepository

internal class MovieRepositoryImpl(
    private val remoteDataSource: RemoteDataSource
) : MovieRepository {

    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDataSource.getMovies(page).results
            .map {
                it.toMovie()
            }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDataSource.getMovie(movieId).toMovie()
    }

}