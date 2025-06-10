package com.pokesim.model.game;

import com.pokesim.model.entities.WildPokemons;
import com.pokesim.utils.RandomGenerator;
import com.pokesim.model.entities.AllPokemons;

/**
 * Klasa która przetrzymuje metode losowania dzikeigo Pokemona
 */

public class WildPokemonRandomChoice {
    private final RandomGenerator random = new RandomGenerator();
    private final AllPokemons allPokemons = new AllPokemons();


    /**
     * Metoda losuje dzikiego Pokemona z listy
     * @return dziki Pokemon
     */
    public WildPokemons getRandomWildPokemon() {
        int index = random.getRandomInt(0, allPokemons.getWildPokemons().size() - 1);
        return allPokemons.getWildPokemons().get(index);
    }
}
