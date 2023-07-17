package com.business.expenseTracker.domain.usecase.read_database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/business/expenseTracker/domain/usecase/read_database/GetAccountUseCase;", "", "repo", "Lcom/business/expenseTracker/domain/repository/TransactionRepository;", "(Lcom/business/expenseTracker/domain/repository/TransactionRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/business/expenseTracker/data/local/entity/AccountDto;", "account", "", "app_debug"})
public final class GetAccountUseCase {
    private final com.business.expenseTracker.domain.repository.TransactionRepository repo = null;
    
    @javax.inject.Inject
    public GetAccountUseCase(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.repository.TransactionRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.business.expenseTracker.data.local.entity.AccountDto> invoke(@org.jetbrains.annotations.NotNull
    java.lang.String account) {
        return null;
    }
}