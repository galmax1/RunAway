package com.galmax.auth.data.di

import com.galmax.auth.data.AuthRepositoryImpl
import com.galmax.auth.data.EmailPatternValidator
import com.galmax.auth.domain.AuthRepository
import com.galmax.auth.domain.PatternValidator
import com.galmax.auth.domain.UserDataValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
    singleOf(::AuthRepositoryImpl).bind<AuthRepository>()
}