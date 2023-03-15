package com.example.movieskmm.data.remote

import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

private const val BASE_URL = "https://api.themoviedb.org/"
private const val API_KEY = "8ac3bea5e0e63f1b4c5f608d2f31b372"

internal abstract class KtorApi {
    val client = HttpClient {
        install(ContentNegotiation){
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames  = false
            })
        }
    }

    fun HttpRequestBuilder.pathUrl(path: String){
        url {
            takeFrom(BASE_URL)
            path("3",path)
            parameter("api_key", API_KEY)
        }

        println("MSJ->${url.buildString()}")
    }
}