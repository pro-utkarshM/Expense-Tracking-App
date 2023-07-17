package com.business.expenseTracker.domain.usecase.write_database

import com.business.expenseTracker.data.local.entity.AccountDto
import com.business.expenseTracker.domain.repository.TransactionRepository
import javax.inject.Inject

class InsertAccountsUseCase @Inject constructor(private val repo: TransactionRepository) {

    suspend operator fun invoke(account: List<AccountDto>) {
        repo.insertAccount(account)
    }
}