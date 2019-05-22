package controller;


import model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import repository.NoteRepository;

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

    // Get a Single Note

    // Update a Note

    // Delete a Note
}
