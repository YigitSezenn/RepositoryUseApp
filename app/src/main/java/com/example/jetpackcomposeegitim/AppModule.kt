package com.example.jetpackcomposeegitim

import android.content.Context
import androidx.room.Room
import com.example.jetpackcomposeegitim.ui.notes.NotesDao
import com.example.jetpackcomposeegitim.ui.notes.NotesDatabase
import com.example.jetpackcomposeegitim.ui.users.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideANoteDatabase(@ApplicationContext context: Context) : NotesDatabase {
        return Room.databaseBuilder(
            context,
            NotesDatabase::class.java,
            "notes_database"
        ).fallbackToDestructiveMigration().build()
    }

    @Provides
    @Singleton
    fun provideNotesDao(database: NotesDatabase): NotesDao {
        return database.notesDao()
    }

    @Provides
    fun provideUserRepository(): UserRepository {
        return UserRepository()
    }
}