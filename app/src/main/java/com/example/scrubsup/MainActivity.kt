package com.example.scrubsup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.scrubsup.ui.theme.ScrubsUpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            ScrubsUpTheme {
                ScrubsUpApp()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ModelPreview() {
    ScrubsUpTheme {
        ScrubsUpApp()
    }
}