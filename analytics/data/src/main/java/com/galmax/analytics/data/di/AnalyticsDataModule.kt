package com.galmax.analytics.data.di

import com.galmax.analytics.data.RoomAnalyticsRepository
import com.galmax.analytics.domain.AnalyticsRepository
import com.galmax.core.database.RunDatabase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val analyticsModule = module {
    singleOf(::RoomAnalyticsRepository).bind<AnalyticsRepository>()
    single {
        get<RunDatabase>().analyticsDao
    }
}