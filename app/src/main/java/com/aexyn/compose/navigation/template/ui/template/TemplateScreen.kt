package com.aexyn.compose.navigation.template.ui.template

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.aexyn.compose.navigation.template.MainViewModel
import com.aexyn.compose.navigation.template.components.ScreenBody
import com.aexyn.compose.navigation.template.extensions.activityViewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun TemplateScreen(
    navigator: DestinationsNavigator,
    mainViewModel: MainViewModel = activityViewModel(),
    viewModel: TemplateViewModel = hiltViewModel()
) {
    TemplateView()
}

@Composable
fun TemplateView(
){
    ScreenBody(modifier = Modifier.fillMaxSize()) {
    }
}

@Composable
@Preview(showBackground = true)
fun TemplatePreview(){
    TemplateView()
}