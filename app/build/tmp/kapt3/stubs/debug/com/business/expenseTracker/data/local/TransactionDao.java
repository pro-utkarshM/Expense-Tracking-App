package com.business.expenseTracker.data.local;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0006\u0010\u000e\u001a\u00020\tH\'J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u0005H\'J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\'J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0013\u001a\u00020\tH\'J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u001e\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\'J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0018\u001a\u00020\tH\'J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u001e\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\'J\u001f\u0010\u001b\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 \u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/business/expenseTracker/data/local/TransactionDao;", "", "eraseTransaction", "", "get14DayTransaction", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/business/expenseTracker/data/local/entity/TransactionDto;", "transactionType", "", "get3DayTransaction", "get7DayTransaction", "getAccount", "Lcom/business/expenseTracker/data/local/entity/AccountDto;", "account", "getAccounts", "getAllTransaction", "getCurrentDayExpTransaction", "getDailyTransaction", "entryDate", "getLastMonthTransaction", "getMonthlyExpTransaction", "getStartOfMonthTransaction", "getTransactionByAccount", "accountType", "getTransactionByType", "getWeeklyExpTransaction", "insertAccounts", "accounts", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTransaction", "transaction", "(Lcom/business/expenseTracker/data/local/entity/TransactionDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TransactionDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertTransaction(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.data.local.entity.TransactionDto transaction, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertAccounts(@org.jetbrains.annotations.NotNull
    java.util.List<com.business.expenseTracker.data.local.entity.AccountDto> accounts, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM transaction_table WHERE entry_date = :entryDate")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getDailyTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String entryDate);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM transaction_table WHERE account = :accountType")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getTransactionByAccount(@org.jetbrains.annotations.NotNull
    java.lang.String accountType);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM account_table WHERE account = :account")
    public abstract kotlinx.coroutines.flow.Flow<com.business.expenseTracker.data.local.entity.AccountDto> getAccount(@org.jetbrains.annotations.NotNull
    java.lang.String account);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM account_table")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.AccountDto>> getAccounts();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM transaction_table")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getAllTransaction();
    
    @androidx.room.Query(value = "DELETE FROM transaction_table")
    public abstract void eraseTransaction();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM transaction_table WHERE entry_date = date(\'now\', \'localtime\') AND transaction_type = :transactionType")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getCurrentDayExpTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM transaction_table WHERE entry_date BETWEEN date(\'now\', \'-7 day\') AND date(\'now\', \'localtime\') AND transaction_type = :transactionType")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getWeeklyExpTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM transaction_table WHERE entry_date BETWEEN date(\'now\', \'-1 month\') AND date(\'now\', \'localtime\') AND transaction_type = :transactionType")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getMonthlyExpTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM transaction_table WHERE entry_date >= date(\'now\', \'-3 day\') AND entry_date < date(\'now\', \'localtime\') AND transaction_type = :transactionType")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> get3DayTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM transaction_table WHERE entry_date >= date(\'now\', \'-7 day\') AND entry_date < date(\'now\', \'localtime\') AND transaction_type = :transactionType")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> get7DayTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM transaction_table WHERE entry_date >= date(\'now\', \'-14 day\') AND entry_date < date(\'now\', \'localtime\') AND transaction_type = :transactionType")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> get14DayTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM transaction_table WHERE entry_date >= date(\'now\', \'start of month\') AND entry_date < date(\'now\', \'localtime\') AND transaction_type = :transactionType")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getStartOfMonthTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM transaction_table WHERE entry_date >= date(\'now\', \'-1 month\') AND entry_date < date(\'now\', \'localtime\') AND transaction_type = :transactionType")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getLastMonthTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM transaction_table WHERE transaction_type = :transactionType")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.business.expenseTracker.data.local.entity.TransactionDto>> getTransactionByType(@org.jetbrains.annotations.NotNull
    java.lang.String transactionType);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
}