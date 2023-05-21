package stupefying.labs.extensions


import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import stupefying.labs.screens.dashboard.User
import stupefying.labs.screens.destinations.DashboardScreenDestination
import stupefying.labs.screens.destinations.IntroScreenDestination

fun DestinationsNavigator.offToDashboard(user: User){
    this.navigate(DashboardScreenDestination(user), builder = {
        this.popUpTo(route = IntroScreenDestination.route, popUpToBuilder = {
            this.inclusive = true
        })
    })
}