// Generated by Dagger (https://dagger.dev).
package com.business.expenseTracker.di;

import android.app.Activity;
import android.app.Service;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.business.expenseTracker.data.local.TransactionDao;
import com.business.expenseTracker.data.local.TransactionDatabase;
import com.business.expenseTracker.domain.repository.DatastoreRepository;
import com.business.expenseTracker.domain.repository.PrefsRepository;
import com.business.expenseTracker.domain.repository.TransactionRepository;
import com.business.expenseTracker.domain.usecase.GetDateUseCase;
import com.business.expenseTracker.domain.usecase.GetFormattedDateUseCase;
import com.business.expenseTracker.domain.usecase.prefs.GetPreferenceUseCase;
import com.business.expenseTracker.domain.usecase.prefs.SetPreferenceUseCase;
import com.business.expenseTracker.domain.usecase.read_database.Get14DayTransaction;
import com.business.expenseTracker.domain.usecase.read_database.Get3DayTransaction;
import com.business.expenseTracker.domain.usecase.read_database.Get7DayTransaction;
import com.business.expenseTracker.domain.usecase.read_database.GetAccountUseCase;
import com.business.expenseTracker.domain.usecase.read_database.GetAccountsUseCase;
import com.business.expenseTracker.domain.usecase.read_database.GetAllTransactionUseCase;
import com.business.expenseTracker.domain.usecase.read_database.GetCurrentDayExpTransactionUseCase;
import com.business.expenseTracker.domain.usecase.read_database.GetDailyTransactionUseCase;
import com.business.expenseTracker.domain.usecase.read_database.GetLastMonthTransaction;
import com.business.expenseTracker.domain.usecase.read_database.GetMonthlyExpTransactionUse;
import com.business.expenseTracker.domain.usecase.read_database.GetStartOfMonthTransaction;
import com.business.expenseTracker.domain.usecase.read_database.GetTransactionByAccount;
import com.business.expenseTracker.domain.usecase.read_database.GetTransactionByTypeUseCase;
import com.business.expenseTracker.domain.usecase.read_database.GetWeeklyExpTransactionUseCase;
import com.business.expenseTracker.domain.usecase.read_datastore.GetCurrencyUseCase;
import com.business.expenseTracker.domain.usecase.read_datastore.GetExpenseLimitUseCase;
import com.business.expenseTracker.domain.usecase.read_datastore.GetLimitDurationUseCase;
import com.business.expenseTracker.domain.usecase.read_datastore.GetLimitKeyUseCase;
import com.business.expenseTracker.domain.usecase.read_datastore.GetOnBoardingKeyUseCase;
import com.business.expenseTracker.domain.usecase.write_database.EraseTransactionUseCase;
import com.business.expenseTracker.domain.usecase.write_database.InsertAccountsUseCase;
import com.business.expenseTracker.domain.usecase.write_database.InsertNewTransactionUseCase;
import com.business.expenseTracker.domain.usecase.write_datastore.EditCurrencyUseCase;
import com.business.expenseTracker.domain.usecase.write_datastore.EditExpenseLimitUseCase;
import com.business.expenseTracker.domain.usecase.write_datastore.EditLimitDurationUseCase;
import com.business.expenseTracker.domain.usecase.write_datastore.EditLimitKeyUseCase;
import com.business.expenseTracker.domain.usecase.write_datastore.EditOnBoardingUseCase;
import com.business.expenseTracker.domain.usecase.write_datastore.EraseDatastoreUseCase;
import com.business.expenseTracker.presentation.account_screen.AccountViewModel;
import com.business.expenseTracker.presentation.account_screen.AccountViewModel_HiltModules_KeyModule_ProvideFactory;
import com.business.expenseTracker.presentation.home_screen.HomeViewModel;
import com.business.expenseTracker.presentation.home_screen.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.business.expenseTracker.presentation.insight_screen.InsightViewModel;
import com.business.expenseTracker.presentation.insight_screen.InsightViewModel_HiltModules_KeyModule_ProvideFactory;
import com.business.expenseTracker.presentation.main.MainActivity;
import com.business.expenseTracker.presentation.main.MainActivity_MembersInjector;
import com.business.expenseTracker.presentation.main.MainViewModel;
import com.business.expenseTracker.presentation.setting_screen.SettingViewModel;
import com.business.expenseTracker.presentation.setting_screen.SettingViewModel_HiltModules_KeyModule_ProvideFactory;
import com.business.expenseTracker.presentation.setting_screen.service.ResetWorkerFactory;
import com.business.expenseTracker.presentation.welcome_screen.WelcomeViewModel;
import com.business.expenseTracker.presentation.welcome_screen.WelcomeViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DaggerExpenseTrackerApplication_HiltComponents_SingletonC {
  private DaggerExpenseTrackerApplication_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder expenseTrackerModule(ExpenseTrackerModule expenseTrackerModule) {
      Preconditions.checkNotNull(expenseTrackerModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    public ExpenseTrackerApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements ExpenseTrackerApplication_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ExpenseTrackerApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements ExpenseTrackerApplication_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public ExpenseTrackerApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements ExpenseTrackerApplication_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public ExpenseTrackerApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements ExpenseTrackerApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public ExpenseTrackerApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements ExpenseTrackerApplication_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public ExpenseTrackerApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements ExpenseTrackerApplication_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public ExpenseTrackerApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements ExpenseTrackerApplication_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public ExpenseTrackerApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends ExpenseTrackerApplication_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends ExpenseTrackerApplication_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends ExpenseTrackerApplication_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends ExpenseTrackerApplication_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    private GetOnBoardingKeyUseCase getOnBoardingKeyUseCase() {
      return new GetOnBoardingKeyUseCase(singletonCImpl.provideDatastoreRepositoryProvider.get());
    }

    private GetPreferenceUseCase getPreferenceUseCase() {
      return new GetPreferenceUseCase(singletonCImpl.providePrefsRepositoryProvider.get());
    }

    private SetPreferenceUseCase setPreferenceUseCase() {
      return new SetPreferenceUseCase(singletonCImpl.providePrefsRepositoryProvider.get());
    }

    private MainViewModel mainViewModel() {
      return new MainViewModel(getOnBoardingKeyUseCase(), getPreferenceUseCase(), setPreferenceUseCase());
    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
      injectMainActivity2(mainActivity);
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(5).add(AccountViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(InsightViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SettingViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(WelcomeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    private MainActivity injectMainActivity2(MainActivity instance) {
      MainActivity_MembersInjector.injectMainViewModel(instance, mainViewModel());
      return instance;
    }
  }

  private static final class ViewModelCImpl extends ExpenseTrackerApplication_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<AccountViewModel> accountViewModelProvider;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<InsightViewModel> insightViewModelProvider;

    private Provider<SettingViewModel> settingViewModelProvider;

    private Provider<WelcomeViewModel> welcomeViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    private GetCurrencyUseCase getCurrencyUseCase() {
      return new GetCurrencyUseCase(singletonCImpl.provideDatastoreRepositoryProvider.get());
    }

    private GetAccountsUseCase getAccountsUseCase() {
      return new GetAccountsUseCase(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private GetTransactionByAccount getTransactionByAccount() {
      return new GetTransactionByAccount(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private InsertNewTransactionUseCase insertNewTransactionUseCase() {
      return new InsertNewTransactionUseCase(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private InsertAccountsUseCase insertAccountsUseCase() {
      return new InsertAccountsUseCase(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private GetDailyTransactionUseCase getDailyTransactionUseCase() {
      return new GetDailyTransactionUseCase(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private GetAllTransactionUseCase getAllTransactionUseCase() {
      return new GetAllTransactionUseCase(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private GetAccountUseCase getAccountUseCase() {
      return new GetAccountUseCase(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private GetExpenseLimitUseCase getExpenseLimitUseCase() {
      return new GetExpenseLimitUseCase(singletonCImpl.provideDatastoreRepositoryProvider.get());
    }

    private GetLimitDurationUseCase getLimitDurationUseCase() {
      return new GetLimitDurationUseCase(singletonCImpl.provideDatastoreRepositoryProvider.get());
    }

    private GetLimitKeyUseCase getLimitKeyUseCase() {
      return new GetLimitKeyUseCase(singletonCImpl.provideDatastoreRepositoryProvider.get());
    }

    private GetCurrentDayExpTransactionUseCase getCurrentDayExpTransactionUseCase() {
      return new GetCurrentDayExpTransactionUseCase(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private GetWeeklyExpTransactionUseCase getWeeklyExpTransactionUseCase() {
      return new GetWeeklyExpTransactionUseCase(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private GetMonthlyExpTransactionUse getMonthlyExpTransactionUse() {
      return new GetMonthlyExpTransactionUse(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private Get3DayTransaction get3DayTransaction() {
      return new Get3DayTransaction(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private Get7DayTransaction get7DayTransaction() {
      return new Get7DayTransaction(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private Get14DayTransaction get14DayTransaction() {
      return new Get14DayTransaction(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private GetStartOfMonthTransaction getStartOfMonthTransaction() {
      return new GetStartOfMonthTransaction(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private GetLastMonthTransaction getLastMonthTransaction() {
      return new GetLastMonthTransaction(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private GetTransactionByTypeUseCase getTransactionByTypeUseCase() {
      return new GetTransactionByTypeUseCase(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private EraseTransactionUseCase eraseTransactionUseCase() {
      return new EraseTransactionUseCase(singletonCImpl.provideExpenseRepositoryProvider.get());
    }

    private EditLimitKeyUseCase editLimitKeyUseCase() {
      return new EditLimitKeyUseCase(singletonCImpl.provideDatastoreRepositoryProvider.get());
    }

    private EditLimitDurationUseCase editLimitDurationUseCase() {
      return new EditLimitDurationUseCase(singletonCImpl.provideDatastoreRepositoryProvider.get());
    }

    private EraseDatastoreUseCase eraseDatastoreUseCase() {
      return new EraseDatastoreUseCase(singletonCImpl.provideDatastoreRepositoryProvider.get());
    }

    private EditOnBoardingUseCase editOnBoardingUseCase() {
      return new EditOnBoardingUseCase(singletonCImpl.provideDatastoreRepositoryProvider.get());
    }

    private EditCurrencyUseCase editCurrencyUseCase() {
      return new EditCurrencyUseCase(singletonCImpl.provideDatastoreRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.accountViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.homeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.insightViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.settingViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.welcomeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(5).put("com.business.expenseTracker.presentation.account_screen.AccountViewModel", ((Provider) accountViewModelProvider)).put("com.business.expenseTracker.presentation.home_screen.HomeViewModel", ((Provider) homeViewModelProvider)).put("com.business.expenseTracker.presentation.insight_screen.InsightViewModel", ((Provider) insightViewModelProvider)).put("com.business.expenseTracker.presentation.setting_screen.SettingViewModel", ((Provider) settingViewModelProvider)).put("com.business.expenseTracker.presentation.welcome_screen.WelcomeViewModel", ((Provider) welcomeViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.business.expenseTracker.presentation.account_screen.AccountViewModel 
          return (T) new AccountViewModel(viewModelCImpl.getCurrencyUseCase(), viewModelCImpl.getAccountsUseCase(), viewModelCImpl.getTransactionByAccount());

          case 1: // com.business.expenseTracker.presentation.home_screen.HomeViewModel 
          return (T) new HomeViewModel(new GetDateUseCase(), new GetFormattedDateUseCase(), viewModelCImpl.insertNewTransactionUseCase(), viewModelCImpl.insertAccountsUseCase(), viewModelCImpl.getDailyTransactionUseCase(), viewModelCImpl.getAllTransactionUseCase(), viewModelCImpl.getAccountUseCase(), viewModelCImpl.getAccountsUseCase(), viewModelCImpl.getCurrencyUseCase(), viewModelCImpl.getExpenseLimitUseCase(), viewModelCImpl.getLimitDurationUseCase(), viewModelCImpl.getLimitKeyUseCase(), viewModelCImpl.getCurrentDayExpTransactionUseCase(), viewModelCImpl.getWeeklyExpTransactionUseCase(), viewModelCImpl.getMonthlyExpTransactionUse());

          case 2: // com.business.expenseTracker.presentation.insight_screen.InsightViewModel 
          return (T) new InsightViewModel(viewModelCImpl.getCurrencyUseCase(), viewModelCImpl.get3DayTransaction(), viewModelCImpl.get7DayTransaction(), viewModelCImpl.get14DayTransaction(), viewModelCImpl.getStartOfMonthTransaction(), viewModelCImpl.getLastMonthTransaction(), viewModelCImpl.getTransactionByTypeUseCase());

          case 3: // com.business.expenseTracker.presentation.setting_screen.SettingViewModel 
          return (T) new SettingViewModel(viewModelCImpl.getCurrencyUseCase(), viewModelCImpl.insertAccountsUseCase(), viewModelCImpl.eraseTransactionUseCase(), viewModelCImpl.getExpenseLimitUseCase(), singletonCImpl.editExpenseLimitUseCase(), viewModelCImpl.getLimitKeyUseCase(), viewModelCImpl.editLimitKeyUseCase(), viewModelCImpl.editLimitDurationUseCase(), viewModelCImpl.getLimitDurationUseCase(), viewModelCImpl.eraseDatastoreUseCase());

          case 4: // com.business.expenseTracker.presentation.welcome_screen.WelcomeViewModel 
          return (T) new WelcomeViewModel(viewModelCImpl.editOnBoardingUseCase(), viewModelCImpl.editCurrencyUseCase(), viewModelCImpl.insertAccountsUseCase(), new com.business.expenseTracker.domain.usecase.GetCurrencyUseCase());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends ExpenseTrackerApplication_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends ExpenseTrackerApplication_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends ExpenseTrackerApplication_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<DatastoreRepository> provideDatastoreRepositoryProvider;

    private Provider<SharedPreferences> provideSharedPreferencesProvider;

    private Provider<PrefsRepository> providePrefsRepositoryProvider;

    private Provider<TransactionDatabase> provideExpenseDatabaseProvider;

    private Provider<TransactionDao> provideExpenseDaoProvider;

    private Provider<TransactionRepository> provideExpenseRepositoryProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    private EditExpenseLimitUseCase editExpenseLimitUseCase() {
      return new EditExpenseLimitUseCase(provideDatastoreRepositoryProvider.get());
    }

    private ResetWorkerFactory resetWorkerFactory() {
      return new ResetWorkerFactory(editExpenseLimitUseCase());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideDatastoreRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<DatastoreRepository>(singletonCImpl, 0));
      this.provideSharedPreferencesProvider = DoubleCheck.provider(new SwitchingProvider<SharedPreferences>(singletonCImpl, 2));
      this.providePrefsRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<PrefsRepository>(singletonCImpl, 1));
      this.provideExpenseDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<TransactionDatabase>(singletonCImpl, 5));
      this.provideExpenseDaoProvider = DoubleCheck.provider(new SwitchingProvider<TransactionDao>(singletonCImpl, 4));
      this.provideExpenseRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<TransactionRepository>(singletonCImpl, 3));
    }

    @Override
    public void injectExpenseTrackerApplication(
        ExpenseTrackerApplication expenseTrackerApplication) {
      injectExpenseTrackerApplication2(expenseTrackerApplication);
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private ExpenseTrackerApplication injectExpenseTrackerApplication2(
        ExpenseTrackerApplication instance) {
      ExpenseTrackerApplication_MembersInjector.injectFactory(instance, resetWorkerFactory());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.business.expenseTracker.domain.repository.DatastoreRepository 
          return (T) ExpenseTrackerModule_ProvideDatastoreRepositoryFactory.provideDatastoreRepository(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 1: // com.business.expenseTracker.domain.repository.PrefsRepository 
          return (T) ExpenseTrackerModule_ProvidePrefsRepositoryFactory.providePrefsRepository(singletonCImpl.provideSharedPreferencesProvider.get());

          case 2: // android.content.SharedPreferences 
          return (T) ExpenseTrackerModule_ProvideSharedPreferencesFactory.provideSharedPreferences(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 3: // com.business.expenseTracker.domain.repository.TransactionRepository 
          return (T) ExpenseTrackerModule_ProvideExpenseRepositoryFactory.provideExpenseRepository(singletonCImpl.provideExpenseDaoProvider.get());

          case 4: // com.business.expenseTracker.data.local.TransactionDao 
          return (T) ExpenseTrackerModule_ProvideExpenseDaoFactory.provideExpenseDao(singletonCImpl.provideExpenseDatabaseProvider.get());

          case 5: // com.business.expenseTracker.data.local.TransactionDatabase 
          return (T) ExpenseTrackerModule_ProvideExpenseDatabaseFactory.provideExpenseDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
