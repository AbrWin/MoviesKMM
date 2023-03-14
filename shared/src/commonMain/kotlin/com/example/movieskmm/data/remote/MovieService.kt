package com.example.movieskmm.data.remote

import io.ktor.client.call.*
import io.ktor.client.request.*

internal class MovieService: KtorApi() {

    suspend fun getMovies(page: Int = 1):MoviesResponce = client.get {
        pathUrl("movie/popular")
        parameter("page", page)
    }.body()

    suspend fun getMovie(movideId: Int): MovieRemote = client.get{
        pathUrl("movie/${movideId}")
    }.body()
}