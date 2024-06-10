package com.galmax.auth.presentation.login

sealed interface LoginAction {
    data object OmTogglePasswordVisibility: LoginAction
    data object OnLoginClick: LoginAction
    data object OnRegisterClick: LoginAction
}