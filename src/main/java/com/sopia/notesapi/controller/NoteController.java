package com.sopia.notesapi.controller;


import com.sopia.notesapi.exception.ResourceNotFoundException;
import com.sopia.notesapi.model.Note;
import com.sopia.notesapi.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController // this is a combination of Spring’s @Controller and @ResponseBody annotations
@RequestMapping("/api") //declares that the url for all the apis in this controller will start with /api
public class NoteController {


    @Autowired
    NoteRepository noteRepository;

    // Get All Notes
    @RequestMapping(value = "/notes", method = RequestMethod.GET)
    public List<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    // Create a new Note
    @RequestMapping(value = "/notes", method = RequestMethod.POST)
    public Note createNotes(@Valid  @RequestBody Note note){
        return noteRepository.save(note);
    }

    // Get a Single Note
    @RequestMapping(value = "/notes/{id}", method =RequestMethod.GET)
    public Note getNoteById(@PathVariable("id") Long noteId ){
        return noteRepository.findById(noteId).orElseThrow(()-> new ResourceNotFoundException("Note","id",noteId));
    }


    // Update a Note
    @RequestMapping(value = "/notes/{id}", method = RequestMethod.PUT)
    public Note updateNote(@PathVariable(value = "id") Long noteId,
                           @Valid @RequestBody Note noteDetails) {

        Note note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

        note.setTitle(noteDetails.getTitle());
        note.setContent(noteDetails.getContent());

        Note updatedNote = noteRepository.save(note);
        return updatedNote;
    }
    // Delete a Note
    @RequestMapping(value = "/notes/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long noteId) {
        Note note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

        noteRepository.delete(note);

        return ResponseEntity.ok().build();
    }
}
