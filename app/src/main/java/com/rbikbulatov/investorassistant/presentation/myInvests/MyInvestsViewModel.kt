package com.rbikbulatov.investorassistant.presentation.myInvests

import androidx.lifecycle.ViewModel
import com.rbikbulatov.investorassistant.domain.Invest
import com.rbikbulatov.investorassistant.domain.InvestInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyInvestsViewModel @Inject constructor(
    private val interactor: InvestInteractor
) : ViewModel() {

    fun getInvests(): List<Invest>? {
        return interactor.getInvests()?.toList()
    }

    fun deleteInvest(id: String) {
        interactor.deleteInvest(id)
    }
}