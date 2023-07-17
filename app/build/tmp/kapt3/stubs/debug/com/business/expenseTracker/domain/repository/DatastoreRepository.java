package com.business.expenseTracker.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/business/expenseTracker/domain/repository/DatastoreRepository;", "", "eraseDataStore", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readCurrencyFromDataStore", "Lkotlinx/coroutines/flow/Flow;", "", "readExpenseLimitFromDataStore", "", "readLimitDurationFromDataStore", "", "readLimitKeyFromDataStore", "", "readOnboardingKeyFromDataStore", "writeCurrencyToDataStore", "currency", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeExpenseLimitToDataStore", "amount", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeLimitDurationToDataStore", "duration", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeLimitKeyToDataStore", "enabled", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeOnboardingKeyToDataStore", "completed", "app_debug"})
public abstract interface DatastoreRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object writeOnboardingKeyToDataStore(boolean completed, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object readOnboardingKeyFromDataStore(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Boolean>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object writeCurrencyToDataStore(@org.jetbrains.annotations.NotNull
    java.lang.String currency, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object readCurrencyFromDataStore(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.String>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object writeExpenseLimitToDataStore(double amount, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object readExpenseLimitFromDataStore(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Double>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object writeLimitKeyToDataStore(boolean enabled, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object readLimitKeyFromDataStore(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Boolean>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object writeLimitDurationToDataStore(int duration, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object readLimitDurationFromDataStore(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Integer>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object eraseDataStore(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}