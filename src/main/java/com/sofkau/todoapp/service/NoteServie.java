package com.sofkau.todoapp.service;

import com.sofkau.todoapp.entity.Note;

import java.util.List;

public interface NoteServie {

    List<Note> getNotes();

    Note saveNote(Note note);

    Note updateNote(Note note);

    void deleteNote(Long id);
}
