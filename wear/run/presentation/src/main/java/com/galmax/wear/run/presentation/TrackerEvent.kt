package com.galmax.wear.run.presentation

sealed interface TrackerEvent {
    data object RunFinished: TrackerEvent
}