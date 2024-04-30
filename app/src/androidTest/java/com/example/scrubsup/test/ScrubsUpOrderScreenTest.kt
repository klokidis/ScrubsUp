package com.example.scrubsup.test

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.example.scrubsup.model.Quiz
import com.example.scrubsup.ui.QuizScreen
import com.example.scrubsup.R
import org.junit.Rule
import org.junit.Test

class ScrubsUpOrderScreenTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()
    @Test
    fun selectOptionScreen_verifyContent() {

        val answers =  listOf(
            Pair(R.string.brain1_1,false),
            Pair(R.string.brain1_2,false),
            Pair(R.string.brain1_3,true),
            Pair(R.string.brain1_4,false),
        )

        composeTestRule.setContent {
            QuizScreen(
                question =  Quiz(
                    R.string.brain1,
                    R.drawable.brain1,
                    listOf(
                        Pair(R.string.brain1_1,false),
                        Pair(R.string.brain1_2,false),
                        Pair(R.string.brain1_3,true),
                        Pair(R.string.brain1_4,false),
                    ),
                    R.string.neurology
                ),
                answerCount = 0,
                correctAnswerCount = 0,
                onButtonClicked = {

                },
                isOver = false,
                goBack = {

                },
                onPlayAgain = {

                }
            )
        }

        // Then all the options are displayed on the screen.
        answers.forEach { answer ->
            composeTestRule.onNodeWithStringId(answer.first).assertIsDisplayed()
        }

        // And then the next button is disabled
        composeTestRule.onNodeWithStringId(R.string.next).assertIsNotEnabled()
    }
}