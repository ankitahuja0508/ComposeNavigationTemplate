package com.aexyn.compose.navigation.template.screens.login

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun LoginScreen(
    navigator: DestinationsNavigator,
    mainViewModel: MainViewModel = activityViewModel(),
    viewModel: LoginViewModel = hiltViewModel()
) {

    LoginView(
        login = {
            viewModel.login()
            navigator.offToDashboard(mainViewModel.getUser())
        }
    )
}

@Composable
fun LoginView(
    login:()->Unit,
){
    ScreenBody(modifier = Modifier.fillMaxSize()) {
        Center() {

            Text(
                text = stringResource(id = R.string.login_text),
                textAlign = TextAlign.Center
            )

            VerticalSpacing(height = 12.dp)

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = login
            ) {
                Text(
                    text = stringResource(id = R.string.login)
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun LoginPreview(){
    LoginView(login={})
}