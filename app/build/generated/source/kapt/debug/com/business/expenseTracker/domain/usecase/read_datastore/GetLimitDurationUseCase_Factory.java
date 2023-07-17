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
public final class GetLimitDurationUseCase_Factory implements Factory<GetLimitDurationUseCase> {
  private final Provider<DatastoreRepository> datastoreRepositoryProvider;

  public GetLimitDurationUseCase_Factory(
      Provider<DatastoreRepository> datastoreRepositoryProvider) {
    this.datastoreRepositoryProvider = datastoreRepositoryProvider;
  }

  @Override
  public GetLimitDurationUseCase get() {
    return newInstance(datastoreRepositoryProvider.get());
  }

  public static GetLimitDurationUseCase_Factory create(
      Provider<DatastoreRepository> datastoreRepositoryProvider) {
    return new GetLimitDurationUseCase_Factory(datastoreRepositoryProvider);
  }

  public static GetLimitDurationUseCase newInstance(DatastoreRepository datastoreRepository) {
    return new GetLimitDurationUseCase(datastoreRepository);
  }
}