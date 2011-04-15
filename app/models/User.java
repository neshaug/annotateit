package models;

import javax.persistence.Column;
import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class User extends Model {
    @Column(unique=true)
    public String username;
    public String password;
}
