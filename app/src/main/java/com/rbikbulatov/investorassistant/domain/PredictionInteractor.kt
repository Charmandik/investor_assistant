package com.rbikbulatov.investorassistant.domain

import com.rbikbulatov.investorassistant.data.InvestSharedPreferences
import javax.inject.Inject

class PredictionInteractor @Inject constructor(
    private val sharedPreferences: InvestSharedPreferences
) {

    fun getPredictionForEndOfYear() {
        val invests = sharedPreferences.getInvests()
        invests?.forEach {

        }
    }
}