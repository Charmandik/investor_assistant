package com.rbikbulatov.investorassistant

import com.rbikbulatov.investorassistant.domain.Invest
import java.math.BigDecimal
import kotlin.math.pow

/*   S = V * (1 + P / 100) n, где:

    V – сумма вклада,

    P – годовая процентная ставка по тарифу,

    n – срок в годах,

    S – общая сумма на конец графика.*/

fun calculate(
    invest: Invest,
): BigDecimal {
    val countOfIncomePeriodInYear = (12 / invest.incomePeriod)
    val incomePerYear =
        (1 + (invest.yearPercent / 100) / countOfIncomePeriodInYear).pow(countOfIncomePeriodInYear * invest.yearCount)
    return BigDecimal(invest.startMoney * incomePerYear)
}