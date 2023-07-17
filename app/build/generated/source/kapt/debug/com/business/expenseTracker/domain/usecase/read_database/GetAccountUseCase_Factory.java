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
public final class GetAccountUseCase_Factory implements Factory<GetAccountUseCase> {
  private final Provider<TransactionRepository> repoProvider;

  public GetAccountUseCase_Factory(Provider<TransactionRepository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public GetAccountUseCase get() {
    return newInstance(repoProvider.get());
  }

  public static GetAccountUseCase_Factory create(Provider<TransactionRepository> repoProvider) {
    return new GetAccountUseCase_Factory(repoProvider);
  }

  public static GetAccountUseCase newInstance(TransactionRepository repo) {
    return new GetAccountUseCase(repo);
  }
}