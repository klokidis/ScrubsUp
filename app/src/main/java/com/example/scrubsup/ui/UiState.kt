package com.example.scrubsup.ui

import androidx.annotation.StringRes
import com.example.scrubsup.R
import com.example.scrubsup.model.Models
import com.example.scrubsup.model.Quiz

data class UiState(
    @StringRes val titleBar: Int = R.string.top_bar,
    val card: Models = Models(0,0,"",listOf()),

    val answerCount: Int = 0,
    val isOver:Boolean = false,
    val rightAnswerCount: Int = 0,
    val questions: List<Quiz> = listOf(Quiz(0, 0, listOf(),0)),
    val question: Quiz = Quiz(0, 0, listOf(),0)
)