package com.galmax.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.galmax.core.database.dao.AnalyticsDao
import com.galmax.core.database.dao.RunDao
import com.galmax.core.database.dao.RunPendingSyncDao
import com.galmax.core.database.entity.DeletedRunSyncEntity
import com.galmax.core.database.entity.RunEntity
import com.galmax.core.database.entity.RunPendingSyncEntity

@Database(
    entities = [
        RunEntity::class,
        RunPendingSyncEntity::class,
        DeletedRunSyncEntity::class,
    ],
    version = 1
)
abstract class RunDatabase : RoomDatabase() {

    abstract val runDao: RunDao
    abstract val runPendingSyncDao: RunPendingSyncDao
    abstract val analyticsDao: AnalyticsDao

}