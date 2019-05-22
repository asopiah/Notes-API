package controller;


import exception.ResourceNotFoundException;
import model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.NoteRepository;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

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

    // Delete a Note
}
