package com.galmax.wear.run.presentation.di

import com.galmax.wear.run.presentation.TrackerViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val runPresentationModule = module {
    viewModelOf(::TrackerViewModel)
}