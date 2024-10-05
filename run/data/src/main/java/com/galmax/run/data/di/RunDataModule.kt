package com.galmax.run.data.di

import com.galmax.core.domain.run.SyncRunScheduler
import com.galmax.run.data.CreateRunWorker
import com.galmax.run.data.DeleteRunWorker
import com.galmax.run.data.FetchRunsWorker
import com.galmax.run.data.SyncRunWorkerScheduler
import org.koin.androidx.workmanager.dsl.workerOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val runDataModule = module {
    workerOf(::CreateRunWorker)
    workerOf(::FetchRunsWorker)
    workerOf(::DeleteRunWorker)

    singleOf(::SyncRunWorkerScheduler).bind<SyncRunScheduler>()
}