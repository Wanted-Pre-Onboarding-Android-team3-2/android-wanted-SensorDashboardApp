package com.preonboarding.sensordashboard.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sensor_history_table")
data class SensorHistory(
    @PrimaryKey
    val id: Long,
    val type: String,
    @ColumnInfo(defaultValue = "CURRENT_TIMESTAMP")
    val publishedAt: String,
    val period: Double,
//    val xList: List<Double>,
//    val yList: List<Double>,
//    val zList: List<Double>,
)