package com.aexyn.compose.navigation.template

import android.app.Application
import android.content.SharedPreferences
import com.aexyn.compose.navigation.template.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    app: Application,
    private val sharedPreferences: SharedPreferences,
) : BaseViewModel(app) {
}