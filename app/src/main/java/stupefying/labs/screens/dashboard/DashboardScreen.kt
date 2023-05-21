package stupefying.labs.screens.dashboard

import android.os.Parcelable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import stupefying.labs.MainViewModel
import stupefying.labs.components.ScreenBody
import stupefying.labs.extensions.activityViewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import kotlinx.android.parcel.Parcelize
import stupefying.labs.R
import stupefying.labs.components.Center

@Parcelize
data class User(
    val name:String = "",
    val email:String = "",
    val photoUrl:String = "",
): Parcelable

data class DashboardScreenNavArgs(
    val user: User = User(),
)

@Destination(navArgsDelegate = DashboardScreenNavArgs::class)
@Composable
fun DashboardScreen(
    navigator: DestinationsNavigator,
    mainViewModel: MainViewModel = activityViewModel(),
    viewModel: DashboardViewModel = hiltViewModel()
) {

    DashboardView(
        viewModel.state
    )
}

@Composable
fun DashboardView(
    state: DashboardState
){
    ScreenBody(modifier = Modifier.fillMaxSize()) {
        Center() {
            Text(
                text = stringResource(id = R.string.welcome, state.user.name)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun DashboardPreview(){
    DashboardView(
        DashboardState(user = User("Test User", "test@email.com", "https://picsum.photos/200/200?random=11"))
    )
}