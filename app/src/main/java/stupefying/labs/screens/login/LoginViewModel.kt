package stupefying.labs.screens.login

import android.app.Application
import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.DefaultLifecycleObserver
import dagger.hilt.android.lifecycle.HiltViewModel
import stupefying.labs.base.BaseViewModel
import stupefying.labs.extensions.saveModel
import stupefying.labs.screens.dashboard.User
import javax.inject.Inject

data class LoginState(
    val isLoading: Boolean = false,
)
@HiltViewModel
class LoginViewModel @Inject constructor(
    app: Application,
    private val sharedPreferences: SharedPreferences,
) : BaseViewModel(app), DefaultLifecycleObserver {

    var state by mutableStateOf(LoginState())
        private set

    fun login(){
        sharedPreferences.saveModel("USER_KEY", User("Test User", "test@email.com", "https://picsum.photos/200/200?random=11"))
    }
}