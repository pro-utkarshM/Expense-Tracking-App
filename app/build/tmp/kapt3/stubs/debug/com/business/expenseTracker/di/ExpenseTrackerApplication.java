package com.business.expenseTracker.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/business/expenseTracker/di/ExpenseTrackerApplication;", "Landroid/app/Application;", "Landroidx/work/Configuration$Provider;", "()V", "factory", "Lcom/business/expenseTracker/presentation/setting_screen/service/ResetWorkerFactory;", "getFactory", "()Lcom/business/expenseTracker/presentation/setting_screen/service/ResetWorkerFactory;", "setFactory", "(Lcom/business/expenseTracker/presentation/setting_screen/service/ResetWorkerFactory;)V", "getWorkManagerConfiguration", "Landroidx/work/Configuration;", "app_debug"})
@dagger.hilt.android.HiltAndroidApp
public final class ExpenseTrackerApplication extends android.app.Application implements androidx.work.Configuration.Provider {
    @javax.inject.Inject
    public com.business.expenseTracker.presentation.setting_screen.service.ResetWorkerFactory factory;
    
    public ExpenseTrackerApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.business.expenseTracker.presentation.setting_screen.service.ResetWorkerFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.presentation.setting_screen.service.ResetWorkerFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.work.Configuration getWorkManagerConfiguration() {
        return null;
    }
}