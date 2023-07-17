// Generated by Dagger (https://dagger.dev).
package com.business.expenseTracker.presentation.welcome_screen;

import com.business.expenseTracker.domain.usecase.GetCurrencyUseCase;
import com.business.expenseTracker.domain.usecase.write_database.InsertAccountsUseCase;
import com.business.expenseTracker.domain.usecase.write_datastore.EditCurrencyUseCase;
import com.business.expenseTracker.domain.usecase.write_datastore.EditOnBoardingUseCase;
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
public final class WelcomeViewModel_Factory implements Factory<WelcomeViewModel> {
  private final Provider<EditOnBoardingUseCase> editOnBoardingUseCaseProvider;

  private final Provider<EditCurrencyUseCase> editCurrencyUseCaseProvider;

  private final Provider<InsertAccountsUseCase> insertAccountsUseCaseProvider;

  private final Provider<GetCurrencyUseCase> getCurrencyUseCaseProvider;

  public WelcomeViewModel_Factory(Provider<EditOnBoardingUseCase> editOnBoardingUseCaseProvider,
      Provider<EditCurrencyUseCase> editCurrencyUseCaseProvider,
      Provider<InsertAccountsUseCase> insertAccountsUseCaseProvider,
      Provider<GetCurrencyUseCase> getCurrencyUseCaseProvider) {
    this.editOnBoardingUseCaseProvider = editOnBoardingUseCaseProvider;
    this.editCurrencyUseCaseProvider = editCurrencyUseCaseProvider;
    this.insertAccountsUseCaseProvider = insertAccountsUseCaseProvider;
    this.getCurrencyUseCaseProvider = getCurrencyUseCaseProvider;
  }

  @Override
  public WelcomeViewModel get() {
    return newInstance(editOnBoardingUseCaseProvider.get(), editCurrencyUseCaseProvider.get(), insertAccountsUseCaseProvider.get(), getCurrencyUseCaseProvider.get());
  }

  public static WelcomeViewModel_Factory create(
      Provider<EditOnBoardingUseCase> editOnBoardingUseCaseProvider,
      Provider<EditCurrencyUseCase> editCurrencyUseCaseProvider,
      Provider<InsertAccountsUseCase> insertAccountsUseCaseProvider,
      Provider<GetCurrencyUseCase> getCurrencyUseCaseProvider) {
    return new WelcomeViewModel_Factory(editOnBoardingUseCaseProvider, editCurrencyUseCaseProvider, insertAccountsUseCaseProvider, getCurrencyUseCaseProvider);
  }

  public static WelcomeViewModel newInstance(EditOnBoardingUseCase editOnBoardingUseCase,
      EditCurrencyUseCase editCurrencyUseCase, InsertAccountsUseCase insertAccountsUseCase,
      GetCurrencyUseCase getCurrencyUseCase) {
    return new WelcomeViewModel(editOnBoardingUseCase, editCurrencyUseCase, insertAccountsUseCase, getCurrencyUseCase);
  }
}