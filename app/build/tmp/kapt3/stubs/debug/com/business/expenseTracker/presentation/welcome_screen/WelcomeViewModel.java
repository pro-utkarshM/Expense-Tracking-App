package com.business.expenseTracker.presentation.welcome_screen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001fJ\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$RN\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r0\f2\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r0\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013RN\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r0\f2\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r0\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000f0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006%"}, d2 = {"Lcom/business/expenseTracker/presentation/welcome_screen/WelcomeViewModel;", "Landroidx/lifecycle/ViewModel;", "editOnBoardingUseCase", "Lcom/business/expenseTracker/domain/usecase/write_datastore/EditOnBoardingUseCase;", "editCurrencyUseCase", "Lcom/business/expenseTracker/domain/usecase/write_datastore/EditCurrencyUseCase;", "insertAccountsUseCase", "Lcom/business/expenseTracker/domain/usecase/write_database/InsertAccountsUseCase;", "getCurrencyUseCase", "Lcom/business/expenseTracker/domain/usecase/GetCurrencyUseCase;", "(Lcom/business/expenseTracker/domain/usecase/write_datastore/EditOnBoardingUseCase;Lcom/business/expenseTracker/domain/usecase/write_datastore/EditCurrencyUseCase;Lcom/business/expenseTracker/domain/usecase/write_database/InsertAccountsUseCase;Lcom/business/expenseTracker/domain/usecase/GetCurrencyUseCase;)V", "<set-?>", "Landroidx/compose/runtime/MutableState;", "", "", "", "Lcom/business/expenseTracker/domain/model/CurrencyModel;", "countryCurrencies", "getCountryCurrencies", "()Landroidx/compose/runtime/MutableState;", "countryCurrenciesFiltered", "getCountryCurrenciesFiltered", "listOfPages", "Landroidx/compose/runtime/State;", "Lcom/business/expenseTracker/presentation/welcome_screen/components/OnBoardingPage;", "getListOfPages", "()Landroidx/compose/runtime/State;", "createAccounts", "", "filterSearchResult", "keywords", "", "saveCurrency", "currency", "saveOnBoardingState", "completed", "", "app_debug"})
public final class WelcomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.business.expenseTracker.domain.usecase.write_datastore.EditOnBoardingUseCase editOnBoardingUseCase = null;
    private final com.business.expenseTracker.domain.usecase.write_datastore.EditCurrencyUseCase editCurrencyUseCase = null;
    private final com.business.expenseTracker.domain.usecase.write_database.InsertAccountsUseCase insertAccountsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.util.Map<java.lang.Character, java.util.List<com.business.expenseTracker.domain.model.CurrencyModel>>> countryCurrencies;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.util.Map<java.lang.Character, java.util.List<com.business.expenseTracker.domain.model.CurrencyModel>>> countryCurrenciesFiltered;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<java.util.List<com.business.expenseTracker.presentation.welcome_screen.components.OnBoardingPage>> listOfPages = null;
    
    @javax.inject.Inject
    public WelcomeViewModel(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.write_datastore.EditOnBoardingUseCase editOnBoardingUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.write_datastore.EditCurrencyUseCase editCurrencyUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.write_database.InsertAccountsUseCase insertAccountsUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.GetCurrencyUseCase getCurrencyUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.Map<java.lang.Character, java.util.List<com.business.expenseTracker.domain.model.CurrencyModel>>> getCountryCurrencies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.Map<java.lang.Character, java.util.List<com.business.expenseTracker.domain.model.CurrencyModel>>> getCountryCurrenciesFiltered() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<java.util.List<com.business.expenseTracker.presentation.welcome_screen.components.OnBoardingPage>> getListOfPages() {
        return null;
    }
    
    public final void saveOnBoardingState(boolean completed) {
    }
    
    public final void saveCurrency(@org.jetbrains.annotations.NotNull
    java.lang.String currency) {
    }
    
    public final void createAccounts() {
    }
    
    public final void filterSearchResult(@org.jetbrains.annotations.NotNull
    java.lang.String keywords) {
    }
}