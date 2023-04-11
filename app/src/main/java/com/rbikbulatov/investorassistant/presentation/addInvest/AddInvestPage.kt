package com.rbikbulatov.investorassistant.presentation.addInvest

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun AddInvest(
    viewModel: AddInvestViewModel = hiltViewModel()
) {
    var title by remember { mutableStateOf("") }
    var startMoneyText by remember { mutableStateOf("") }
    var yearPercentText by remember { mutableStateOf("") }
    var yearCountText by remember { mutableStateOf("") }
    var incomePeriodText by remember { mutableStateOf("") }

    Column(Modifier.fillMaxSize()) {
        OutlinedTextField(
            value = title,
            onValueChange = { text ->
                title = text
            },
            label = { Text("title") }
        )

        OutlinedTextField(
            value = startMoneyText,
            onValueChange = { text ->
                startMoneyText = text
            },
            label = { Text("startMoney") }
        )

        OutlinedTextField(
            value = yearPercentText,
            onValueChange = { text ->
                yearPercentText = text
            },
            label = { Text("yearPercent") }
        )


        OutlinedTextField(
            value = yearCountText,
            onValueChange = { text ->
                yearCountText = text
            },
            label = { Text("yearCount") }
        )

        OutlinedTextField(
            value = incomePeriodText,
            onValueChange = { text ->
                incomePeriodText = text
            },
            label = { Text("incomePeriod") }
        )

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            onClick = {
                viewModel.onAddInvest(
                    title = title,
                    startMoneyText = startMoneyText,
                    yearPercentText = yearPercentText,
                    yearCountText = yearCountText,
                    incomePeriodText = incomePeriodText
                )
            },
            enabled = true
        ) {
            Text(text = "Добавить", color = Color.Black)
        }
    }
}