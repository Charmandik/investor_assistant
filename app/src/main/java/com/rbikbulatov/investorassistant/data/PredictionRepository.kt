package com.rbikbulatov.investorassistant.data

import javax.inject.Inject

class PredictionRepository @Inject constructor(
    private val sharedPreferences: InvestSharedPreferences
) {
}