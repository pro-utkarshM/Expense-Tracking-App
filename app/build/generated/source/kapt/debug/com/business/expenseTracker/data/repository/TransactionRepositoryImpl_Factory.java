// Generated by Dagger (https://dagger.dev).
package com.business.expenseTracker.data.repository;

import com.business.expenseTracker.data.local.TransactionDao;
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
public final class TransactionRepositoryImpl_Factory implements Factory<TransactionRepositoryImpl> {
  private final Provider<TransactionDao> daoProvider;

  public TransactionRepositoryImpl_Factory(Provider<TransactionDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public TransactionRepositoryImpl get() {
    return newInstance(daoProvider.get());
  }

  public static TransactionRepositoryImpl_Factory create(Provider<TransactionDao> daoProvider) {
    return new TransactionRepositoryImpl_Factory(daoProvider);
  }

  public static TransactionRepositoryImpl newInstance(TransactionDao dao) {
    return new TransactionRepositoryImpl(dao);
  }
}