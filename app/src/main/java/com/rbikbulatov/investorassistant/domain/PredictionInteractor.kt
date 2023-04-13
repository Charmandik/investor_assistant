package com.rbikbulatov.investorassistant.domain

import android.util.Log
import com.rbikbulatov.investorassistant.data.InvestSharedPreferences
import java.time.LocalDate
import javax.inject.Inject

class PredictionInteractor @Inject constructor(
    private val sharedPreferences: InvestSharedPreferences
) {

    fun getPredictionForEndOfYear() {
        val invests = sharedPreferences.getInvests()
        var countOfMonthsLeft = getCountOfMonthsLeftToEndOfYear()

        invests?.forEach {

        }
    }

    private fun getCountOfMonthsLeftToEndOfYear(): Int {
        val currentDate = LocalDate.now()
        val endOfYearDate = LocalDate.of(currentDate.year, 12, 1)
        return endOfYearDate.monthValue - currentDate.monthValue
    }
}