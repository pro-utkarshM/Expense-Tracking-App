package com.business.expenseTracker.domain.repository

interface PrefsRepository {
    fun getPref(name: String): String?
    fun setPref(name: String, value: String)
}