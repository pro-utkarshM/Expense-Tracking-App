// Generated by Dagger (https://dagger.dev).
package com.business.expenseTracker.domain.usecase.write_database;

import com.business.expenseTracker.domain.repository.TransactionRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class InsertAccountsUseCase_Factory implements Factory<InsertAccountsUseCase> {
  private final Provider<TransactionRepository> repoProvider;

  public InsertAccountsUseCase_Factory(Provider<TransactionRepository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public InsertAccountsUseCase get() {
    return newInstance(repoProvider.get());
  }

  public static InsertAccountsUseCase_Factory create(Provider<TransactionRepository> repoProvider) {
    return new InsertAccountsUseCase_Factory(repoProvider);
  }

  public static InsertAccountsUseCase newInstance(TransactionRepository repo) {
    return new InsertAccountsUseCase(repo);
  }
}