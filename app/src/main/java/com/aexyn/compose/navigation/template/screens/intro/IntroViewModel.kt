package com.aexyn.compose.navigation.template.screens.intro

import android.app.Application
import androidx.lifecycle.DefaultLifecycleObserver
import com.aexyn.compose.navigation.template.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class IntroViewModel @Inject constructor(
    app: Application,
) : BaseViewModel(app), DefaultLifecycleObserver {
}