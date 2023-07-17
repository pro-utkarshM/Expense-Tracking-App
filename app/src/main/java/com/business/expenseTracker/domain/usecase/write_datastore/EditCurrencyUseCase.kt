package com.business.expenseTracker.domain.usecase.write_datastore

import com.business.expenseTracker.domain.repository.DatastoreRepository
import javax.inject.Inject

class EditCurrencyUseCase @Inject constructor(private val datastoreRepository: DatastoreRepository) {
    suspend operator fun invoke(currency: String) {
        datastoreRepository.writeCurrencyToDataStore(currency)
    }
}