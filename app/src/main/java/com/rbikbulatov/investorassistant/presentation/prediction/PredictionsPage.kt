package com.rbikbulatov.investorassistant.presentation.prediction

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun PredictionsPage(
    viewModel: PredictionViewModel = hiltViewModel()
) {
    LaunchedEffect(key1 = viewModel){
        viewModel.getPredictionToEndOfYear()
    }

    Column {
        Text(text = "Прогноз")
        Text(text = "Итог на конец года ")
        Text(text = "Прогноз")
    }
}