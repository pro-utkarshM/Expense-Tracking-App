// Generated by Dagger (https://dagger.dev).
package com.business.expenseTracker.domain.usecase.read_datastore;

import com.business.expenseTracker.domain.repository.DatastoreRepository;
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
public final class GetLimitKeyUseCase_Factory implements Factory<GetLimitKeyUseCase> {
  private final Provider<DatastoreRepository> datastoreRepositoryProvider;

  public GetLimitKeyUseCase_Factory(Provider<DatastoreRepository> datastoreRepositoryProvider) {
    this.datastoreRepositoryProvider = datastoreRepositoryProvider;
  }

  @Override
  public GetLimitKeyUseCase get() {
    return newInstance(datastoreRepositoryProvider.get());
  }

  public static GetLimitKeyUseCase_Factory create(
      Provider<DatastoreRepository> datastoreRepositoryProvider) {
    return new GetLimitKeyUseCase_Factory(datastoreRepositoryProvider);
  }

  public static GetLimitKeyUseCase newInstance(DatastoreRepository datastoreRepository) {
    return new GetLimitKeyUseCase(datastoreRepository);
  }
}