package com.business.expenseTracker.presentation.welcome_screen.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0001\u0003\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/business/expenseTracker/presentation/welcome_screen/components/OnBoardingPage;", "", "icon", "", "title", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getIcon", "getTitle", "FirstPage", "SecondPage", "ThirdPage", "Lcom/business/expenseTracker/presentation/welcome_screen/components/OnBoardingPage$FirstPage;", "Lcom/business/expenseTracker/presentation/welcome_screen/components/OnBoardingPage$SecondPage;", "Lcom/business/expenseTracker/presentation/welcome_screen/components/OnBoardingPage$ThirdPage;", "app_debug"})
public abstract class OnBoardingPage {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String icon = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String description = null;
    
    private OnBoardingPage(java.lang.String icon, java.lang.String title, java.lang.String description) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/business/expenseTracker/presentation/welcome_screen/components/OnBoardingPage$FirstPage;", "Lcom/business/expenseTracker/presentation/welcome_screen/components/OnBoardingPage;", "()V", "app_debug"})
    public static final class FirstPage extends com.business.expenseTracker.presentation.welcome_screen.components.OnBoardingPage {
        @org.jetbrains.annotations.NotNull
        public static final com.business.expenseTracker.presentation.welcome_screen.components.OnBoardingPage.FirstPage INSTANCE = null;
        
        private FirstPage() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/business/expenseTracker/presentation/welcome_screen/components/OnBoardingPage$SecondPage;", "Lcom/business/expenseTracker/presentation/welcome_screen/components/OnBoardingPage;", "()V", "app_debug"})
    public static final class SecondPage extends com.business.expenseTracker.presentation.welcome_screen.components.OnBoardingPage {
        @org.jetbrains.annotations.NotNull
        public static final com.business.expenseTracker.presentation.welcome_screen.components.OnBoardingPage.SecondPage INSTANCE = null;
        
        private SecondPage() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/business/expenseTracker/presentation/welcome_screen/components/OnBoardingPage$ThirdPage;", "Lcom/business/expenseTracker/presentation/welcome_screen/components/OnBoardingPage;", "()V", "app_debug"})
    public static final class ThirdPage extends com.business.expenseTracker.presentation.welcome_screen.components.OnBoardingPage {
        @org.jetbrains.annotations.NotNull
        public static final com.business.expenseTracker.presentation.welcome_screen.components.OnBoardingPage.ThirdPage INSTANCE = null;
        
        private ThirdPage() {
            super(null, null, null);
        }
    }
}