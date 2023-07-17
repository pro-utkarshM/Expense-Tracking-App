package com.business.expenseTracker.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0006\u0010\u000e\u001a\u00020\tH&J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u0005H&J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0013\u001a\u00020\tH&J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0018\u001a\u00020\tH&J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&J\u001f\u0010\u001b\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 \u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/business/expenseTracker/domain/repository/TransactionRepository;", "", "eraseTransaction", "", "get14DayTransaction", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/business/expenseTracker/data/local/entity/TransactionDto;", "transactionType", "", "get3DayTransaction", "get7DayTransaction", "getAccount", "Lcom/business/expenseTracker/data/local/entity/AccountDto;", "account", "getAccounts", "getAllTransaction", "getCurrentDayExpTransaction", "getDailyTransaction", "entryDate", "getLastMonthTransaction", "getMonthlyExpTransaction", "getStartOfMonthTransaction", "getTransactionByAccount", "accountType", "getTransactionByType", "getWeeklyExpTransaction", "insertAccount", "accounts", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTransaction", "dailyExpense", "(Lcom/business/expenseTracker/data/local/entity/TransactionDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TransactionRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertTransaction(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.data.local.entity.TransactionDto dailyExpense, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertAccount(@org.jetbrains.annotations.NotNull
    java.util.List<com.business.expenseTracker.data.local.entity.AccountDto> accounts, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getDailyTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String entryDate);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getTransactionByAccount(@org.jetbrains.annotations.NotNull
    java.lang.String accountType);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.business.expenseTracker.data.local.entity.AccountDto> getAccount(@org.jetbrains.annotations.NotNull
    java.lang.String account);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.AccountDto>> getAccounts();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getAllTransaction();
    
    public abstract void eraseTransaction();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getCurrentDayExpTransaction();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getWeeklyExpTransaction();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getMonthlyExpTransaction();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> get3DayTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> get7DayTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> get14DayTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getStartOfMonthTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getLastMonthTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getTransactionByType(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType);
}