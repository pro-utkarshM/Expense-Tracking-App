package com.business.expenseTracker.presentation.setting_screen.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/business/expenseTracker/presentation/setting_screen/service/LimitResetWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "workParams", "Landroidx/work/WorkerParameters;", "editExpenseLimitUseCase", "Lcom/business/expenseTracker/domain/usecase/write_datastore/EditExpenseLimitUseCase;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/business/expenseTracker/domain/usecase/write_datastore/EditExpenseLimitUseCase;)V", "getEditExpenseLimitUseCase", "()Lcom/business/expenseTracker/domain/usecase/write_datastore/EditExpenseLimitUseCase;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LimitResetWorker extends androidx.work.CoroutineWorker {
    @org.jetbrains.annotations.NotNull
    private final com.business.expenseTracker.domain.usecase.write_datastore.EditExpenseLimitUseCase editExpenseLimitUseCase = null;
    
    public LimitResetWorker(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    androidx.work.WorkerParameters workParams, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.write_datastore.EditExpenseLimitUseCase editExpenseLimitUseCase) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.business.expenseTracker.domain.usecase.write_datastore.EditExpenseLimitUseCase getEditExpenseLimitUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        return null;
    }
}