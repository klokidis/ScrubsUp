package com.example.scrubsup.ui

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.scrubsup.data.Datasource
import com.example.scrubsup.model.Models
import com.example.scrubsup.ui.theme.ScrubsUpTheme

@Composable
fun Screen3D(name: Int, model3D:Models){
    Column{
        TopAppBar(LocalContext.current.getString(name))
        WebViewScreen(model3D.htmlString)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(Text: String,modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = Text,
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
fun modelPreview() {
    ScrubsUpTheme {
        Screen3D(Datasource().loadOneHtml().stringResourceId,Datasource().loadOneHtml())
    }
}