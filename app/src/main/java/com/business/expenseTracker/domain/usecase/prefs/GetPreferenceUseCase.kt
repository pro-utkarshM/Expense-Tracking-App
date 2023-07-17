package com.business.expenseTracker.domain.usecase.prefs

import com.business.expenseTracker.domain.repository.PrefsRepository
import javax.inject.Inject

class GetPreferenceUseCase @Inject constructor(
    private val prefsRepository: PrefsRepository
) {
    operator fun invoke(name: String) =
        prefsRepository.getPref(name)
}