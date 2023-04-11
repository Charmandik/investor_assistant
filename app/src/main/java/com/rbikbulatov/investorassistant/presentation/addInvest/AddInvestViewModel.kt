package com.rbikbulatov.investorassistant.presentation.addInvest

import androidx.lifecycle.ViewModel
import com.rbikbulatov.investorassistant.domain.InvestInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddInvestViewModel @Inject constructor(
    private val interactor: InvestInteractor
) : ViewModel() {

    fun onAddInvest(
        title: String,
        startMoneyText: String,
        yearPercentText: String,
        yearCountText: String,
        incomePeriodText: String
    ) {
        interactor.addInvest(
            title = title,
            startMoney = startMoneyText.toDouble(),
            yearPercent = yearPercentText.toDouble(),
            yearCount = yearCountText.toInt(),
            incomePeriod = incomePeriodText.toInt()
        )
    }
}