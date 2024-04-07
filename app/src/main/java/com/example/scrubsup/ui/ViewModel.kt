package com.example.scrubsup.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import com.example.scrubsup.data.Datasource
import com.example.scrubsup.model.Models
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    private val cardList: List<Models> = Datasource().loadModels3D()

    fun loadModels(): List<Models> {
        return cardList
    }
}