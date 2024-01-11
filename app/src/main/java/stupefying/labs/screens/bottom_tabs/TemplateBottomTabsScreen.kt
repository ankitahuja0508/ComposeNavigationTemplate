package stupefying.labs.screens.bottom_tabs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import stupefying.labs.MainViewModel
import stupefying.labs.components.Center
import stupefying.labs.components.ScreenBody
import stupefying.labs.extensions.activityViewModel
import stupefying.labs.screens.NavGraphs

@Destination
@Composable
fun TemplateBottomTabsScreen(
    navigator: DestinationsNavigator,
    mainViewModel: MainViewModel = activityViewModel(),
    viewModel: TemplateBottomTabsViewModel = hiltViewModel()
) {
    TemplateBottomTabsView()
}

@Composable
fun TemplateBottomTabsView(
){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomBar(navController)
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            DestinationsNavHost(
                navGraph = NavGraphs.bottomTabs,
                navController = navController
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun TemplateBottomTabsPreview(){
    TemplateBottomTabsView()
}