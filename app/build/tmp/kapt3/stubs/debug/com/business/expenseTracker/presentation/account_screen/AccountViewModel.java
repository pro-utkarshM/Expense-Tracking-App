package com.business.expenseTracker.presentation.account_screen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0010R6\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fRN\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u00130\n2\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u00130\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcom/business/expenseTracker/presentation/account_screen/AccountViewModel;", "Landroidx/lifecycle/ViewModel;", "getCurrencyUseCase", "Lcom/business/expenseTracker/domain/usecase/read_datastore/GetCurrencyUseCase;", "getAccountsUseCase", "Lcom/business/expenseTracker/domain/usecase/read_database/GetAccountsUseCase;", "getTransactionByAccount", "Lcom/business/expenseTracker/domain/usecase/read_database/GetTransactionByAccount;", "(Lcom/business/expenseTracker/domain/usecase/read_datastore/GetCurrencyUseCase;Lcom/business/expenseTracker/domain/usecase/read_database/GetAccountsUseCase;Lcom/business/expenseTracker/domain/usecase/read_database/GetTransactionByAccount;)V", "<set-?>", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/business/expenseTracker/domain/model/Account;", "allAccounts", "getAllAccounts", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "", "selectedCurrencyCode", "getSelectedCurrencyCode", "", "Lcom/business/expenseTracker/domain/model/Transaction;", "transactions", "getTransactions", "currencyFormat", "", "getFormattedDate", "date", "Ljava/util/Date;", "getTransaction", "accountType", "app_debug"})
public final class AccountViewModel extends androidx.lifecycle.ViewModel {
    private final com.business.expenseTracker.domain.usecase.read_datastore.GetCurrencyUseCase getCurrencyUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_database.GetAccountsUseCase getAccountsUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_database.GetTransactionByAccount getTransactionByAccount = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, java.util.List<com.business.expenseTracker.domain.model.Transaction>>> transactions;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.business.expenseTracker.domain.model.Account>> allAccounts;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> selectedCurrencyCode;
    
    @javax.inject.Inject
    public AccountViewModel(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_datastore.GetCurrencyUseCase getCurrencyUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_database.GetAccountsUseCase getAccountsUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_database.GetTransactionByAccount getTransactionByAccount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, java.util.List<com.business.expenseTracker.domain.model.Transaction>>> getTransactions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.business.expenseTracker.domain.model.Account>> getAllAccounts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getSelectedCurrencyCode() {
        return null;
    }
    
    public final void getTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String accountType) {
    }
    
    private final void currencyFormat() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFormattedDate(@org.jetbrains.annotations.NotNull
    java.util.Date date) {
        return null;
    }
}