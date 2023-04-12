package com.rbikbulatov.investorassistant.presentation.prediction

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun PredictionsPage(
    viewModel: PredictionViewModel
) {
    Column {
        Text(text = "Прогноз")
        Text(text = "Итог на конец года ")
        Text(text = "Прогноз")
    }
}