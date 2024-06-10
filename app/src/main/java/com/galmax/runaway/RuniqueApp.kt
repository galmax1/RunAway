package com.galmax.runaway

import android.app.Application
import com.galmax.auth.data.di.authDataModule
import com.galmax.auth.presentation.di.authViewModelModule
import com.galmax.core.data.di.coreDataModule
import com.galmax.runaway.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class RuniqueApp : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuniqueApp)
            modules(
                appModule,

                coreDataModule,

                authDataModule,
                authViewModelModule,
            )
        }
    }
}