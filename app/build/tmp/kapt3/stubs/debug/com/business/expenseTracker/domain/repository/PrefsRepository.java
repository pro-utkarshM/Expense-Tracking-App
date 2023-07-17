package com.business.expenseTracker.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/business/expenseTracker/domain/repository/PrefsRepository;", "", "getPref", "", "name", "setPref", "", "value", "app_debug"})
public abstract interface PrefsRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getPref(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    public abstract void setPref(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String value);
}