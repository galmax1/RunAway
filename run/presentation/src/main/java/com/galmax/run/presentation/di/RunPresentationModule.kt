@file:OptIn(ExperimentalCoroutinesApi::class)

package com.galmax.run.presentation.di

import com.galmax.run.domain.RunningTracker
import com.galmax.run.presentation.active_run.ActiveRunViewModel
import com.galmax.run.presentation.run_overview.RunOverviewViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val runPresentationModule = module {
    singleOf(::RunningTracker)
    single {
        get<RunningTracker>().elapsedTime
    }

    viewModelOf(::RunOverviewViewModel)
    viewModelOf(::ActiveRunViewModel)
}