package com.aexyn.compose.navigation.template.extensions

import com.aexyn.compose.navigation.template.screens.dashboard.User
import com.aexyn.compose.navigation.template.screens.destinations.DashboardScreenDestination
import com.aexyn.compose.navigation.template.screens.destinations.IntroScreenDestination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

fun DestinationsNavigator.offToDashboard(user: User){
    this.navigate(DashboardScreenDestination(user), builder = {
        this.popUpTo(route = IntroScreenDestination.route, popUpToBuilder = {
            this.inclusive = true
        })
    })
}