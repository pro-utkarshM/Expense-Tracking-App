package com.business.expenseTracker.data.local.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/business/expenseTracker/data/local/prefs/PrefsRepositoryImpl;", "Lcom/business/expenseTracker/domain/repository/PrefsRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getPref", "", "name", "setPref", "", "value", "app_debug"})
public final class PrefsRepositoryImpl implements com.business.expenseTracker.domain.repository.PrefsRepository {
    private final android.content.SharedPreferences sharedPreferences = null;
    
    @javax.inject.Inject
    public PrefsRepositoryImpl(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getPref(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    @java.lang.Override
    public void setPref(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
}