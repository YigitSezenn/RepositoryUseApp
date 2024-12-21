package com.example.jetpackcomposeegitim.ui.notes.usecase

import com.example.jetpackcomposeegitim.ui.notes.NoteModel
import com.example.jetpackcomposeegitim.ui.notes.NotesRepository
import javax.inject.Inject

class AddNotesUseCase @Inject constructor(private val notesRepository: NotesRepository) {
    suspend operator fun invoke(note: NoteModel) = notesRepository.addNotes(note)
}