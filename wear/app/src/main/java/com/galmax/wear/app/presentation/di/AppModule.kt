package com.galmax.wear.app.presentation.di

import com.galmax.wear.app.presentation.RunawayApp
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = module {

    single {
        (androidApplication() as RunawayApp).applicationScope
    }
}