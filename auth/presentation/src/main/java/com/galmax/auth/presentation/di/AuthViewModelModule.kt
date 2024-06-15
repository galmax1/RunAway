package com.galmax.auth.presentation.di

import com.galmax.auth.presentation.login.LoginViewModel
import com.galmax.auth.presentation.register.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val authViewModelModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::LoginViewModel)
}