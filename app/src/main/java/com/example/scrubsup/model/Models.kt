package com.example.scrubsup.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Models(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    val htmlString: String,
    val details:List<Pair<Int, Int>>
)
