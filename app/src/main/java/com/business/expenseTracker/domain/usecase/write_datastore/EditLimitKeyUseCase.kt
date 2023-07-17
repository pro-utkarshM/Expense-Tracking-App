package com.business.expenseTracker.domain.usecase.write_datastore

import com.business.expenseTracker.domain.repository.DatastoreRepository
import javax.inject.Inject

class EditLimitKeyUseCase @Inject constructor(
    private val datastoreRepository: DatastoreRepository
) {
    suspend operator fun invoke(enabled: Boolean) {
        datastoreRepository.writeLimitKeyToDataStore(enabled)
    }
}