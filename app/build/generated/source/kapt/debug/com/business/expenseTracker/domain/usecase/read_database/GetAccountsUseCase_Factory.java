// Generated by Dagger (https://dagger.dev).
package com.business.expenseTracker.domain.usecase.read_database;

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
public final class GetAccountsUseCase_Factory implements Factory<GetAccountsUseCase> {
  private final Provider<TransactionRepository> repoProvider;

  public GetAccountsUseCase_Factory(Provider<TransactionRepository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public GetAccountsUseCase get() {
    return newInstance(repoProvider.get());
  }

  public static GetAccountsUseCase_Factory create(Provider<TransactionRepository> repoProvider) {
    return new GetAccountsUseCase_Factory(repoProvider);
  }

  public static GetAccountsUseCase newInstance(TransactionRepository repo) {
    return new GetAccountsUseCase(repo);
  }
}