package com.galmax.wear.app.presentation

import android.app.Application
import com.galmax.core.connectivity.data.di.coreConnectivityDataModule
import com.galmax.wear.app.presentation.di.appModule
import com.galmax.wear.run.data.di.wearRunDataModule
import com.galmax.wear.run.presentation.di.wearRunPresentationModule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class RunawayApp : Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@RunawayApp)
            modules(
                appModule,
                wearRunPresentationModule,
                wearRunDataModule,
                coreConnectivityDataModule
            )
        }
    }
}