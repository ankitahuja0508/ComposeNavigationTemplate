package com.aexyn.compose.navigation.template.screens.login

import android.app.Application
import android.content.SharedPreferences
import androidx.lifecycle.DefaultLifecycleObserver
import com.aexyn.compose.navigation.template.base.BaseViewModel
import com.aexyn.compose.navigation.template.extensions.saveModel
import com.aexyn.compose.navigation.template.screens.dashboard.User
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    app: Application,
    private val sharedPreferences: SharedPreferences,
    ) : BaseViewModel(app), DefaultLifecycleObserver {

    fun login(){
        sharedPreferences.saveModel("USER_KEY", User("Test User", "test@email.com", "https://picsum.photos/200/200?random=11"))
    }
}