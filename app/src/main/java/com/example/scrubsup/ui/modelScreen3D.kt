@file:OptIn(ExperimentalFoundationApi::class)

package com.example.scrubsup.ui

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.scrubsup.R
import com.example.scrubsup.TopAppBar
import com.example.scrubsup.ui.theme.ScrubsUpTheme

@Composable
fun ModelScreen3D(title: String, html: String, details: List<Pair<Int, Int>>){
    Column{
        TopAppBar(title)
        TabRowBar(html,details)
    }
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
        update = { webView ->
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

@Composable
fun TabRowBar(html: String, details: List<Pair<Int, Int>>){
    var selectedTabIndex by rememberSaveable {
        mutableIntStateOf(0)
    }
    val pagerState = rememberPagerState {
        ViewModel().tabItems.size
    }
    LaunchedEffect(selectedTabIndex){
        pagerState.animateScrollToPage(selectedTabIndex)
    }
    LaunchedEffect(pagerState.currentPage,pagerState.isScrollInProgress) {
        if(!pagerState.isScrollInProgress){
            selectedTabIndex = pagerState.currentPage
        }
    }
    Column {
        TabRow(selectedTabIndex = selectedTabIndex) {
            ViewModel().tabItems.forEachIndexed {index, item ->
                Tab(
                    selected = index==selectedTabIndex,
                    onClick = {
                        selectedTabIndex = index
                    },
                    text = {
                        Text(text = LocalContext.current.getString(item.title))
                    }
                )
            }
        }
        HorizontalPager(
            state = pagerState,
            userScrollEnabled = false,
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {index ->
            Box(
                contentAlignment = Alignment.TopStart,
            ){
                if(index==0){
                    WebViewScreen(html)
                }else{
                    DetailsPage(details)
                }
            }

        }
    }
}

@Composable
fun DetailsPage(details:List<Pair<Int, Int>>){
    LazyColumn(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.fillMaxSize()
    ){
        items(details) { detail ->
            Column(
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_large))
            ){
                Text(text = detail.first.toString())
                Text(text = detail.second.toString())
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ModelPreview() {
    ScrubsUpTheme {

    }
}