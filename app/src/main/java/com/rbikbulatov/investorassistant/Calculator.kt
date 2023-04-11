package com.rbikbulatov.investorassistant

import java.math.BigDecimal
import kotlin.math.pow

/*   S = V * (1 + P / 100) n, где:

    V – сумма вклада,

    P – годовая процентная ставка по тарифу,

    n – срок в годах,

    S – общая сумма на конец графика.*/

fun calculate(
    startMoney: Int,
    yearPercent: Double,
    yearCount: Int,
    incomePeriod: Int
): BigDecimal {
    val countOfIncomePeriodInYear = (12 / incomePeriod)
    val incomePerYear =
        (1 + (yearPercent / 100) / countOfIncomePeriodInYear).pow(countOfIncomePeriodInYear * yearCount)
    return BigDecimal(startMoney * incomePerYear)
}