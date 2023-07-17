package com.business.expenseTracker.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\bH\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u001f\u0010\u001e\u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/business/expenseTracker/data/repository/TransactionRepositoryImpl;", "Lcom/business/expenseTracker/domain/repository/TransactionRepository;", "dao", "Lcom/business/expenseTracker/data/local/TransactionDao;", "(Lcom/business/expenseTracker/data/local/TransactionDao;)V", "eraseTransaction", "", "get14DayTransaction", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/business/expenseTracker/data/local/entity/TransactionDto;", "transactionType", "", "get3DayTransaction", "get7DayTransaction", "getAccount", "Lcom/business/expenseTracker/data/local/entity/AccountDto;", "account", "getAccounts", "getAllTransaction", "getCurrentDayExpTransaction", "getDailyTransaction", "entryDate", "getLastMonthTransaction", "getMonthlyExpTransaction", "getStartOfMonthTransaction", "getTransactionByAccount", "accountType", "getTransactionByType", "getWeeklyExpTransaction", "insertAccount", "accounts", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTransaction", "dailyExpense", "(Lcom/business/expenseTracker/data/local/entity/TransactionDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TransactionRepositoryImpl implements com.business.expenseTracker.domain.repository.TransactionRepository {
    private final com.business.expenseTracker.data.local.TransactionDao dao = null;
    
    @javax.inject.Inject
    public TransactionRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.data.local.TransactionDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertTransaction(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.data.local.entity.TransactionDto dailyExpense, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertAccount(@org.jetbrains.annotations.NotNull
    java.util.List<com.business.expenseTracker.data.local.entity.AccountDto> accounts, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getTransactionByAccount(@org.jetbrains.annotations.NotNull
    java.lang.String accountType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getDailyTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String entryDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.business.expenseTracker.data.local.entity.AccountDto> getAccount(@org.jetbrains.annotations.NotNull
    java.lang.String account) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.AccountDto>> getAccounts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getAllTransaction() {
        return null;
    }
    
    @java.lang.Override
    public void eraseTransaction() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getCurrentDayExpTransaction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getWeeklyExpTransaction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getMonthlyExpTransaction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> get3DayTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> get7DayTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> get14DayTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getStartOfMonthTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getLastMonthTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getTransactionByType(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType) {
        return null;
    }
}