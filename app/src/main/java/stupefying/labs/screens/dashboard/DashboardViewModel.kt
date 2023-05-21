package stupefying.labs.screens.dashboard

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.SavedStateHandle
import stupefying.labs.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import stupefying.labs.screens.destinations.DashboardScreenDestination
import javax.inject.Inject

data class DashboardState(
    val isLoading : Boolean = false,
    val user: User = User(),
)

@HiltViewModel
class DashboardViewModel @Inject constructor(
    app: Application,
    savedStateHandle: SavedStateHandle,
    ) : BaseViewModel(app), DefaultLifecycleObserver {

    var state by mutableStateOf(DashboardState())
        private set

    // this is only to demonstrate the arguments via Destinations library. You can always fetch user from sharedpref
    private val args = DashboardScreenDestination.argsFrom(savedStateHandle)

    init {
        state = state.copy(user = args.user)
    }
}