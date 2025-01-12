package com.preonboarding.sensordashboard.domain.repository

import androidx.paging.PagingData
import com.preonboarding.sensordashboard.domain.model.SensorHistory
import kotlinx.coroutines.flow.Flow

interface SensorHistoryRepository {
    fun getSensorHistoryList(): Flow<List<SensorHistory>>
    suspend fun saveSensorHistory(sensorHistory: SensorHistory)
    suspend fun deleteSensorHistory(sensorHistory: SensorHistory)
    suspend fun getSensorDataList(): Flow<PagingData<SensorHistory>>
}