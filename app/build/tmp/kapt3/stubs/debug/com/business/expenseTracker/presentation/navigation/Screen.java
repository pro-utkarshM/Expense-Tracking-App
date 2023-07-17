package com.business.expenseTracker.presentation.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0007\b\t\n\u000b\f\r\u000eB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/business/expenseTracker/presentation/navigation/Screen;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "AccountDetailScreen", "AccountScreen", "CurrencyScreen", "HomeScreen", "InsightScreen", "SettingScreen", "TransactionScreen", "WelcomeScreen", "Lcom/business/expenseTracker/presentation/navigation/Screen$AccountDetailScreen;", "Lcom/business/expenseTracker/presentation/navigation/Screen$AccountScreen;", "Lcom/business/expenseTracker/presentation/navigation/Screen$CurrencyScreen;", "Lcom/business/expenseTracker/presentation/navigation/Screen$HomeScreen;", "Lcom/business/expenseTracker/presentation/navigation/Screen$InsightScreen;", "Lcom/business/expenseTracker/presentation/navigation/Screen$SettingScreen;", "Lcom/business/expenseTracker/presentation/navigation/Screen$TransactionScreen;", "Lcom/business/expenseTracker/presentation/navigation/Screen$WelcomeScreen;", "app_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String route = null;
    
    private Screen(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/business/expenseTracker/presentation/navigation/Screen$WelcomeScreen;", "Lcom/business/expenseTracker/presentation/navigation/Screen;", "()V", "app_debug"})
    public static final class WelcomeScreen extends com.business.expenseTracker.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.business.expenseTracker.presentation.navigation.Screen.WelcomeScreen INSTANCE = null;
        
        private WelcomeScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/business/expenseTracker/presentation/navigation/Screen$CurrencyScreen;", "Lcom/business/expenseTracker/presentation/navigation/Screen;", "()V", "app_debug"})
    public static final class CurrencyScreen extends com.business.expenseTracker.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.business.expenseTracker.presentation.navigation.Screen.CurrencyScreen INSTANCE = null;
        
        private CurrencyScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/business/expenseTracker/presentation/navigation/Screen$HomeScreen;", "Lcom/business/expenseTracker/presentation/navigation/Screen;", "()V", "app_debug"})
    public static final class HomeScreen extends com.business.expenseTracker.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.business.expenseTracker.presentation.navigation.Screen.HomeScreen INSTANCE = null;
        
        private HomeScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/business/expenseTracker/presentation/navigation/Screen$TransactionScreen;", "Lcom/business/expenseTracker/presentation/navigation/Screen;", "()V", "app_debug"})
    public static final class TransactionScreen extends com.business.expenseTracker.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.business.expenseTracker.presentation.navigation.Screen.TransactionScreen INSTANCE = null;
        
        private TransactionScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/business/expenseTracker/presentation/navigation/Screen$InsightScreen;", "Lcom/business/expenseTracker/presentation/navigation/Screen;", "()V", "app_debug"})
    public static final class InsightScreen extends com.business.expenseTracker.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.business.expenseTracker.presentation.navigation.Screen.InsightScreen INSTANCE = null;
        
        private InsightScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/business/expenseTracker/presentation/navigation/Screen$AccountScreen;", "Lcom/business/expenseTracker/presentation/navigation/Screen;", "()V", "app_debug"})
    public static final class AccountScreen extends com.business.expenseTracker.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.business.expenseTracker.presentation.navigation.Screen.AccountScreen INSTANCE = null;
        
        private AccountScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/business/expenseTracker/presentation/navigation/Screen$AccountDetailScreen;", "Lcom/business/expenseTracker/presentation/navigation/Screen;", "()V", "app_debug"})
    public static final class AccountDetailScreen extends com.business.expenseTracker.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.business.expenseTracker.presentation.navigation.Screen.AccountDetailScreen INSTANCE = null;
        
        private AccountDetailScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/business/expenseTracker/presentation/navigation/Screen$SettingScreen;", "Lcom/business/expenseTracker/presentation/navigation/Screen;", "()V", "app_debug"})
    public static final class SettingScreen extends com.business.expenseTracker.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.business.expenseTracker.presentation.navigation.Screen.SettingScreen INSTANCE = null;
        
        private SettingScreen() {
            super(null);
        }
    }
}