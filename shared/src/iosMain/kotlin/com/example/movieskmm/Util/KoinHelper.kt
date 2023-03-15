package com.example.movieskmm.Util

import com.example.movieskmm.di.getSharedModules
import org.koin.core.context.startKoin

fun initKoin(){
    startKoin {
        modules(getSharedModules())
    }
}