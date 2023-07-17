package com.business.expenseTracker.domain.usecase.write_database

import com.business.expenseTracker.data.local.entity.TransactionDto
import com.business.expenseTracker.domain.repository.TransactionRepository
import javax.inject.Inject

class InsertNewTransactionUseCase @Inject constructor(private val repo: TransactionRepository) {

    suspend operator fun invoke(dailyExpense: TransactionDto) {
        repo.insertTransaction(dailyExpense)
    }
}