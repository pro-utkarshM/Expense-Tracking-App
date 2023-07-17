package com.business.expenseTracker.presentation.setting_screen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u000e\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u001dJ\u000e\u0010)\u001a\u00020\'2\u0006\u0010*\u001a\u00020 J\u000e\u0010+\u001a\u00020\'2\u0006\u0010,\u001a\u00020#J\u0006\u0010-\u001a\u00020\'R*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR*\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020 0\u0018@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020#0\u0018@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001c\u00a8\u0006."}, d2 = {"Lcom/business/expenseTracker/presentation/setting_screen/SettingViewModel;", "Landroidx/lifecycle/ViewModel;", "getCurrencyUseCase", "Lcom/business/expenseTracker/domain/usecase/read_datastore/GetCurrencyUseCase;", "insertAccountsUseCase", "Lcom/business/expenseTracker/domain/usecase/write_database/InsertAccountsUseCase;", "eraseTransactionUseCase", "Lcom/business/expenseTracker/domain/usecase/write_database/EraseTransactionUseCase;", "getExpenseLimitUseCase", "Lcom/business/expenseTracker/domain/usecase/read_datastore/GetExpenseLimitUseCase;", "editExpenseLimitUseCase", "Lcom/business/expenseTracker/domain/usecase/write_datastore/EditExpenseLimitUseCase;", "getLimitKeyUseCase", "Lcom/business/expenseTracker/domain/usecase/read_datastore/GetLimitKeyUseCase;", "editLimitKeyUseCase", "Lcom/business/expenseTracker/domain/usecase/write_datastore/EditLimitKeyUseCase;", "editLimitDurationUseCase", "Lcom/business/expenseTracker/domain/usecase/write_datastore/EditLimitDurationUseCase;", "getLimitDurationUseCase", "Lcom/business/expenseTracker/domain/usecase/read_datastore/GetLimitDurationUseCase;", "eraseDatastoreUseCase", "Lcom/business/expenseTracker/domain/usecase/write_datastore/EraseDatastoreUseCase;", "(Lcom/business/expenseTracker/domain/usecase/read_datastore/GetCurrencyUseCase;Lcom/business/expenseTracker/domain/usecase/write_database/InsertAccountsUseCase;Lcom/business/expenseTracker/domain/usecase/write_database/EraseTransactionUseCase;Lcom/business/expenseTracker/domain/usecase/read_datastore/GetExpenseLimitUseCase;Lcom/business/expenseTracker/domain/usecase/write_datastore/EditExpenseLimitUseCase;Lcom/business/expenseTracker/domain/usecase/read_datastore/GetLimitKeyUseCase;Lcom/business/expenseTracker/domain/usecase/write_datastore/EditLimitKeyUseCase;Lcom/business/expenseTracker/domain/usecase/write_datastore/EditLimitDurationUseCase;Lcom/business/expenseTracker/domain/usecase/read_datastore/GetLimitDurationUseCase;Lcom/business/expenseTracker/domain/usecase/write_datastore/EraseDatastoreUseCase;)V", "<set-?>", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "currency", "getCurrency", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "", "expenseLimit", "getExpenseLimit", "", "expenseLimitDuration", "getExpenseLimitDuration", "", "reminderLimit", "getReminderLimit", "editExpenseLimit", "", "amount", "editLimitDuration", "duration", "editLimitKey", "enabled", "eraseTransaction", "app_debug"})
public final class SettingViewModel extends androidx.lifecycle.ViewModel {
    private final com.business.expenseTracker.domain.usecase.read_datastore.GetCurrencyUseCase getCurrencyUseCase = null;
    private final com.business.expenseTracker.domain.usecase.write_database.InsertAccountsUseCase insertAccountsUseCase = null;
    private final com.business.expenseTracker.domain.usecase.write_database.EraseTransactionUseCase eraseTransactionUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_datastore.GetExpenseLimitUseCase getExpenseLimitUseCase = null;
    private final com.business.expenseTracker.domain.usecase.write_datastore.EditExpenseLimitUseCase editExpenseLimitUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_datastore.GetLimitKeyUseCase getLimitKeyUseCase = null;
    private final com.business.expenseTracker.domain.usecase.write_datastore.EditLimitKeyUseCase editLimitKeyUseCase = null;
    private final com.business.expenseTracker.domain.usecase.write_datastore.EditLimitDurationUseCase editLimitDurationUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_datastore.GetLimitDurationUseCase getLimitDurationUseCase = null;
    private final com.business.expenseTracker.domain.usecase.write_datastore.EraseDatastoreUseCase eraseDatastoreUseCase = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> currency;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Double> expenseLimit;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> expenseLimitDuration;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> reminderLimit;
    
    @javax.inject.Inject
    public SettingViewModel(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_datastore.GetCurrencyUseCase getCurrencyUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.write_database.InsertAccountsUseCase insertAccountsUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.write_database.EraseTransactionUseCase eraseTransactionUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_datastore.GetExpenseLimitUseCase getExpenseLimitUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.write_datastore.EditExpenseLimitUseCase editExpenseLimitUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_datastore.GetLimitKeyUseCase getLimitKeyUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.write_datastore.EditLimitKeyUseCase editLimitKeyUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.write_datastore.EditLimitDurationUseCase editLimitDurationUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_datastore.GetLimitDurationUseCase getLimitDurationUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.write_datastore.EraseDatastoreUseCase eraseDatastoreUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Double> getExpenseLimit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> getExpenseLimitDuration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getReminderLimit() {
        return null;
    }
    
    public final void eraseTransaction() {
    }
    
    public final void editExpenseLimit(double amount) {
    }
    
    public final void editLimitKey(boolean enabled) {
    }
    
    public final void editLimitDuration(int duration) {
    }
}