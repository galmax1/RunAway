package com.galmax.wear.run.domain

import com.galmax.core.connectivity.domain.DeviceNode
import com.galmax.core.connectivity.domain.messaging.MessagingAction
import com.galmax.core.connectivity.domain.messaging.MessagingError
import com.galmax.core.domain.util.EmptyResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

interface PhoneConnector {
    val connectedDevice: StateFlow<DeviceNode?>
    val messagingActions: Flow<MessagingAction>

    suspend fun sendActionToPhone(action: MessagingAction): EmptyResult<MessagingError>
}