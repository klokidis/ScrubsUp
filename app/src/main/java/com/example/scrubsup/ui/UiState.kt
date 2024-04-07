package com.example.scrubsup.ui

import androidx.annotation.StringRes
import com.example.scrubsup.R
import com.example.scrubsup.model.Models
import com.example.scrubsup.data.Datasource

data class UiState(
    @StringRes val titleBar: Int = R.string.top_bar,
    val card: Models = Datasource().loadOneHtml()
)