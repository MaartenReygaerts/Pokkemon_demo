package be.intecbrussel.infernalWhale.model;

import javax.persistence.*;

@Entity
public class Pokkemon {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToOne
    //many pokkemon can have one type
    private PokkemonType type;

    private Integer level;

    private Integer ivAttack;
    private Integer ivDefence;
    private Integer ivHitpoints;

    private Integer combatPower;

    @Transient
    private Integer dustToMaxLevel;

    @ManyToOne
    private Trainer trainer;


    //setters en getters
    public Integer getId() {
        return id;
    }

    public Pokkemon setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Pokkemon setName(String name) {
        this.name = name;
        return this;
    }

    public PokkemonType getType() {
        return type;
    }

    public Pokkemon setType(PokkemonType type) {
        this.type = type;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public Pokkemon setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public Integer getIvAttack() {
        return ivAttack;
    }

    public Pokkemon setIvAttack(Integer ivAttack) {
        this.ivAttack = ivAttack;
        return this;
    }

    public Integer getIvDefence() {
        return ivDefence;
    }

    public Pokkemon setIvDefence(Integer ivDefence) {
        this.ivDefence = ivDefence;
        return this;
    }

    public Integer getIvHitpoints() {
        return ivHitpoints;
    }

    public Pokkemon setIvHitpoints(Integer ivHitpoints) {
        this.ivHitpoints = ivHitpoints;
        return this;
    }

    public Integer getCombatPower() {
        return combatPower;
    }

    public Pokkemon setCombatPower(Integer combatPower) {
        this.combatPower = combatPower;
        return this;
    }

    public Integer getDustToMaxLevel() {
        return dustToMaxLevel;
    }

    public Pokkemon setDustToMaxLevel(Integer dustToMaxLevel) {
        this.dustToMaxLevel = dustToMaxLevel;
        return this;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public Pokkemon setTrainer(Trainer trainer) {
        this.trainer = trainer;
        return this;
    }
}
