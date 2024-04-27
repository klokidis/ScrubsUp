package com.example.scrubsup.ui.test

import com.example.scrubsup.ui.ViewModel
import junit.framework.TestCase.assertEquals
import org.junit.Test
import com.example.scrubsup.R
import com.example.scrubsup.data.Datasource
import com.example.scrubsup.model.Cards
import com.example.scrubsup.model.Models
import junit.framework.TestCase.assertTrue

class ViewModelTest {

    private val viewModel = ViewModel()

    @Test
    fun viewModel_CorrectAnswerGuessed_ScoreUpdated()  {
        viewModel.chooseQuizTheme(R.string.neurology)
        viewModel.checkUserGuess(true)
        val currentUiState = viewModel.uiState.value
        assertEquals(1, currentUiState.answerCount)
        assertEquals(1, currentUiState.rightAnswerCount)
    }
    @Test
    fun viewModel_IncorrectGuess_ErrorFlagSet() {
        viewModel.chooseQuizTheme(R.string.neurology)
        viewModel.checkUserGuess(false)
        val currentUiState = viewModel.uiState.value
        assertEquals(1, currentUiState.answerCount)
        assertEquals(0, currentUiState.rightAnswerCount)
    }

    @Test
    fun viewModel_Initialization_Quiz() {
        val uiState = viewModel.uiState.value

        assertTrue(!uiState.isOver)
        assertTrue(uiState.answerCount == 0)
        assertTrue(uiState.rightAnswerCount == 0)
    }

    @Test
    fun viewModel_Initialization_Cards() {
        val uiState = viewModel.uiState.value

        assertTrue(uiState.isQuestionShown)
        assertTrue(uiState.currentIndex == 0)
    }

    @Test
    fun viewModel_ShowAnswer_BooleanUpdated() {
        viewModel.changeVisibilityCards()
        var uiState = viewModel.uiState.value
        assertTrue(!uiState.isQuestionShown)

        viewModel.changeVisibilityCards()
        uiState = viewModel.uiState.value
        assertTrue(uiState.isQuestionShown)
    }

    @Test
    fun viewModel_NextCard_IndexUpdated() {
        var uiState = viewModel.uiState.value
        assertEquals(uiState.currentIndex,0)

        viewModel.onNextCard()
        uiState = viewModel.uiState.value
        assertEquals(uiState.currentIndex,1)

        viewModel.onPreviousCard()
        uiState = viewModel.uiState.value
        assertEquals(uiState.currentIndex,0)
    }

    @Test
    fun viewModel_ChooseCardTheme_UiStateUpdatedCorrectly() {
        val expectedMemoryCards: List<Cards> = Datasource().loadCardQuestions().filter { it.subject == R.string.Arterial_vessel }
        viewModel.chooseCardTheme(R.string.Arterial_vessel)

        val currentUiState = viewModel.uiState.value
        assertEquals(expectedMemoryCards, currentUiState.memoryCards)
    }

    @Test
    fun viewModel_ChooseModel3dTheme_UiStateUpdatedCorrectly() {
        val expectedModel = Models(
            R.string.Arterial_vessel,
            R.drawable.blood,
            "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Arterial vessel tour\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\"  src=\"https://sketchfab.com/models/246576050a644cb4ae16840922385e39/embed?autostart=1&annotations_visible=1&ui_theme=dark\"> </iframe> </div></body></html>",
            listOf(
                Pair(R.string.rbc, R.string.rbc_details),
                Pair(R.string.wbc, R.string.wbc_details),
                Pair(R.string.arteriole_wall, R.string.arteriole_wall_details)
            ))
        val name = expectedModel.stringResourceId
        val imageModel = expectedModel.imageResourceId
        val html = expectedModel.htmlString
        val details:List<Pair<Int, Int>> = expectedModel.details
        viewModel.updateModel(name, imageModel, html, details)

        val currentUiState = viewModel.uiState.value
        assertEquals(expectedModel, currentUiState.card)
    }

    @Test
    fun viewModel_AllAnswersGuessed_UiStateUpdatedCorrectly() {
        var expectedScore = 0
        viewModel.chooseQuizTheme(R.string.neurology)
        var currentUiState = viewModel.uiState.value
        repeat(5) {
            expectedScore += 1
            viewModel.checkUserGuess(true)
            currentUiState = viewModel.uiState.value
            // Assert that after each correct answer, score is updated correctly.
            assertEquals(expectedScore, currentUiState.rightAnswerCount)
        }
        // Assert that after all questions are answered, the current word count is up-to-date.
        assertEquals(5, currentUiState.rightAnswerCount)
        // Assert that after 5 questions are answered, the game is over.
        assertTrue(currentUiState.isOver)
    }

}