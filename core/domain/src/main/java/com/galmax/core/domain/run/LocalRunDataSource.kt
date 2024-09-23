package com.galmax.core.domain.run

import com.galmax.core.domain.util.DataError
import com.galmax.core.domain.util.Result
import kotlinx.coroutines.flow.Flow

typealias RunId = String

interface LocalRunDataSource {

    fun getRuns(): Flow<List<Run>>

    suspend fun upsertRun(run: Run): Result<RunId, DataError.Local>

    suspend fun upsertRuns(runs: List<Run>): Result<List<RunId>, DataError.Local>

    suspend fun deleteRun(id: RunId)

    suspend fun deleteAllRuns()
}