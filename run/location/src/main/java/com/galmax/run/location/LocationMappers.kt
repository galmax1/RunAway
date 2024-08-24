package com.galmax.run.location

import android.location.Location
import com.galmax.core.domain.location.LocationWithAltitude

fun Location.toLocationWithAltitude() : LocationWithAltitude {
    return LocationWithAltitude(
        location = com.galmax.core.domain.location.Location(
            lat = latitude,
            long = longitude
        ),
        altitude = altitude
    )
}