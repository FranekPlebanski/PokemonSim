package com.pokesim.model.entities;

import java.util.List;

public class AllPokemons {
    public static final List<Pokemon> starters = List.of(
            new Pokemon("Bulbasaur", "Earth", 100, 5),
            new Pokemon("Charmander", "Fire", 90, 10),
            new Pokemon("Squirtle", "Water", 95, 6)
    );

    private final List<WildPokemons> wildPokemons = List.of(
            new WildPokemons("Rattata", "Normal", 10, 2),
            new WildPokemons("Meowth", "Normal", 10, 2),
            new WildPokemons("Bidoof", "Normal", 10, 2),
            new WildPokemons("Sentret", "Normal", 10, 2),
            new WildPokemons("Zigzagoon", "Normal", 10, 2),
            new WildPokemons("Vulpix", "Fire", 10, 2),
            new WildPokemons("Growlithe", "Fire", 10, 2),
            new WildPokemons("Ponyta", "Fire", 10, 2),
            new WildPokemons("Litwick", "Fire", 10, 2),
            new WildPokemons("Fennekin", "Fire", 10, 2),
            new WildPokemons("Magikarp", "Water", 10, 2),
            new WildPokemons("Poliwag", "Water", 10, 2),
            new WildPokemons("Wooper", "Water", 10, 2),
            new WildPokemons("Horsea", "Water", 10, 2),
            new WildPokemons("Feebas", "Water", 10, 2),
            new WildPokemons("Pikachu", "Electric", 10, 2),
            new WildPokemons("Shinx", "Electric", 10, 2),
            new WildPokemons("Joltik", "Electric", 10, 2),
            new WildPokemons("Blitzle", "Electric", 10, 2),
            new WildPokemons("Emolga", "Electric", 10, 2),
            new WildPokemons("Oddish", "Grass", 10, 2),
            new WildPokemons("Bellsprout", "Grass", 10, 2),
            new WildPokemons("Cottone", "Grass", 10, 2),
            new WildPokemons("Petilil", "Grass", 10, 2),
            new WildPokemons("Foongus", "Grass", 10, 2),
            new WildPokemons("Snorunt", "Ice", 10, 2),
            new WildPokemons("Sneasel", "Ice", 10, 2),
            new WildPokemons("Swinub", "Ice", 10, 2),
            new WildPokemons("Cryogonal", "Ice", 10, 2),
            new WildPokemons("Cubchoo", "Ice", 10, 2),
            new WildPokemons("Machop", "Fighting", 10, 2),
            new WildPokemons("Mankey", "Fighting", 10, 2),
            new WildPokemons("Timburr", "Fighting", 10, 2),
            new WildPokemons("Scraggy", "Fighting", 10, 2),
            new WildPokemons("Riolu", "Fighting", 10, 2),
            new WildPokemons("Grimer", "Poison", 10, 2),
            new WildPokemons("Koffing", "Poison", 10, 2),
            new WildPokemons("Trubbish", "Poison", 10, 2),
            new WildPokemons("Nidoran", "Poison", 10, 2),
            new WildPokemons("Sandshrew", "Earth", 10, 2),
            new WildPokemons("Diglett", "Earth", 10, 2),
            new WildPokemons("Cacnea", "Earth", 10, 2),
            new WildPokemons("Numel", "Earth", 10, 2),
            new WildPokemons("Drilbur", "Earth", 10, 2),
            new WildPokemons("Pidgey", "Flying", 10, 2),
            new WildPokemons("Hoothoot", "Flying", 10, 2),
            new WildPokemons("Starly", "Flying", 10, 2),
            new WildPokemons("Taillow", "Flying", 10, 2),
            new WildPokemons("Fletchling", "Flying", 10, 2),
            new WildPokemons("Abra", "Psychic", 10, 2),
            new WildPokemons("Ralts", "Psychic", 10, 2),
            new WildPokemons("Espurr", "Psychic", 10, 2),
            new WildPokemons("Munna", "Psychic", 10, 2),
            new WildPokemons("Gothita", "Psychic", 10, 2),
            new WildPokemons("Caterpie", "Worm", 10, 2),
            new WildPokemons("Weedle", "Worm", 10, 2),
            new WildPokemons("Wurmple", "Worm", 10, 2),
            new WildPokemons("Scatterbug", "Worm", 10, 2),
            new WildPokemons("Blipbug", "Worm", 10, 2),
            new WildPokemons("Geodude", "Stone", 10, 2),
            new WildPokemons("Roggenrola", "Stone", 10, 2),
            new WildPokemons("Dwebble", "Stone", 10, 2),
            new WildPokemons("Corsola", "Stone", 10, 2),
            new WildPokemons("Omanyte", "Stone", 10, 2),
            new WildPokemons("Gastly", "Ghost", 10, 2),
            new WildPokemons("Misdreavus", "Ghost", 10, 2),
            new WildPokemons("Phantump", "Ghost", 10, 2),
            new WildPokemons("Drifloon", "Ghost", 10, 2),
            new WildPokemons("Duskull", "Ghost", 10, 2),
            new WildPokemons("Dratini", "Dragonic", 10, 2),
            new WildPokemons("Gible", "Dragonic", 10, 2),
            new WildPokemons("Axew", "Dragonic", 10, 2),
            new WildPokemons("Deino", "Dragonic", 10, 2),
            new WildPokemons("Dreepy", "Dragonic", 10, 2),
            new WildPokemons("Poochyena", "Dark", 10, 2),
            new WildPokemons("Sandile", "Dark", 10, 2),
            new WildPokemons("Murkrow", "Dark", 10, 2),
            new WildPokemons("Vullaby", "Dark", 10, 2),
            new WildPokemons("Sneasel", "Dark", 10, 2),
            new WildPokemons("Magnemite", "Steel", 10, 2),
            new WildPokemons("Beldum", "Steel", 10, 2),
            new WildPokemons("Klink", "Steel", 10, 2),
            new WildPokemons("Pawniard", "Steel", 10, 2),
            new WildPokemons("Mawile", "Steel", 10, 2),
            new WildPokemons("Spritzee", "Wizardy", 10, 2),
            new WildPokemons("Swirlix", "Wizardy", 10, 2),
            new WildPokemons("Cutiefly", "Wizardy", 10, 2),
            new WildPokemons("Milcery", "Wizardy", 10, 2),
            new WildPokemons("Igglybuff", "Wizardy", 10, 2)





            );

    private static final List<StorePokemon> storePokemons = List.of(
            new StorePokemon("Snorlax", "normal", 460, 100, 20),
            new StorePokemon("Diglet", "Earth", 20, 10, 5)
    );

    public List<Pokemon> getStarters() {
        return starters;
    }

    public List<WildPokemons> getWildPokemons() {
        return wildPokemons;
    }

    public List<StorePokemon> getStorePokemons() {
        return storePokemons;
    }

    public StorePokemon getStorePokemon(int index) {
        return storePokemons.get(index);
    }

    public Pokemon getStarter(int index) {
        return starters.get(index);
    }

    public WildPokemons getWildPokemon(int index) {
        return wildPokemons.get(index);
    }
}
