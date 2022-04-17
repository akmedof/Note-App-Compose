package com.aslan.notecompose.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aslan.notecompose.data.model.Note
import com.aslan.notecompose.data.repositories.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(
    private val repository: NoteRepository
): ViewModel() {

    private val _allNote = MutableStateFlow<List<Note>>(emptyList())
    val allNote: StateFlow<List<Note>> = _allNote

    fun getAllNote(){
        viewModelScope.launch {
            repository.getAllNote.collect { note ->
                _allNote.value = note
            }
        }
    }


}