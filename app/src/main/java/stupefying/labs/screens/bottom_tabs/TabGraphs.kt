package stupefying.labs.screens.bottom_tabs

import com.ramcosta.composedestinations.annotation.NavGraph

@NavGraph
annotation class BottomTabsNavGraph(
    val start: Boolean = false
)
@BottomTabsNavGraph(start = true)
@NavGraph
annotation class FirstTabNavGraph(
    val start: Boolean = false
)

@BottomTabsNavGraph
@NavGraph
annotation class SecondTabNavGraph(
    val start: Boolean = false
)