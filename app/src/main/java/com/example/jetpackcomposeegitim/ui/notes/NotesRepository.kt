package com.example.jetpackcomposeegitim.ui.notes

import javax.inject.Inject

class NotesRepository @Inject constructor(private val notesDao: NotesDao) {

    suspend fun getAllNotes() : List<NoteModel> = notesDao.getAllNotes()

    suspend fun addNotes(noteModel: NoteModel) {
        notesDao.addNote(noteModel)
    }

    suspend fun deleteNote(id: Int) {
        notesDao.deleteNote(id)
    }

    suspend fun updateNotes(noteModel: NoteModel) {
        notesDao.updateNote(noteModel)
    }
}