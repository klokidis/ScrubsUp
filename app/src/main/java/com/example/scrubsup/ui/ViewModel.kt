package com.example.scrubsup.ui

import androidx.lifecycle.ViewModel
import com.example.scrubsup.R
import kotlinx.coroutines.flow.MutableStateFlow
import com.example.scrubsup.model.Models
import com.example.scrubsup.model.TabItem
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

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