package models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Sitenote extends Model {
    
    public long created;
    
    @ManyToOne
    public User user;
    
    public String url;
    
    @OneToMany
    public Set<Note> notes = new HashSet<Note>();
    
    @Column(unique=true)
    public String hash;

}
