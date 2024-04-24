package com.example.scrubsup.ui

import androidx.lifecycle.ViewModel
import com.example.scrubsup.R
import kotlinx.coroutines.flow.MutableStateFlow
import com.example.scrubsup.model.Models
import com.example.scrubsup.model.TabItem
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import com.example.scrubsup.data.Datasource
import com.example.scrubsup.model.Cards
import com.example.scrubsup.model.Quiz


class ViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    private var subject: Int = 0
    private var questions: List<Quiz> = Datasource().loadQuestions()
    private var cardQuestions: List<Cards> = Datasource().loadCardQuestions()

    init {
        resetGame()
        resetCards()
    }

    fun resetGame() {
        _uiState.update { currentState ->
            currentState.copy(
                answerCount = 0,
                isOver = false,
                rightAnswerCount = 0,
            )
        }
        updateQuestion()
    }

    fun resetCards() {
        _uiState.update { currentState ->
            currentState.copy(
                isQuestionShown = true,
                currentIndex = 0
            )
        }
    }

    fun chooseQuizTheme(cardSubject: Int){
        _uiState.update { currentState ->
            currentState.copy(
                answerCount = 0,
                isOver = false,
                rightAnswerCount = 0,
                questions = questions.filter { it.subject == cardSubject },
            )
        }
        updateQuestion()
    }

    fun chooseCardTheme(cardSubject: Int){
        _uiState.update { currentState ->
            currentState.copy(
                isQuestionShown = false,
                currentIndex = 0,
                memoryCards = cardQuestions.filter { it.subject == cardSubject },
            )
        }
    }

    fun changeVisibilityCards() {
        _uiState.update { currentState ->
            currentState.copy(isQuestionShown = !_uiState.value.isQuestionShown)
        }
    }

    fun onNextCard() {
        _uiState.update { currentState ->
            currentState.copy(currentIndex = _uiState.value.currentIndex.plus(1),
                isQuestionShown = true)
        }
    }

    fun onPreviousCard() {
        _uiState.update { currentState ->
            currentState.copy(currentIndex = _uiState.value.currentIndex.minus(1),
                isQuestionShown = true)
        }
    }

    private fun updateQuestion(){
        _uiState.update { currentState ->
            currentState.copy(question = _uiState.value.questions[_uiState.value.answerCount])
        }
    }

    fun checkUserGuess(userGuess:Boolean) {
        val updatedScore = _uiState.value.answerCount.plus(1)
        var rightAnswersUpdated = _uiState.value.rightAnswerCount
        if (userGuess) {
            rightAnswersUpdated = _uiState.value.rightAnswerCount.plus(1)
        }

        updateGameState(updatedScore,rightAnswersUpdated)
    }

    private fun updateGameState(updatedScore: Int,rightAnswersUpdated: Int) {
        if (updatedScore == Datasource().MAX_QUESTIONS){
            _uiState.update { currentState ->
                currentState.copy(
                    answerCount = updatedScore,
                    rightAnswerCount = rightAnswersUpdated,
                    isOver = true
                )
            }
        } else{
            _uiState.update { currentState ->
                currentState.copy(
                    answerCount = updatedScore,
                    rightAnswerCount = rightAnswersUpdated
                )
            }
            updateQuestion()
        }

    }

    fun updateModel(nameFromR: Int,image: Int,html:String,details:List<Pair<Int, Int>>){
        _uiState.update { currentState ->
            currentState.copy(
                card = Models(nameFromR,image,html,details)
            )
        }
    }
    val tabItems = listOf(
        TabItem(
            title = R.string.model_3d_one
        ),
        TabItem(
            title = R.string.details
        ),
    )
}