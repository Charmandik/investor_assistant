package com.rbikbulatov.investorassistant.presentation.prediction

import androidx.lifecycle.ViewModel
import com.rbikbulatov.investorassistant.domain.PredictionInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PredictionViewModel @Inject constructor(
    private val predictionInteractor: PredictionInteractor
) : ViewModel() {

    fun getPredictionToEndOfYear() {
        return predictionInteractor.getPredictionForEndOfYear()
    }
}