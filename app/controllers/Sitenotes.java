package controllers;

import models.Sitenote;
import play.mvc.Controller;

public class Sitenotes extends Controller {
    
    public static void show(String hash) {
        Sitenote note = Sitenote.find("hash", hash).first();
        renderJSON(note);
    }
    
    public static void save(Sitenote sitenote) {
        sitenote.save();
    }
}
