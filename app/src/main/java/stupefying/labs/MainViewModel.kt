package stupefying.labs

import android.app.Application
import android.content.SharedPreferences
import stupefying.labs.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    app: Application,
    private val sharedPreferences: SharedPreferences,
) : BaseViewModel(app) {
}