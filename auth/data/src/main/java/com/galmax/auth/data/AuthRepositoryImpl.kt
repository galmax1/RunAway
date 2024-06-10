package com.galmax.auth.data

import com.galmax.auth.domain.AuthRepository
import com.galmax.core.data.networking.post
import com.galmax.core.domain.util.DataError
import com.galmax.core.domain.util.EmptyResult
import io.ktor.client.HttpClient

class AuthRepositoryImpl(
    private val httpClient: HttpClient
) : AuthRepository {

    override suspend fun register(email: String, password: String): EmptyResult<DataError.Network> {
        return httpClient.post<RegisterRequest, Unit>(
            route = "/register",
            body = RegisterRequest(
                email = email,
                password = password
            )
        )
    }
}