package com.business.expenseTracker.domain.usecase.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/business/expenseTracker/domain/usecase/prefs/SetPreferenceUseCase;", "", "prefsRepository", "Lcom/business/expenseTracker/domain/repository/PrefsRepository;", "(Lcom/business/expenseTracker/domain/repository/PrefsRepository;)V", "invoke", "", "name", "", "value", "app_debug"})
public final class SetPreferenceUseCase {
    private final com.business.expenseTracker.domain.repository.PrefsRepository prefsRepository = null;
    
    @javax.inject.Inject
    public SetPreferenceUseCase(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.repository.PrefsRepository prefsRepository) {
        super();
    }
    
    public final void invoke(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
}