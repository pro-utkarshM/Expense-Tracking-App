package com.business.expenseTracker.presentation.main;

import java.lang.System;

@kotlinx.coroutines.InternalCoroutinesApi
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000f0\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/business/expenseTracker/presentation/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "getOnBoardingKeyUseCase", "Lcom/business/expenseTracker/domain/usecase/read_datastore/GetOnBoardingKeyUseCase;", "getPreferenceUseCase", "Lcom/business/expenseTracker/domain/usecase/prefs/GetPreferenceUseCase;", "setPreferenceUseCase", "Lcom/business/expenseTracker/domain/usecase/prefs/SetPreferenceUseCase;", "(Lcom/business/expenseTracker/domain/usecase/read_datastore/GetOnBoardingKeyUseCase;Lcom/business/expenseTracker/domain/usecase/prefs/GetPreferenceUseCase;Lcom/business/expenseTracker/domain/usecase/prefs/SetPreferenceUseCase;)V", "<set-?>", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isLoading", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "isThemeModeReversed", "", "startDestination", "getStartDestination", "reverseTheme", "", "switchedOn", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.business.expenseTracker.domain.usecase.read_datastore.GetOnBoardingKeyUseCase getOnBoardingKeyUseCase = null;
    private final com.business.expenseTracker.domain.usecase.prefs.GetPreferenceUseCase getPreferenceUseCase = null;
    private final com.business.expenseTracker.domain.usecase.prefs.SetPreferenceUseCase setPreferenceUseCase = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isLoading;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> startDestination;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isThemeModeReversed;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_datastore.GetOnBoardingKeyUseCase getOnBoardingKeyUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.prefs.GetPreferenceUseCase getPreferenceUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.prefs.SetPreferenceUseCase setPreferenceUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getStartDestination() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isThemeModeReversed() {
        return null;
    }
    
    public final void reverseTheme(boolean switchedOn) {
    }
}