package com.business.expenseTracker.di

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.business.expenseTracker.data.local.TransactionDao
import com.business.expenseTracker.data.local.TransactionDatabase
import com.business.expenseTracker.data.local.prefs.PrefsRepositoryImpl
import com.business.expenseTracker.data.repository.DatastoreRepositoryImpl
import com.business.expenseTracker.data.repository.TransactionRepositoryImpl
import com.business.expenseTracker.domain.repository.DatastoreRepository
import com.business.expenseTracker.domain.repository.PrefsRepository
import com.business.expenseTracker.domain.repository.TransactionRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ExpenseTrackerModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(@ApplicationContext context: Context) =
        context.getSharedPreferences("main", Context.MODE_PRIVATE)

    @Provides
    @Singleton
    fun provideDatastoreRepository(@ApplicationContext context: Context) : DatastoreRepository {
        return DatastoreRepositoryImpl(context)
    }

    @Provides
    @Singleton
    fun provideExpenseRepository(transactionDao: TransactionDao) : TransactionRepository
        = TransactionRepositoryImpl(transactionDao)

    @Provides
    @Singleton
    fun providePrefsRepository(sharedPreferences: SharedPreferences): PrefsRepository
        = PrefsRepositoryImpl(sharedPreferences)

    @Provides
    @Singleton
    fun provideExpenseDatabase(@ApplicationContext context: Context) : TransactionDatabase {
        return Room.databaseBuilder(context, TransactionDatabase::class.java, "transactionDB")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideExpenseDao(database: TransactionDatabase) = database.transactionDao
}