package com.example.scrubsup.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StartingScreen(
    onButtonModels: () -> Unit,
    ){
    Column(modifier = Modifier.padding(10.dp)){
        Button(modifier = Modifier.padding(10.dp),onClick = onButtonModels ) {
            Text(text = "models")
        }
        Button(modifier = Modifier.padding(10.dp),onClick = { /*TODO*/ }) {

        }
    }
}
