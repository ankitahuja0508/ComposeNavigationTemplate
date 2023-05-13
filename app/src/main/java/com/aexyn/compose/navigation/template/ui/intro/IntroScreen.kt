package com.aexyn.compose.navigation.template.ui.intro

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.aexyn.compose.navigation.template.MainViewModel
import com.aexyn.compose.navigation.template.R
import com.aexyn.compose.navigation.template.components.Center
import com.aexyn.compose.navigation.template.components.ScreenBody
import com.aexyn.compose.navigation.template.components.VerticalSpacing
import com.aexyn.compose.navigation.template.extensions.activityViewModel
import com.aexyn.compose.navigation.template.extensions.offToDashboard
import com.aexyn.compose.navigation.template.ui.destinations.LoginScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination(start = true)
@Composable
fun IntroScreen(
    navigator: DestinationsNavigator,
    mainViewModel: MainViewModel = activityViewModel(),
    viewModel: IntroViewModel = hiltViewModel()
) {

    LaunchedEffect(key1 = mainViewModel.state.loggedInUser) {
        if(mainViewModel.state.loggedInUser.name.isNotEmpty()){
            navigator.offToDashboard(
                mainViewModel.state.loggedInUser
            )
        }
    }

    IntroView(
        login = {
            navigator.navigate(LoginScreenDestination())
        }
    )
}

@Composable
fun IntroView(
    login:()->Unit,
){
    ScreenBody(modifier = Modifier.fillMaxSize()) {
        Center() {

            Column {

                Text(
                    text = stringResource(id = R.string.intro_text),
                    textAlign = TextAlign.Center
                )

                VerticalSpacing(height = 12.dp)

                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = login
                ) {
                    Text(
                        text = stringResource(id = R.string.btn_continue)
                    )
                }
            }


        }
    }
}

@Composable
@Preview(showBackground = true)
fun IntroPreview(){
    IntroView(login={})
}