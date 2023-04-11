package com.rbikbulatov.investorassistant.presentation.myInvests

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.rbikbulatov.investorassistant.R
import com.rbikbulatov.investorassistant.domain.Invest

@Composable
fun MyInvestItem(
    invest: Invest,
    onDeleteBtnClick: (String) -> Unit
) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        val (title, deleteBtn) = createRefs()
        Text(
            text = invest.toString(),
            modifier = Modifier.constrainAs(title) {
                start.linkTo(parent.start, margin = 8.dp)
                end.linkTo(deleteBtn.start)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                width = Dimension.fillToConstraints
            }
        )

        Icon(
            painter = painterResource(id = R.drawable.ic_delete),
            contentDescription = null,
            modifier = Modifier
                .constrainAs(deleteBtn) {
                    end.linkTo(parent.end, margin = 8.dp)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
                .clickable { onDeleteBtnClick.invoke(invest.id) }
        )
    }
}

@Preview
@Composable
fun MyInvestItemPreview(
) {
    MyInvestItem(
        Invest(
            id = "",
            title = "Автоломбард",
            startMoney = 100.0,
            yearPercent = 15.0,
            yearCount = 3,
            incomePeriod = 6
        ),
        onDeleteBtnClick = {}
    )
}