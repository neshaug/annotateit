package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Note extends Model {
    public String content;
    public String xpath;
    
    public int x;
    public int y;
}
