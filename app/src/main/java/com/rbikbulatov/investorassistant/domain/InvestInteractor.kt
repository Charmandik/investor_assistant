package com.rbikbulatov.investorassistant.domain

import com.rbikbulatov.investorassistant.data.InvestSharedPreferences
import java.util.*
import javax.inject.Inject

class InvestInteractor @Inject constructor(
    private val sharedPreferences: InvestSharedPreferences
) {
    fun addInvest(
        title: String,
        startMoney: Double,
        yearPercent: Double,
        yearCount: Int,
        incomePeriod: Int
    ) {
        sharedPreferences.addInvest(
            Invest(
                id = UUID.randomUUID().toString(),
                title = title,
                startMoney = startMoney,
                yearPercent = yearPercent,
                yearCount = yearCount,
                incomePeriod = incomePeriod
            )
        )
    }

    fun getInvests(): MutableSet<Invest>? {
        return sharedPreferences.getInvests()
    }

    fun deleteInvest(id: String) {
        sharedPreferences.deleteInvest(id)
    }
}