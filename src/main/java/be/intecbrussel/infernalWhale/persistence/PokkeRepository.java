package be.intecbrussel.infernalWhale.persistence;

import be.intecbrussel.infernalWhale.model.Pokkemon;

import java.util.List;

public interface PokkeRepository {

    Pokkemon savePokkemon(Pokkemon pokkemon);

    List<Pokkemon> getAllPokkemon();



}
