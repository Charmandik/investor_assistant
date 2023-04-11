package com.rbikbulatov.investorassistant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rbikbulatov.compose_learning_app.ui.theme.InvestorAssistantTheme
import com.rbikbulatov.investorassistant.domain.Destinations.ADD_INVEST
import com.rbikbulatov.investorassistant.domain.Destinations.MAIN_PAGE
import com.rbikbulatov.investorassistant.domain.Destinations.MY_INVESTS
import com.rbikbulatov.investorassistant.presentation.MainPage
import com.rbikbulatov.investorassistant.presentation.addInvest.AddInvest
import com.rbikbulatov.investorassistant.presentation.myInvests.MyInvests
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            InvestorAssistantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Greeting(calculate(10000, 10.0, 10, 12).toString())
                    NavHost(navController = navController, startDestination = MAIN_PAGE) {

                        composable(MAIN_PAGE) {
                            MainPage(
                                onAddInvestClick = { navController.navigate(ADD_INVEST) },
                                onMyInvestClick = { navController.navigate(MY_INVESTS) }
                            )
                        }

                        composable(ADD_INVEST) {
                            AddInvest()
                        }

                        composable(MY_INVESTS) {
                            MyInvests()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InvestorAssistantTheme {
        Greeting("Android")
    }
}