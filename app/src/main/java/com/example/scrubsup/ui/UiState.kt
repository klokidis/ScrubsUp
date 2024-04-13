package com.example.scrubsup.ui

import androidx.annotation.StringRes
import com.example.scrubsup.R
import com.example.scrubsup.model.Models

data class UiState(
    @StringRes val titleBar: Int = R.string.top_bar,
    val card: Models = Models(0,0,"",listOf())
)