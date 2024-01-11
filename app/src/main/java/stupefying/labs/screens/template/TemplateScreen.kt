package stupefying.labs.screens.template

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import stupefying.labs.MainViewModel
import stupefying.labs.components.Center
import stupefying.labs.components.ScreenBody
import stupefying.labs.extensions.activityViewModel
import stupefying.labs.screens.destinations.TemplateBottomTabsScreenDestination

@RootNavGraph(start = true)
@Destination
@Composable
fun TemplateScreen(
    navigator: DestinationsNavigator,
    mainViewModel: MainViewModel = activityViewModel(),
    viewModel: TemplateViewModel = hiltViewModel()
) {
    TemplateView{
        navigator.navigate(TemplateBottomTabsScreenDestination)
    }
}

@Composable
fun TemplateView(
    navigateToBottomTabs : ()->Unit
){
    ScreenBody(modifier = Modifier.fillMaxSize()) {
        Center {
            Text("Template Screen")
            Button(onClick = navigateToBottomTabs) {
                Text(text = "Navigate to Bottom Tabs")
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun TemplatePreview(){
    TemplateView{}
}