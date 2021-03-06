package be.intecbrussel.infernalWhale.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PokkemonType {

    @Id
    @GeneratedValue
    private Integer id;

    private String typeName;

    private String description;

    private Integer baseAttack;
    private Integer baseDefence;
    private Integer baseHitpoints;

    //getters en setters
    public Integer getId() {
        return id;
    }

    public PokkemonType setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTypeName() {
        return typeName;
    }

    public PokkemonType setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public PokkemonType setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getBaseAttack() {
        return baseAttack;
    }

    public PokkemonType setBaseAttack(Integer baseAttack) {
        this.baseAttack = baseAttack;
        return this;
    }

    public Integer getBaseDefence() {
        return baseDefence;
    }

    public PokkemonType setBaseDefence(Integer baseDefence) {
        this.baseDefence = baseDefence;
        return this;
    }

    public Integer getBaseHitpoints() {
        return baseHitpoints;
    }

    public PokkemonType setBaseHitpoints(Integer baseHitpoints) {
        this.baseHitpoints = baseHitpoints;
        return this;
    }
}
