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
public final class GetMonthlyExpTransactionUse_Factory implements Factory<GetMonthlyExpTransactionUse> {
  private final Provider<TransactionRepository> transactionRepositoryProvider;

  public GetMonthlyExpTransactionUse_Factory(
      Provider<TransactionRepository> transactionRepositoryProvider) {
    this.transactionRepositoryProvider = transactionRepositoryProvider;
  }

  @Override
  public GetMonthlyExpTransactionUse get() {
    return newInstance(transactionRepositoryProvider.get());
  }

  public static GetMonthlyExpTransactionUse_Factory create(
      Provider<TransactionRepository> transactionRepositoryProvider) {
    return new GetMonthlyExpTransactionUse_Factory(transactionRepositoryProvider);
  }

  public static GetMonthlyExpTransactionUse newInstance(
      TransactionRepository transactionRepository) {
    return new GetMonthlyExpTransactionUse(transactionRepository);
  }
}
