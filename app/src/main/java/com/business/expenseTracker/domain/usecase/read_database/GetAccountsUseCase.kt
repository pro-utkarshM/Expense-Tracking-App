package com.business.expenseTracker.domain.usecase.read_database

import com.business.expenseTracker.data.local.entity.AccountDto
import com.business.expenseTracker.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAccountsUseCase @Inject constructor(private val repo: TransactionRepository) {
    operator fun invoke(): Flow<List<AccountDto>> {
        return repo.getAccounts()
    }
}