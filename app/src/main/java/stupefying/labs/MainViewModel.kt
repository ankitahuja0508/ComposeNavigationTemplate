package stupefying.labs

import android.app.Application
import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import stupefying.labs.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import stupefying.labs.extensions.getUser
import stupefying.labs.screens.dashboard.User
import javax.inject.Inject


data class MainViewState(
    val loggedInUser: User = User()
)

@HiltViewModel
class MainViewModel @Inject constructor(
    app: Application,
    private val sharedPreferences: SharedPreferences,
) : BaseViewModel(app) {

    var state by mutableStateOf(MainViewState())
        private set
    init {
        state = state.copy(
            loggedInUser = sharedPreferences.getUser(),
        )
    }

    fun getUser(): User {
        return sharedPreferences.getUser()
    }
}