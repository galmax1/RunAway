package com.galmax.core.data.di

import com.galmax.core.data.auth.EncryptedSessionStorage
import com.galmax.core.data.networking.HttpClientFactory
import com.galmax.core.domain.SessionStorage
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory(get()).build()
    }
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()
}