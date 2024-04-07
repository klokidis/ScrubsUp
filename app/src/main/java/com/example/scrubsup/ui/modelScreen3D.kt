package com.example.scrubsup.ui

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.scrubsup.R
import com.example.scrubsup.ui.theme.ScrubsUpTheme

@Composable
fun ModelScreen3D(
    viewModel : ViewModel = ViewModel()
){
    val uiState by viewModel.uiState.collectAsState()

    Column{
        TopAppBar(LocalContext.current.getString(uiState.card.stringResourceId))
        WebViewScreen(uiState.card.htmlString)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(text: String, modifier: Modifier = Modifier) {
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

@Composable
fun WebViewScreen(html: String) {
    AndroidView(
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                webViewClient = WebViewClient()
                settings.domStorageEnabled = true
            }
        },
        update = { webView -> //CHANGE THIS TO LOAD FROM DATA
            webView.loadDataWithBaseURL(
                null,
                html,
                "text/html",
                "UTF-8",
                null
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun ModelPreview() {
    ScrubsUpTheme {
        ModelScreen3D()
    }
}