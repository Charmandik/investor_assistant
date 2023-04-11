package com.rbikbulatov.investorassistant.presentation.myInvests

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun MyInvests(
    viewModel: MyInvestsViewModel = hiltViewModel()
) {
    val invests = viewModel.getInvests() ?: emptyList()
    LazyColumn {
        items(invests) { invest ->
            MyInvestItem(
                invest = invest,
                onDeleteBtnClick = { id -> viewModel.deleteInvest(id) }
            )
        }
    }
}