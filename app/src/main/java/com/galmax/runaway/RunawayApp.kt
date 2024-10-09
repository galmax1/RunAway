package com.galmax.runaway

import android.app.Application
import android.content.Context
import com.galmax.auth.data.di.authDataModule
import com.galmax.auth.presentation.di.authViewModelModule
import com.galmax.core.connectivity.data.di.coreConnectivityDataModule
import com.galmax.core.data.di.coreDataModule
import com.galmax.core.database.di.databaseModule
import com.galmax.run.data.di.runDataModule
import com.galmax.run.location.di.locationModule
import com.galmax.run.network.di.networkModule
import com.galmax.run.presentation.di.runPresentationModule
import com.galmax.runaway.di.appModule
import com.google.android.play.core.splitcompat.SplitCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.workmanager.koin.workManagerFactory
import org.koin.core.context.startKoin
import timber.log.Timber

class RunawayApp : Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RunawayApp)
            workManagerFactory()
            modules(
                appModule,
                coreDataModule,
                authDataModule,
                authViewModelModule,
                runPresentationModule,
                locationModule,
                databaseModule,
                networkModule,
                runDataModule,
                coreConnectivityDataModule
            )
        }
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        SplitCompat.install(this)
    }
}