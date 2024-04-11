package com.example.scrubsup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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