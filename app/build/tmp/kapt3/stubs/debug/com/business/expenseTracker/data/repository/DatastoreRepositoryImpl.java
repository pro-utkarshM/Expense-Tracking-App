package com.business.expenseTracker.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0019\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0019\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/business/expenseTracker/data/repository/DatastoreRepositoryImpl;", "Lcom/business/expenseTracker/domain/repository/DatastoreRepository;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "datastore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "expenseLimit", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "limitDuration", "", "limitKey", "", "onBoardingKey", "selectedCurrency", "", "eraseDataStore", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readCurrencyFromDataStore", "Lkotlinx/coroutines/flow/Flow;", "readExpenseLimitFromDataStore", "readLimitDurationFromDataStore", "readLimitKeyFromDataStore", "readOnboardingKeyFromDataStore", "writeCurrencyToDataStore", "currency", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeExpenseLimitToDataStore", "amount", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeLimitDurationToDataStore", "duration", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeLimitKeyToDataStore", "enabled", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeOnboardingKeyToDataStore", "completed", "app_debug"})
public final class DatastoreRepositoryImpl implements com.business.expenseTracker.domain.repository.DatastoreRepository {
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> datastore = null;
    private final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> onBoardingKey = null;
    private final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> limitKey = null;
    private final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> selectedCurrency = null;
    private final androidx.datastore.preferences.core.Preferences.Key<java.lang.Double> expenseLimit = null;
    private final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> limitDuration = null;
    
    @javax.inject.Inject
    public DatastoreRepositoryImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object writeOnboardingKeyToDataStore(boolean completed, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object readOnboardingKeyFromDataStore(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Boolean>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object writeCurrencyToDataStore(@org.jetbrains.annotations.NotNull
    java.lang.String currency, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object readCurrencyFromDataStore(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.String>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object writeExpenseLimitToDataStore(double amount, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object readExpenseLimitFromDataStore(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Double>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object writeLimitKeyToDataStore(boolean enabled, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object readLimitKeyFromDataStore(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Boolean>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object writeLimitDurationToDataStore(int duration, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object readLimitDurationFromDataStore(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Integer>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object eraseDataStore(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}