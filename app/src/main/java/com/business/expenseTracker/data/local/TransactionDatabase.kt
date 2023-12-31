package com.business.expenseTracker.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.business.expenseTracker.data.local.converter.DateConverter
import com.business.expenseTracker.data.local.entity.AccountDto
import com.business.expenseTracker.data.local.entity.TransactionDto

@TypeConverters(value = [DateConverter::class])
@Database(entities = [TransactionDto::class, AccountDto::class], exportSchema = true, version = 1)
abstract class TransactionDatabase: RoomDatabase() {
    abstract val transactionDao: TransactionDao
}