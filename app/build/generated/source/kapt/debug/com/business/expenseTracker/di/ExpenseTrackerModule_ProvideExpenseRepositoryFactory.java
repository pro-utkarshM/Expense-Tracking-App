// Generated by Dagger (https://dagger.dev).
package com.business.expenseTracker.di;

import com.business.expenseTracker.data.local.TransactionDao;
import com.business.expenseTracker.domain.repository.TransactionRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ExpenseTrackerModule_ProvideExpenseRepositoryFactory implements Factory<TransactionRepository> {
  private final Provider<TransactionDao> transactionDaoProvider;

  public ExpenseTrackerModule_ProvideExpenseRepositoryFactory(
      Provider<TransactionDao> transactionDaoProvider) {
    this.transactionDaoProvider = transactionDaoProvider;
  }

  @Override
  public TransactionRepository get() {
    return provideExpenseRepository(transactionDaoProvider.get());
  }

  public static ExpenseTrackerModule_ProvideExpenseRepositoryFactory create(
      Provider<TransactionDao> transactionDaoProvider) {
    return new ExpenseTrackerModule_ProvideExpenseRepositoryFactory(transactionDaoProvider);
  }

  public static TransactionRepository provideExpenseRepository(TransactionDao transactionDao) {
    return Preconditions.checkNotNullFromProvides(ExpenseTrackerModule.INSTANCE.provideExpenseRepository(transactionDao));
  }
}