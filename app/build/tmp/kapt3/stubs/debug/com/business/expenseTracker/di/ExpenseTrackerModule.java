package com.business.expenseTracker.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u001a\u0010\u0013\u001a\n \u0014*\u0004\u0018\u00010\u00120\u00122\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/business/expenseTracker/di/ExpenseTrackerModule;", "", "()V", "provideDatastoreRepository", "Lcom/business/expenseTracker/domain/repository/DatastoreRepository;", "context", "Landroid/content/Context;", "provideExpenseDao", "Lcom/business/expenseTracker/data/local/TransactionDao;", "database", "Lcom/business/expenseTracker/data/local/TransactionDatabase;", "provideExpenseDatabase", "provideExpenseRepository", "Lcom/business/expenseTracker/domain/repository/TransactionRepository;", "transactionDao", "providePrefsRepository", "Lcom/business/expenseTracker/domain/repository/PrefsRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "provideSharedPreferences", "kotlin.jvm.PlatformType", "app_debug"})
@dagger.Module
public final class ExpenseTrackerModule {
    @org.jetbrains.annotations.NotNull
    public static final com.business.expenseTracker.di.ExpenseTrackerModule INSTANCE = null;
    
    private ExpenseTrackerModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    public final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.business.expenseTracker.domain.repository.DatastoreRepository provideDatastoreRepository(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.business.expenseTracker.domain.repository.TransactionRepository provideExpenseRepository(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.data.local.TransactionDao transactionDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.business.expenseTracker.domain.repository.PrefsRepository providePrefsRepository(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.business.expenseTracker.data.local.TransactionDatabase provideExpenseDatabase(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.business.expenseTracker.data.local.TransactionDao provideExpenseDao(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.data.local.TransactionDatabase database) {
        return null;
    }
}