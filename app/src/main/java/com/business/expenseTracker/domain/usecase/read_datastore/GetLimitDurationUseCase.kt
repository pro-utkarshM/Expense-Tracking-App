package com.business.expenseTracker.domain.usecase.read_datastore

import com.business.expenseTracker.domain.repository.DatastoreRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetLimitDurationUseCase @Inject constructor(
    private val datastoreRepository: DatastoreRepository
) {
    suspend operator fun invoke(): Flow<Int> {
        return datastoreRepository.readLimitDurationFromDataStore()
    }
}