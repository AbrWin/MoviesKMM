package com.example.movieskmm.di

import com.example.movieskmm.Util.provideDispatcher
import com.example.movieskmm.data.remote.MovieService
import com.example.movieskmm.data.remote.RemoteDataSource
import com.example.movieskmm.data.repository.MovieRepositoryImpl
import com.example.movieskmm.domain.repository.MovieRepository
import com.example.movieskmm.domain.usecase.GetMoviesUseCase
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMoviesUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules