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
public final class GetWeeklyExpTransactionUseCase_Factory implements Factory<GetWeeklyExpTransactionUseCase> {
  private final Provider<TransactionRepository> transactionRepositoryProvider;

  public GetWeeklyExpTransactionUseCase_Factory(
      Provider<TransactionRepository> transactionRepositoryProvider) {
    this.transactionRepositoryProvider = transactionRepositoryProvider;
  }

  @Override
  public GetWeeklyExpTransactionUseCase get() {
    return newInstance(transactionRepositoryProvider.get());
  }

  public static GetWeeklyExpTransactionUseCase_Factory create(
      Provider<TransactionRepository> transactionRepositoryProvider) {
    return new GetWeeklyExpTransactionUseCase_Factory(transactionRepositoryProvider);
  }

  public static GetWeeklyExpTransactionUseCase newInstance(
      TransactionRepository transactionRepository) {
    return new GetWeeklyExpTransactionUseCase(transactionRepository);
  }
}