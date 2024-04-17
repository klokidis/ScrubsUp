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
import com.example.scrubsup.model.Quiz


class ViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    private var subject: Int = 0
    private var questionsThemed: List<Quiz> = Datasource().loadQuestions()

    init {
        resetGame()
    }

    fun resetGame() {
        _uiState.value = UiState(answerCount = 0, rightAnswerCount = 0, questions = Datasource().loadQuestions().filter { it.subject ==  subject })
    }

    fun chooseQuizTheme(cardSubject: Int){
        subject = cardSubject
        _uiState.update { currentState ->
            questionsThemed = questionsThemed.filter { it.subject == cardSubject }
            currentState.copy(questions = questionsThemed)
        }
        updateQuestion()
    }

    private fun updateQuestion(){
        _uiState.update { currentState ->
            currentState.copy(question = questionsThemed[_uiState.value.answerCount])
        }
    }

    fun checkUserGuess(userGuess:Boolean) {
        val updatedScore = _uiState.value.answerCount.plus(1)
        if (userGuess) {
            _uiState.value.rightAnswerCount.plus(1)
        }
        updateGameState(updatedScore)
    }

    private fun updateGameState(updatedScore: Int) {
        if (updatedScore == Datasource().MAX_QUESTIONS){

        } else{

        }
        updateQuestion()
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