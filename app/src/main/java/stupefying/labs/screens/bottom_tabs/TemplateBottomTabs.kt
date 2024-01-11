package stupefying.labs.screens.bottom_tabs

import androidx.annotation.StringRes
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavOptionsBuilder
import com.ramcosta.composedestinations.navigation.navigate
import com.ramcosta.composedestinations.spec.NavGraphSpec
import com.ramcosta.composedestinations.utils.anyDestination
import stupefying.labs.R
import stupefying.labs.screens.NavGraphs
import stupefying.labs.screens.appCurrentDestinationAsState
import stupefying.labs.screens.destinations.TypedDestination
import stupefying.labs.screens.startAppDestination

enum class BottomBarDestination(
    val direction: NavGraphSpec,
    val icon: ImageVector,
    @StringRes val label: Int
) {
    FirstTab(NavGraphs.firstTab, Icons.Default.Home, R.string.first_tab),
    Second(NavGraphs.secondTab, Icons.Default.Email, R.string.second_tab),
}

@Composable
fun BottomBar(
    navController: NavController
) {

    val currentDestination: TypedDestination<out Any?> = navController.appCurrentDestinationAsState().value
        ?: NavGraphs.bottomTabs.startAppDestination

    BottomNavigation {
        BottomBarDestination.entries.forEach { destination ->
            val isSelected = destination.direction.anyDestination {
                it == currentDestination
            }
            BottomNavigationItem(
                selected = isSelected,
                onClick = {
                    navController.navigate(destination.direction, navOptionsBuilder = fun NavOptionsBuilder.() {
                        popUpTo(navController.graph.findStartDestination().id){
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    })
                },
                icon = { Icon(destination.icon, contentDescription = stringResource(destination.label), tint = if (isSelected) Color.White else Color.Gray) },
                label = { Text(stringResource(destination.label), style = TextStyle(color = if (isSelected) Color.White else Color.Gray)) },
            )
        }
    }
}