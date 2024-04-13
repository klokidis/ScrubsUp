package com.example.scrubsup

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.scrubsup.ui.theme.ScrubsUpTheme
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.scrubsup.data.Datasource
import com.example.scrubsup.ui.ChooseList
import com.example.scrubsup.ui.ModelScreen3D
import com.example.scrubsup.ui.StartingScreen
import com.example.scrubsup.ui.ViewModel

enum class ScrubScreen {
    Start,
    Choose,
    Model3D
}

@Composable
fun ScrubsUpApp(
    viewModel: ViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
){
        val uiState by viewModel.uiState.collectAsState()

        NavHost(
            navController = navController,
            startDestination = ScrubScreen.Start.name,
        ){
            composable(route = ScrubScreen.Start.name) {
                StartingScreen(
                    onButtonModels = { navController.navigate(ScrubScreen.Choose.name) },
                )
            }
            composable(route = ScrubScreen.Choose.name) {
              ChooseList(
                  onButtonCard = {
                      viewModel.updateModel(it.stringResourceId,it.imageResourceId,it.htmlString)
                      navController.navigate(ScrubScreen.Model3D.name)
                  }
              )
            }
            composable(route = ScrubScreen.Model3D.name) {
                ModelScreen3D(LocalContext.current.getString(uiState.card.stringResourceId),uiState.card.htmlString)
            }
        }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    text: String,
    modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        navigationIcon = {
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.prev),
                    contentDescription = LocalContext.current.getString(R.string.previous_button),
                    modifier = Modifier.fillMaxSize()
                )
            }
        },
        title = {
            Text(
                text = text,
                style = MaterialTheme.typography.titleLarge
            )
        },
        modifier = modifier
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ScrubsUpTheme {
    }
}