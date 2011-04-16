package controllers;

import com.google.gson.Gson;
import models.Note;
import play.Logger;
import play.mvc.Controller;

import java.util.List;

public class Notes extends Controller {

    private static final Gson gson = new Gson();

    private static String toJSONP(final String callback, final Object src) {
        return String.format("%s(%s)", callback, gson.toJson(src));
    }

    public static void save(Note note) {
        note.save();
        renderJSON(note);
    }

    public static void show(Long id) {
        Note note = Note.findById(id);
        renderJSON(note);
    }

    public static void all() {
        final String cb = params.get("callback");
        if (cb == null) {
            throw new IllegalArgumentException("Missing parameter: callback");
        }
        Logger.info("Callback: %s", cb);
        final List<Note> notes = Note.all().fetch();
        renderText(toJSONP(cb, notes));
    }
}
