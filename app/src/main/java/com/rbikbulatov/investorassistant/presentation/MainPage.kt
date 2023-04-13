package com.rbikbulatov.investorassistant.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainPage(
    onAddInvestClick: () -> Unit,
    onMyInvestClick: () -> Unit,
    onPredictionClick: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            onClick = onAddInvestClick,
        ) {
            Text(text = "Добавить инвестицию", color = Color.Black)
        }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            onClick = onMyInvestClick,
        ) {
            Text(text = "Мои инвестиции", color = Color.Black)
        }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            onClick = { /*TODO*/ },
            enabled = false
        ) {
            Text(text = "Калькулятор", color = Color.Black)
        }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            onClick = onPredictionClick,
        ) {
            Text(text = "Прогнозы", color = Color.Black)
        }
    }
}