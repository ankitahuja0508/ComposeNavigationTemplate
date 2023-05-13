package com.aexyn.compose.navigation.template.ui.template

import android.app.Application
import androidx.lifecycle.DefaultLifecycleObserver
import com.aexyn.compose.navigation.template.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TemplateViewModel @Inject constructor(
    app: Application,
) : BaseViewModel(app), DefaultLifecycleObserver {}