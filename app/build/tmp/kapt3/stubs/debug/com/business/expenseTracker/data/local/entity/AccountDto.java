package com.business.expenseTracker.data.local.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "account_table")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010!\u001a\u00020\"J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010\u00a8\u0006$"}, d2 = {"Lcom/business/expenseTracker/data/local/entity/AccountDto;", "", "id", "", "accountType", "", "balance", "", "income", "expense", "(ILjava/lang/String;DDD)V", "getAccountType", "()Ljava/lang/String;", "getBalance", "()D", "setBalance", "(D)V", "getExpense", "setExpense", "getId", "()I", "getIncome", "setIncome", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toAccount", "Lcom/business/expenseTracker/domain/model/Account;", "toString", "app_debug"})
public final class AccountDto {
    @androidx.room.ColumnInfo(name = "_id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "account")
    private final java.lang.String accountType = null;
    @androidx.room.ColumnInfo(name = "balance")
    private double balance;
    @androidx.room.ColumnInfo(name = "income")
    private double income;
    @androidx.room.ColumnInfo(name = "expense")
    private double expense;
    
    @org.jetbrains.annotations.NotNull
    public final com.business.expenseTracker.data.local.entity.AccountDto copy(int id, @org.jetbrains.annotations.NotNull
    java.lang.String accountType, double balance, double income, double expense) {
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
    
    public AccountDto(int id, @org.jetbrains.annotations.NotNull
    java.lang.String accountType, double balance, double income, double expense) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAccountType() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getBalance() {
        return 0.0;
    }
    
    public final void setBalance(double p0) {
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getIncome() {
        return 0.0;
    }
    
    public final void setIncome(double p0) {
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double getExpense() {
        return 0.0;
    }
    
    public final void setExpense(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.business.expenseTracker.domain.model.Account toAccount() {
        return null;
    }
}