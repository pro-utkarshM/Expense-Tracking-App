package com.business.expenseTracker.di;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = ExpenseTrackerApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface ExpenseTrackerApplication_GeneratedInjector {
  void injectExpenseTrackerApplication(ExpenseTrackerApplication expenseTrackerApplication);
}
