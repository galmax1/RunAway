package com.galmax.wear.app.presentation

import android.app.Application
import com.galmax.wear.run.presentation.di.runPresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class RunawayApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@RunawayApp)
            modules(
                runPresentationModule
            )
        }
    }
}