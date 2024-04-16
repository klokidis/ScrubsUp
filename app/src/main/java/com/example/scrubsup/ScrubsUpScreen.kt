package com.example.scrubsup

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.scrubsup.ui.ChooseList
import com.example.scrubsup.ui.ModelScreen3D
import com.example.scrubsup.ui.StartingScreen
import com.example.scrubsup.ui.ViewModel

enum class ScrubScreen(@StringRes var title: Int) {
    Start(title = R.string.app_name),
    Choose(title = R.string.previous_button),
    Model3D(title = R.string.human_heart),
    Quiz(title = R.string.quiz),
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    currentScreen: ScrubScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.previous_button)
                    )
                }
            }
        },
        title = {
            Text(stringResource(currentScreen.title),
                style = MaterialTheme.typography.titleLarge
            )
        },
        modifier = modifier
    )
}
@Composable
fun ScrubsUpApp(
    viewModel: ViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
){
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = ScrubScreen.valueOf(
        backStackEntry?.destination?.route ?: ScrubScreen.Start.name
    )
    Scaffold(
        topBar = {
            TopAppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() }
            )
        }
    ){ innerPadding ->
        val uiState by viewModel.uiState.collectAsState()

        NavHost(
            navController = navController,
            startDestination = ScrubScreen.Start.name,
            modifier = Modifier.padding(innerPadding)
        ){
            composable(route = ScrubScreen.Start.name) {
                StartingScreen(
                    onButtonModels = { navController.navigate(ScrubScreen.Choose.name) },
                )
            }
            composable(route = ScrubScreen.Choose.name) {
                ChooseList(
                    onButtonCard = {
                        viewModel.updateModel(it.stringResourceId,it.imageResourceId,it.htmlString,it.details)
                        navController.navigate(ScrubScreen.Model3D.name)
                        ScrubScreen.Model3D.title = it.stringResourceId
                    }
                )
            }
            composable(route = ScrubScreen.Model3D.name) {
                ModelScreen3D(
                   uiState.card.htmlString,uiState.card.details
                )
            }
        }
    }
}


