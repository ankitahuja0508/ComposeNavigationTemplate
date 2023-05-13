package com.aexyn.compose.navigation.template.extensions

import com.aexyn.compose.navigation.template.ui.dashboard.User
import com.aexyn.compose.navigation.template.ui.destinations.DashboardScreenDestination
import com.aexyn.compose.navigation.template.ui.destinations.IntroScreenDestination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

fun DestinationsNavigator.offToDashboard(user:User){
    this.navigate(DashboardScreenDestination(user), builder = {
        this.popUpTo(route = IntroScreenDestination.route, popUpToBuilder = {
            this.inclusive = true
        })
    })
}