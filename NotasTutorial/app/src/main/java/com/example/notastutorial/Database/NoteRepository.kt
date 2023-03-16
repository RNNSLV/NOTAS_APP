package com.example.notastutorial.Database

import androidx.lifecycle.LiveData
import com.example.notastutorial.Models.Note

class NoteRepository(private val noteDao: NoteDao ) {

    val allNote : LiveData<List<Note>> = noteDao.getAllNotes()

    suspend fun insert (note: Note){
        noteDao.insert(note)
    }
    suspend fun delete(note: Note){
        noteDao.delete(note)
    }
    suspend fun update(note: Note){
        noteDao.update(note.id,note.title,note.note)
    }

}