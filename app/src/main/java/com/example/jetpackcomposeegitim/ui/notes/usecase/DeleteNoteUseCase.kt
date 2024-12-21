package com.example.jetpackcomposeegitim.ui.notes.usecase

import com.example.jetpackcomposeegitim.ui.notes.NotesRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(private val notesRepository: NotesRepository) {
    suspend operator fun invoke(id: Int) = notesRepository.deleteNote(id)
}