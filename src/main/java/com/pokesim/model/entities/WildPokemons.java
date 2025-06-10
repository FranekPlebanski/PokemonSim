package com.pokesim.model.entities;

/**
 * Klasa reprezentuje dzikiego Pokemona, z którym odbywa się walka
 * Rozszerza klasę Pokemon
 */

public class WildPokemons extends Pokemon {

    /**
     * Konstruktor tworzący nowego dzikiego Pokemona
     * @param name nazwa Pokemona
     * @param element żywioł Pokemona
     * @param hp wartość zdrowia Pokemona
     * @param attack wartość ataku Pokemona
     */
    public WildPokemons(String name, String element, int hp, int attack) {
        super(name, element, hp, attack);
    }

    /**
     * Polimorficzna funkcja, która w przypadku dzikich Pokemonów leczy ich więcej w mieście
     * @param i wartość punktów do przywrócenia
     */

    @Override
    public void cityPokemonHeal(int i) {
        super.cityPokemonHeal(i + 10);
    }
}
