package com.example.movieskmm.android

import android.app.Application
import com.example.movieskmm.android.di.appModule
import com.example.movieskmm.di.getSharedModules
import org.koin.core.context.startKoin

class Movie:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            modules(appModule+ getSharedModules())
        }
    }
}