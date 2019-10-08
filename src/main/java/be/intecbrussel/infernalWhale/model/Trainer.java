package be.intecbrussel.infernalWhale.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trainer {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private Integer level;


    //getters & setters
    public Integer getId() {
        return id;
    }

    public Trainer setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Trainer setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public Trainer setLevel(Integer level) {
        this.level = level;
        return this;
    }
}
