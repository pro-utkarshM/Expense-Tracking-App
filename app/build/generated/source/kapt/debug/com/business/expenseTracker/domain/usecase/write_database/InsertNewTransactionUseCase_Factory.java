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
public final class InsertNewTransactionUseCase_Factory implements Factory<InsertNewTransactionUseCase> {
  private final Provider<TransactionRepository> repoProvider;

  public InsertNewTransactionUseCase_Factory(Provider<TransactionRepository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public InsertNewTransactionUseCase get() {
    return newInstance(repoProvider.get());
  }

  public static InsertNewTransactionUseCase_Factory create(
      Provider<TransactionRepository> repoProvider) {
    return new InsertNewTransactionUseCase_Factory(repoProvider);
  }

  public static InsertNewTransactionUseCase newInstance(TransactionRepository repo) {
    return new InsertNewTransactionUseCase(repo);
  }
}
