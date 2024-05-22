package com.galmax.auth.presentation.register

import com.galmax.core.presentation.ui.UiText

sealed interface RegisterEvent {
    data object RegistrationSuccess : RegisterEvent
    data class Error(val error: UiText) : RegisterEvent
}