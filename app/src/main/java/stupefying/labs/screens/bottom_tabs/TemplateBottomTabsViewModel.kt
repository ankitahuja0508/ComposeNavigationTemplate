package stupefying.labs.screens.bottom_tabs

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.DefaultLifecycleObserver
import stupefying.labs.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

data class TemplateBottomTabsState(
    val isLoading : Boolean = false
)

@HiltViewModel
class TemplateBottomTabsViewModel @Inject constructor(
    app: Application,
) : BaseViewModel(app), DefaultLifecycleObserver {

    var state by mutableStateOf(TemplateBottomTabsState())
        private set
}