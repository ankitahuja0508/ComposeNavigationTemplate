package stupefying.labs.screens.template

import androidx.compose.foundation.layout.fillMaxSize
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

@RootNavGraph(start = true)
@Destination
@Composable
fun TemplateScreen(
    navigator: DestinationsNavigator,
    mainViewModel: MainViewModel = activityViewModel(),
    viewModel: TemplateViewModel = hiltViewModel()
) {
    TemplateView()
}

@Composable
fun TemplateView(
){
    ScreenBody(modifier = Modifier.fillMaxSize()) {
        Center {
            Text("Template Screen")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun TemplatePreview(){
    TemplateView()
}