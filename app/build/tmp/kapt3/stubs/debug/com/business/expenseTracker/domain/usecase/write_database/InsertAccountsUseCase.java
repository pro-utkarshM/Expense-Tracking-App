package com.business.expenseTracker.domain.usecase.write_database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/business/expenseTracker/domain/usecase/write_database/InsertAccountsUseCase;", "", "repo", "Lcom/business/expenseTracker/domain/repository/TransactionRepository;", "(Lcom/business/expenseTracker/domain/repository/TransactionRepository;)V", "invoke", "", "account", "", "Lcom/business/expenseTracker/data/local/entity/AccountDto;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class InsertAccountsUseCase {
    private final com.business.expenseTracker.domain.repository.TransactionRepository repo = null;
    
    @javax.inject.Inject
    public InsertAccountsUseCase(@org.jetbrains.annotations.NotNull
    com.business.expenseTracker.domain.repository.TransactionRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    java.util.List<com.business.expenseTracker.data.local.entity.AccountDto> account, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}