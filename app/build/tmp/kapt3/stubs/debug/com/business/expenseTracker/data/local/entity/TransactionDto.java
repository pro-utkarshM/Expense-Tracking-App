package com.business.expenseTracker.data.local.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "transaction_table")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010%\u001a\u00020&R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lcom/business/expenseTracker/data/local/entity/TransactionDto;", "", "date", "Ljava/util/Date;", "dateOfEntry", "", "amount", "", "account", "category", "transactionType", "title", "(Ljava/util/Date;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "getAmount", "()D", "getCategory", "getDate", "()Ljava/util/Date;", "getDateOfEntry", "getTitle", "getTransactionType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "toTransaction", "Lcom/business/expenseTracker/domain/model/Transaction;", "app_debug"})
public final class TransactionDto {
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "timestamp")
    @androidx.room.PrimaryKey
    private final java.util.Date date = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "entry_date")
    private final java.lang.String dateOfEntry = null;
    @androidx.room.ColumnInfo(name = "amount")
    private final double amount = 0.0;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "account")
    private final java.lang.String account = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "category")
    private final java.lang.String category = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "transaction_type")
    private final java.lang.String transactionType = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "transaction_title")
    private final java.lang.String title = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.business.expenseTracker.data.local.entity.TransactionDto copy(@org.jetbrains.annotations.NotNull
    java.util.Date date, @org.jetbrains.annotations.NotNull
    java.lang.String dateOfEntry, double amount, @org.jetbrains.annotations.NotNull
    java.lang.String account, @org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    java.lang.String transactionType, @org.jetbrains.annotations.NotNull
    java.lang.String title) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public TransactionDto(@org.jetbrains.annotations.NotNull
    java.util.Date date, @org.jetbrains.annotations.NotNull
    java.lang.String dateOfEntry, double amount, @org.jetbrains.annotations.NotNull
    java.lang.String account, @org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    java.lang.String transactionType, @org.jetbrains.annotations.NotNull
    java.lang.String title) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDateOfEntry() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getAmount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTransactionType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.business.expenseTracker.domain.model.Transaction toTransaction() {
        return null;
    }
}