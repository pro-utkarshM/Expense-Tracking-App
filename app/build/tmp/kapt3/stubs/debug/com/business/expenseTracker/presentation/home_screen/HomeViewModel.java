package com.business.expenseTracker.presentation.home_screen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001sB\u007f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\u0002\u0010 J\u0006\u0010X\u001a\u00020YJ\u0016\u0010Z\u001a\u00020*2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020*01H\u0002J\b\u0010\\\u001a\u00020YH\u0002J\u0006\u0010]\u001a\u00020YJ)\u0010^\u001a\u00020Y2\b\u0010_\u001a\u0004\u0018\u0001052\b\u0010`\u001a\u0004\u0018\u00010:2\b\u0010a\u001a\u0004\u0018\u00010:\u00a2\u0006\u0002\u0010bJ<\u0010c\u001a\u00020Y2\u0006\u00106\u001a\u0002052\u0006\u0010d\u001a\u00020*2\u0006\u0010(\u001a\u0002052\u0006\u0010e\u001a\u0002052\u0006\u0010V\u001a\u0002052\f\u0010f\u001a\b\u0012\u0004\u0012\u00020Y0gJ\u000e\u0010h\u001a\u00020Y2\u0006\u0010$\u001a\u00020#J\u000e\u0010i\u001a\u00020Y2\u0006\u0010(\u001a\u00020\'J\u000e\u0010j\u001a\u00020Y2\u0006\u0010k\u001a\u00020MJ\u000e\u0010l\u001a\u00020Y2\u0006\u0010m\u001a\u00020-J\u000e\u0010n\u001a\u00020Y2\u0006\u0010d\u001a\u000205J\u000e\u0010o\u001a\u00020Y2\u0006\u0010p\u001a\u000205J7\u0010q\u001a\u00020Y2\b\u0010_\u001a\u0004\u0018\u0001052\b\u0010`\u001a\u0004\u0018\u00010:2\b\u0010a\u001a\u0004\u0018\u00010:2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020Y0g\u00a2\u0006\u0002\u0010rR*\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R*\u0010(\u001a\b\u0012\u0004\u0012\u00020\'0\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\'0\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010&R*\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020*0\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010&R:\u0010/\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010-0-0\"2\u0014\u0010!\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010-0-0\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010&R6\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000202010\"2\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000202010\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010&R*\u00106\u001a\b\u0012\u0004\u0012\u0002050\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002050\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u000e\u00108\u001a\u000205X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020:0\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010;\u001a\b\u0012\u0004\u0012\u0002050\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002050\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010&R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020@0?@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR*\u0010D\u001a\b\u0012\u0004\u0012\u00020>0\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020>0\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010&RN\u0010G\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u000202010F0\"2\u001e\u0010!\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u000202010F0\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010&R*\u0010I\u001a\b\u0012\u0004\u0012\u0002050\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002050\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010&R*\u0010K\u001a\b\u0012\u0004\u0012\u00020>0\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020>0\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010&R*\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020M0\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010&R*\u0010P\u001a\b\u0012\u0004\u0012\u00020*0\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020*0\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010&R*\u0010R\u001a\b\u0012\u0004\u0012\u00020*0\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020*0\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010&R*\u0010T\u001a\b\u0012\u0004\u0012\u0002050\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002050\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010&R*\u0010V\u001a\b\u0012\u0004\u0012\u0002050\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002050\"@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010&\u00a8\u0006t"}, d2 = {"Lcom/business/expenseTracker/presentation/home_screen/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "getDateUseCase", "Lcom/business/expenseTracker/domain/usecase/GetDateUseCase;", "getFormattedDateUseCase", "Lcom/business/expenseTracker/domain/usecase/GetFormattedDateUseCase;", "insertDailyTransactionUseCase", "Lcom/business/expenseTracker/domain/usecase/write_database/InsertNewTransactionUseCase;", "insertAccountsUseCase", "Lcom/business/expenseTracker/domain/usecase/write_database/InsertAccountsUseCase;", "getDailyTransactionUseCase", "Lcom/business/expenseTracker/domain/usecase/read_database/GetDailyTransactionUseCase;", "getAllTransactionUseCase", "Lcom/business/expenseTracker/domain/usecase/read_database/GetAllTransactionUseCase;", "getAccountUseCase", "Lcom/business/expenseTracker/domain/usecase/read_database/GetAccountUseCase;", "getAccountsUseCase", "Lcom/business/expenseTracker/domain/usecase/read_database/GetAccountsUseCase;", "getCurrencyUseCase", "Lcom/business/expenseTracker/domain/usecase/read_datastore/GetCurrencyUseCase;", "getExpenseLimitUseCase", "Lcom/business/expenseTracker/domain/usecase/read_datastore/GetExpenseLimitUseCase;", "getLimitDurationUseCase", "Lcom/business/expenseTracker/domain/usecase/read_datastore/GetLimitDurationUseCase;", "getLimitKeyUseCase", "Lcom/business/expenseTracker/domain/usecase/read_datastore/GetLimitKeyUseCase;", "getCurrentDayExpTransactionUseCase", "Lcom/business/expenseTracker/domain/usecase/read_database/GetCurrentDayExpTransactionUseCase;", "getWeeklyExpTransactionUseCase", "Lcom/business/expenseTracker/domain/usecase/read_database/GetWeeklyExpTransactionUseCase;", "getMonthlyExpTransactionUse", "Lcom/business/expenseTracker/domain/usecase/read_database/GetMonthlyExpTransactionUse;", "(Lcom/business/expenseTracker/domain/usecase/GetDateUseCase;Lcom/business/expenseTracker/domain/usecase/GetFormattedDateUseCase;Lcom/business/expenseTracker/domain/usecase/write_database/InsertNewTransactionUseCase;Lcom/business/expenseTracker/domain/usecase/write_database/InsertAccountsUseCase;Lcom/business/expenseTracker/domain/usecase/read_database/GetDailyTransactionUseCase;Lcom/business/expenseTracker/domain/usecase/read_database/GetAllTransactionUseCase;Lcom/business/expenseTracker/domain/usecase/read_database/GetAccountUseCase;Lcom/business/expenseTracker/domain/usecase/read_database/GetAccountsUseCase;Lcom/business/expenseTracker/domain/usecase/read_datastore/GetCurrencyUseCase;Lcom/business/expenseTracker/domain/usecase/read_datastore/GetExpenseLimitUseCase;Lcom/business/expenseTracker/domain/usecase/read_datastore/GetLimitDurationUseCase;Lcom/business/expenseTracker/domain/usecase/read_datastore/GetLimitKeyUseCase;Lcom/business/expenseTracker/domain/usecase/read_database/GetCurrentDayExpTransactionUseCase;Lcom/business/expenseTracker/domain/usecase/read_database/GetWeeklyExpTransactionUseCase;Lcom/business/expenseTracker/domain/usecase/read_database/GetMonthlyExpTransactionUse;)V", "<set-?>", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/business/expenseTracker/presentation/home_screen/Account;", "account", "getAccount", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/business/expenseTracker/presentation/home_screen/CategoryItem;", "category", "getCategory", "", "currentExpenseAmount", "getCurrentExpenseAmount", "Ljava/util/Date;", "kotlin.jvm.PlatformType", "currentTime", "getCurrentTime", "", "Lcom/business/expenseTracker/domain/model/Transaction;", "dailyTransaction", "getDailyTransaction", "", "date", "getDate", "decimal", "duration", "", "formattedDate", "getFormattedDate", "isDecimal", "", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/business/expenseTracker/presentation/home_screen/HomeViewModel$UIEvent;", "limitAlert", "getLimitAlert", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "limitKey", "getLimitKey", "", "monthlyTransaction", "getMonthlyTransaction", "selectedCurrencyCode", "getSelectedCurrencyCode", "showInfoBanner", "getShowInfoBanner", "Lcom/business/expenseTracker/presentation/home_screen/TabButton;", "tabButton", "getTabButton", "totalExpense", "getTotalExpense", "totalIncome", "getTotalIncome", "transactionAmount", "getTransactionAmount", "transactionTitle", "getTransactionTitle", "backspace", "", "calculateTransaction", "transactions", "currencyFormat", "displayExpenseLimitWarning", "displayTransaction", "transactionDate", "transactionPos", "transactionStatus", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "insertDailyTransaction", "amount", "transactionType", "navigateBack", "Lkotlin/Function0;", "selectAccount", "selectCategory", "selectTabButton", "button", "setCurrentTime", "time", "setTransaction", "setTransactionTitle", "title", "updateTransaction", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "UIEvent", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.business.expenseTracker.domain.usecase.GetDateUseCase getDateUseCase = null;
    private final com.business.expenseTracker.domain.usecase.GetFormattedDateUseCase getFormattedDateUseCase = null;
    private final com.business.expenseTracker.domain.usecase.write_database.InsertNewTransactionUseCase insertDailyTransactionUseCase = null;
    private final com.business.expenseTracker.domain.usecase.write_database.InsertAccountsUseCase insertAccountsUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_database.GetDailyTransactionUseCase getDailyTransactionUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_database.GetAllTransactionUseCase getAllTransactionUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_database.GetAccountUseCase getAccountUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_database.GetAccountsUseCase getAccountsUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_datastore.GetCurrencyUseCase getCurrencyUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_datastore.GetExpenseLimitUseCase getExpenseLimitUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_datastore.GetLimitDurationUseCase getLimitDurationUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_datastore.GetLimitKeyUseCase getLimitKeyUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_database.GetCurrentDayExpTransactionUseCase getCurrentDayExpTransactionUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_database.GetWeeklyExpTransactionUseCase getWeeklyExpTransactionUseCase = null;
    private final com.business.expenseTracker.domain.usecase.read_database.GetMonthlyExpTransactionUse getMonthlyExpTransactionUse = null;
    private java.lang.String decimal;
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isDecimal;
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> duration;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<com.business.expenseTracker.presentation.home_screen.TabButton> tabButton;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<com.business.expenseTracker.presentation.home_screen.CategoryItem> category;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<com.business.expenseTracker.presentation.home_screen.Account> account;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> transactionAmount;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.business.expenseTracker.domain.model.Transaction>> dailyTransaction;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, java.util.List<com.business.expenseTracker.domain.model.Transaction>>> monthlyTransaction;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Double> currentExpenseAmount;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> transactionTitle;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> showInfoBanner;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Double> totalIncome;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Double> totalExpense;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> formattedDate;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> date;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.Date> currentTime;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> selectedCurrencyCode;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableSharedFlow<com.business.expenseTracker.presentation.home_screen.HomeViewModel.UIEvent> limitAlert;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> limitKey;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.GetDateUseCase getDateUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.GetFormattedDateUseCase getFormattedDateUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.write_database.InsertNewTransactionUseCase insertDailyTransactionUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.write_database.InsertAccountsUseCase insertAccountsUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_database.GetDailyTransactionUseCase getDailyTransactionUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_database.GetAllTransactionUseCase getAllTransactionUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_database.GetAccountUseCase getAccountUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_database.GetAccountsUseCase getAccountsUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_datastore.GetCurrencyUseCase getCurrencyUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_datastore.GetExpenseLimitUseCase getExpenseLimitUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_datastore.GetLimitDurationUseCase getLimitDurationUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_datastore.GetLimitKeyUseCase getLimitKeyUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_database.GetCurrentDayExpTransactionUseCase getCurrentDayExpTransactionUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_database.GetWeeklyExpTransactionUseCase getWeeklyExpTransactionUseCase, @org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.usecase.read_database.GetMonthlyExpTransactionUse getMonthlyExpTransactionUse) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.business.expenseTracker.presentation.home_screen.TabButton> getTabButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.business.expenseTracker.presentation.home_screen.CategoryItem> getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.business.expenseTracker.presentation.home_screen.Account> getAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getTransactionAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.business.expenseTracker.domain.model.Transaction>> getDailyTransaction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, java.util.List<com.business.expenseTracker.domain.model.Transaction>>> getMonthlyTransaction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Double> getCurrentExpenseAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getTransactionTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getShowInfoBanner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Double> getTotalIncome() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Double> getTotalExpense() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getFormattedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.Date> getCurrentTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getSelectedCurrencyCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableSharedFlow<com.business.expenseTracker.presentation.home_screen.HomeViewModel.UIEvent> getLimitAlert() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getLimitKey() {
        return null;
    }
    
    private final double calculateTransaction(java.util.List<java.lang.Double> transactions) {
        return 0.0;
    }
    
    public final void selectTabButton(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.presentation.home_screen.TabButton button) {
    }
    
    public final void selectCategory(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.presentation.home_screen.CategoryItem category) {
    }
    
    public final void selectAccount(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.presentation.home_screen.Account account) {
    }
    
    public final void setTransactionTitle(@org.jetbrains.annotations.NotNull
    java.lang.String title) {
    }
    
    public final void setCurrentTime(@org.jetbrains.annotations.NotNull
    java.util.Date time) {
    }
    
    public final void insertDailyTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String date, double amount, @org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    java.lang.String transactionType, @org.jetbrains.annotations.NotNull
    java.lang.String transactionTitle, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateBack) {
    }
    
    public final void setTransaction(@org.jetbrains.annotations.NotNull
    java.lang.String amount) {
    }
    
    public final void backspace() {
    }
    
    public final void displayTransaction(@org.jetbrains.annotations.Nullable
    java.lang.String transactionDate, @org.jetbrains.annotations.Nullable
    java.lang.Integer transactionPos, @org.jetbrains.annotations.Nullable
    java.lang.Integer transactionStatus) {
    }
    
    public final void updateTransaction(@org.jetbrains.annotations.Nullable
    java.lang.String transactionDate, @org.jetbrains.annotations.Nullable
    java.lang.Integer transactionPos, @org.jetbrains.annotations.Nullable
    java.lang.Integer transactionStatus, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateBack) {
    }
    
    public final void displayExpenseLimitWarning() {
    }
    
    private final void currencyFormat() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/business/expenseTracker/presentation/home_screen/HomeViewModel$UIEvent;", "", "()V", "Alert", "NoAlert", "Lcom/business/expenseTracker/presentation/home_screen/HomeViewModel$UIEvent$Alert;", "Lcom/business/expenseTracker/presentation/home_screen/HomeViewModel$UIEvent$NoAlert;", "app_debug"})
    public static abstract class UIEvent {
        
        private UIEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/business/expenseTracker/presentation/home_screen/HomeViewModel$UIEvent$Alert;", "Lcom/business/expenseTracker/presentation/home_screen/HomeViewModel$UIEvent;", "info", "", "(Ljava/lang/String;)V", "getInfo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class Alert extends com.business.expenseTracker.presentation.home_screen.HomeViewModel.UIEvent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String info = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.business.expenseTracker.presentation.home_screen.HomeViewModel.UIEvent.Alert copy(@org.jetbrains.annotations.NotNull
            java.lang.String info) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public Alert(@org.jetbrains.annotations.NotNull
            java.lang.String info) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getInfo() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/business/expenseTracker/presentation/home_screen/HomeViewModel$UIEvent$NoAlert;", "Lcom/business/expenseTracker/presentation/home_screen/HomeViewModel$UIEvent;", "info", "", "(Ljava/lang/String;)V", "getInfo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class NoAlert extends com.business.expenseTracker.presentation.home_screen.HomeViewModel.UIEvent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String info = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.business.expenseTracker.presentation.home_screen.HomeViewModel.UIEvent.NoAlert copy(@org.jetbrains.annotations.NotNull
            java.lang.String info) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public NoAlert() {
                super();
            }
            
            public NoAlert(@org.jetbrains.annotations.NotNull
            java.lang.String info) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getInfo() {
                return null;
            }
        }
    }
}