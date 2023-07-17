package com.business.expenseTracker.domain.usecase.read_database

import com.business.expenseTracker.data.local.entity.TransactionDto
import com.business.expenseTracker.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetStartOfMonthTransaction @Inject constructor(
    private val transactionRepository: TransactionRepository
) {
    operator fun invoke(transactionType: String) : Flow<List<TransactionDto>> {
        return transactionRepository.getStartOfMonthTransaction(transactionType)
    }
}