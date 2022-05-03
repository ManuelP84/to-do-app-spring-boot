package com.sofkau.todoapp.controller;


import com.sofkau.todoapp.entity.Note;
import com.sofkau.todoapp.service.NoteServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:3000/")
public class NoteController {

    /**
     * NoteService injection
     * */
    @Autowired
    private NoteServie servie;

    @GetMapping("get/notes")
    public List<Note> getAllNotes(){
        return servie.getNotes();
    }

    @PostMapping("save/note")
    public Note saveNote(@RequestBody Note note){
        return servie.saveNote(note);
    }

    @PutMapping("update/note")
    public Note updateNote(@RequestBody Note note){
        return servie.updateNote(note);
    }

    @DeleteMapping("delete/note/{id}")
    public void deleteNote(@PathVariable Long id){
        servie.deleteNote(id);
    }
}
