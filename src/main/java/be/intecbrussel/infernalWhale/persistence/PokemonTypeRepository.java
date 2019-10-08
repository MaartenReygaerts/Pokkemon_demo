package be.intecbrussel.infernalWhale.persistence;

import be.intecbrussel.infernalWhale.model.PokkemonType;

public interface PokemonTypeRepository {

    PokkemonType saveType(PokkemonType type);

    PokkemonType getType(Integer id);

}
