package com.example.scrubsup.ui

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.scrubsup.TopAppBar
import com.example.scrubsup.ui.theme.ScrubsUpTheme

@Composable
fun ModelScreen3D(title:String,html: String){

    Column{
        TopAppBar(title)
        WebViewScreen(html)
    }
}

@Composable
fun WebViewScreen(html: String) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
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
    }
}