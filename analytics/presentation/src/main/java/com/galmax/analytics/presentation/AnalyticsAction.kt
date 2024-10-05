package com.galmax.analytics.presentation

sealed interface AnalyticsAction {
    data object OnBackClick: AnalyticsAction
}