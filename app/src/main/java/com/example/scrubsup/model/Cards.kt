package com.example.scrubsup.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Cards (
    @StringRes val question: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val answers: Int,
    @StringRes val subject: Int,
)