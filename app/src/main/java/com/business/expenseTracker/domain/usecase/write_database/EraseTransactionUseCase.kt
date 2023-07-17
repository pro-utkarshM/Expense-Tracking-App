package com.business.expenseTracker.domain.usecase.write_database

import com.business.expenseTracker.domain.repository.TransactionRepository
import javax.inject.Inject

class EraseTransactionUseCase @Inject constructor(
    private val repository: TransactionRepository
) {
    operator fun invoke() {
        repository.eraseTransaction()
    }
}