package controllers;

import models.Note;
import play.mvc.Controller;

import java.util.List;

public class Notes extends Controller {

    public static void save(Note note) {
        note.save();
    }

    public static void show(Long id) {
        Note note = Note.findById(id);
        renderJSON(note);
    }

    public static void all() {
        List<Note> notes = Note.all().fetch();
        renderJSON(notes);
    }
}
