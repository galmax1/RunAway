package com.galmax.auth.domain

import com.galmax.core.domain.util.DataError
import com.galmax.core.domain.util.EmptyResult

interface AuthRepository {

    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>

}