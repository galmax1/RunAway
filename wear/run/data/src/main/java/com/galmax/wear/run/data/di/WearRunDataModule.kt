package com.galmax.wear.run.data.di

import com.galmax.wear.run.data.HealthServicesExerciseTracker
import com.galmax.wear.run.data.connectivity.WatchToPhoneConnector
import com.galmax.wear.run.domain.ExerciseTracker
import com.galmax.wear.run.domain.PhoneConnector
import com.galmax.wear.run.domain.RunningTracker
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val wearRunDataModule = module {
    singleOf(::HealthServicesExerciseTracker).bind<ExerciseTracker>()
    singleOf(::WatchToPhoneConnector).bind<PhoneConnector>()
    singleOf(::RunningTracker)
}