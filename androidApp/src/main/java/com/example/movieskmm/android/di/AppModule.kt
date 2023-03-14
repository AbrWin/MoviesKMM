package com.example.movieskmm.android.di

import com.example.movieskmm.android.detail.DetailViewModel
import com.example.movieskmm.android.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModel(getMoviesUseCase = get()) }
    viewModel { params -> DetailViewModel( getMovieUseCase = get (),movieId = params.get()) }
}