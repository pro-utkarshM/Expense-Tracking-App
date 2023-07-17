package com.business.expenseTracker.presentation.insight_screen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\b\u0010\"\u001a\u00020#H\u0002J#\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\'\u001a\u00020\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0010\u0010\u0019\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020&J\u000e\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u0016R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/business/expenseTracker/presentation/insight_screen/InsightViewModel;", "Landroidx/lifecycle/ViewModel;", "getCurrencyUseCase", "Lcom/business/expenseTracker/domain/usecase/read_datastore/GetCurrencyUseCase;", "get3DayTransaction", "Lcom/business/expenseTracker/domain/usecase/read_database/Get3DayTransaction;", "get7DayTransaction", "Lcom/business/expenseTracker/domain/usecase/read_database/Get7DayTransaction;", "get14DayTransaction", "Lcom/business/expenseTracker/domain/usecase/read_database/Get14DayTransaction;", "getStartOfMonthTransaction", "Lcom/business/expenseTracker/domain/usecase/read_database/GetStartOfMonthTransaction;", "getLastMonthTransaction", "Lcom/business/expenseTracker/domain/usecase/read_database/GetLastMonthTransaction;", "getAllTransaction", "Lcom/business/expenseTracker/domain/usecase/read_database/GetTransactionByTypeUseCase;", "(Lcom/business/expenseTracker/domain/usecase/read_datastore/GetCurrencyUseCase;Lcom/business/expenseTracker/domain/usecase/read_database/Get3DayTransaction;Lcom/business/expenseTracker/domain/usecase/read_database/Get7DayTransaction;Lcom/business/expenseTracker/domain/usecase/read_database/Get14DayTransaction;Lcom/business/expenseTracker/domain/usecase/read_database/GetStartOfMonthTransaction;Lcom/business/expenseTracker/domain/usecase/read_database/GetLastMonthTransaction;Lcom/business/expenseTracker/domain/usecase/read_database/GetTransactionByTypeUseCase;)V", "_filteredTransaction", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/business/expenseTracker/domain/model/Transaction;", "_tabButton", "Lcom/business/expenseTracker/presentation/home_screen/TransactionType;", "filteredTransaction", "Lkotlinx/coroutines/flow/StateFlow;", "getFilteredTransaction", "()Lkotlinx/coroutines/flow/StateFlow;", "<set-?>", "", "selectedCurrencyCode", "getSelectedCurrencyCode", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "tabButton", "getTabButton", "currencyFormat", "", "filterTransaction", "duration", "", "transactionType", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectTabButton", "tab", "app_debug"})
public final class InsightViewModel extends androidx.lifecycle.ViewModel {
    private final com.business.expenseTracker.domain.usecase.read_datastore.GetCurrencyUseCase getCurrencyUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_database.Get3DayTransaction get3DayTransaction = null;
    private final com.business.expenseTracker.domain.usecase.read_database.Get7DayTransaction get7DayTransaction = null;
    private final com.business.expenseTracker.domain.usecase.read_database.Get14DayTransaction get14DayTransaction = null;
    private final com.business.expenseTracker.domain.usecase.read_database.GetStartOfMonthTransaction getStartOfMonthTransaction = null;
    private final com.business.expenseTracker.domain.usecase.read_database.GetLastMonthTransaction getLastMonthTransaction = null;
    private final com.business.expenseTracker.domain.usecase.read_database.GetTransactionByTypeUseCase getAllTransaction = null;
    private kotlinx.coroutines.flow.MutableStateFlow<com.business.expenseTracker.presentation.home_screen.TransactionType> _tabButton;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.business.expenseTracker.presentation.home_screen.TransactionType> tabButton = null;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.business.expenseTracker.domain.model.Transaction>> _filteredTransaction;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.business.expenseTracker.domain.model.Transaction>> filteredTransaction = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> selectedCurrencyCode;
    
    @javax.inject.Inject
    public InsightViewModel(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_datastore.GetCurrencyUseCase getCurrencyUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_database.Get3DayTransaction get3DayTransaction, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_database.Get7DayTransaction get7DayTransaction, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_database.Get14DayTransaction get14DayTransaction, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_database.GetStartOfMonthTransaction getStartOfMonthTransaction, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_database.GetLastMonthTransaction getLastMonthTransaction, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_database.GetTransactionByTypeUseCase getAllTransaction) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.business.expenseTracker.presentation.home_screen.TransactionType> getTabButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.business.expenseTracker.domain.model.Transaction>> getFilteredTransaction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getSelectedCurrencyCode() {
        return null;
    }
    
    public final void selectTabButton(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.presentation.home_screen.TransactionType tab) {
    }
    
    private final void currencyFormat() {
    }
    
    public final void getFilteredTransaction(int duration) {
    }
    
    private final java.lang.Object filterTransaction(int duration, java.lang.String transactionType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}