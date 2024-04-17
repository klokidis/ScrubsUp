package com.example.scrubsup.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Quiz(
    @StringRes val question: Int,
    @DrawableRes val imageResourceId: Int,
    val answers: List<Pair<Int, Boolean>>,
    @StringRes val subject: Int,
)
