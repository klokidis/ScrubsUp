package com.example.scrubsup.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import com.example.scrubsup.data.Datasource
import com.example.scrubsup.model.Models
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    private val cardList3D: List<Models> = Datasource().loadModels3D()

    var html by mutableStateOf("")
        private set

    fun updateHtml(htmlPressed: String){
        html = htmlPressed
    }

    fun loadModels(name: Int): List<Models> {
        return cardList3D
    }
    fun updateModel(nameFromR: Int,image: Int,html:String){
        _uiState.update { currentState ->
            currentState.copy(
                card = Models(nameFromR,image,html)
            )
        }
    }
}