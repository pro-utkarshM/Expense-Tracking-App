package com.business.expenseTracker.presentation.setting_screen.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/business/expenseTracker/presentation/setting_screen/service/ResetWorkerFactory;", "Landroidx/work/WorkerFactory;", "editExpenseLimitUseCase", "Lcom/business/expenseTracker/domain/usecase/write_datastore/EditExpenseLimitUseCase;", "(Lcom/business/expenseTracker/domain/usecase/write_datastore/EditExpenseLimitUseCase;)V", "createWorker", "Landroidx/work/ListenableWorker;", "appContext", "Landroid/content/Context;", "workerClassName", "", "workerParameters", "Landroidx/work/WorkerParameters;", "app_debug"})
public final class ResetWorkerFactory extends androidx.work.WorkerFactory {
    private final com.business.expenseTracker.domain.usecase.write_datastore.EditExpenseLimitUseCase editExpenseLimitUseCase = null;
    
    @javax.inject.Inject
    public ResetWorkerFactory(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.write_datastore.EditExpenseLimitUseCase editExpenseLimitUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public androidx.work.ListenableWorker createWorker(@org.jetbrains.annotations.NotNull
    android.content.Context appContext, @org.jetbrains.annotations.NotNull
    java.lang.String workerClassName, @org.jetbrains.annotations.NotNull
    androidx.work.WorkerParameters workerParameters) {
        return null;
    }
}