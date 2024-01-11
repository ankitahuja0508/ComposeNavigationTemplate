package stupefying.labs.screens.bottom_tabs.firsttab

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import stupefying.labs.MainViewModel
import stupefying.labs.components.ScreenBody
import stupefying.labs.extensions.activityViewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import stupefying.labs.screens.bottom_tabs.FirstTabNavGraph

@FirstTabNavGraph(start = true)
@Destination
@Composable
fun FirstTabScreen(
    navigator: DestinationsNavigator,
    mainViewModel: MainViewModel = activityViewModel(),
    viewModel: FirstTabViewModel = hiltViewModel()
) {
    FirstTabView()
}

@Composable
fun FirstTabView(
){
    ScreenBody(modifier = Modifier.fillMaxSize()) {
    }
}

@Composable
@Preview(showBackground = true)
fun FirstTabPreview(){
    FirstTabView()
}