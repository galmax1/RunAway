package com.galmax.wear.run.presentation

import com.galmax.core.presentation.ui.UiText

sealed interface TrackerEvent {
    data object RunFinished: TrackerEvent

    data class Error(val message: UiText): TrackerEvent
}