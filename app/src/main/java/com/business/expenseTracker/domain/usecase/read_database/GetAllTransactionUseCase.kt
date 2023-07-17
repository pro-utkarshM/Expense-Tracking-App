package com.business.expenseTracker.domain.usecase.read_database

import com.business.expenseTracker.data.local.entity.TransactionDto
import com.business.expenseTracker.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllTransactionUseCase @Inject constructor(private val repo: TransactionRepository) {
    operator fun invoke(): Flow<List<TransactionDto>?> {
        return repo.getAllTransaction()
    }
}