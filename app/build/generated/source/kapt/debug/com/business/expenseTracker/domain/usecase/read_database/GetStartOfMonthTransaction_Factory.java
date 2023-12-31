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
public final class GetStartOfMonthTransaction_Factory implements Factory<GetStartOfMonthTransaction> {
  private final Provider<TransactionRepository> transactionRepositoryProvider;

  public GetStartOfMonthTransaction_Factory(
      Provider<TransactionRepository> transactionRepositoryProvider) {
    this.transactionRepositoryProvider = transactionRepositoryProvider;
  }

  @Override
  public GetStartOfMonthTransaction get() {
    return newInstance(transactionRepositoryProvider.get());
  }

  public static GetStartOfMonthTransaction_Factory create(
      Provider<TransactionRepository> transactionRepositoryProvider) {
    return new GetStartOfMonthTransaction_Factory(transactionRepositoryProvider);
  }

  public static GetStartOfMonthTransaction newInstance(
      TransactionRepository transactionRepository) {
    return new GetStartOfMonthTransaction(transactionRepository);
  }
}
