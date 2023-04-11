package com.rbikbulatov.investorassistant.domain

data class Invest(
    val id: String,
    val title: String,
    val startMoney: Double,
    val yearPercent: Double,
    val yearCount: Int,
    val incomePeriod: Int
)