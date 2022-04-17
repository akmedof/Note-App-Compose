package com.aslan.notecompose.data.repositories

import com.aslan.notecompose.data.NoteDao
import com.aslan.notecompose.data.model.Note
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class NoteRepository @Inject constructor(
    private val dao: NoteDao
) {

    val getAllNote: Flow<List<Note>> = dao.getAllNote()
    val sortByLowPriority: Flow<List<Note>> = dao.sortByLowPriority()
    val sortByHighPriority: Flow<List<Note>> = dao.sortByHIGHPriority()

    fun getSelectNote(idNote: Int): Flow<Note>{
        return dao.getSelectNote(idNote = idNote)
    }

    suspend fun addNote(not: Note){
        dao.addNote(not)
    }

    suspend fun updateNote(note: Note){
        dao.updateNote(note)
    }

    suspend fun deleteNote(note: Note){
        dao.deleteNote(note)
    }

    suspend fun deleteAllNote(){
        dao.deleteAllNote()
    }

    fun searchDatabase(searchQuery: String): Flow<List<Note>>{
        return dao.searchDatabase(searchQuery = searchQuery)
    }

}