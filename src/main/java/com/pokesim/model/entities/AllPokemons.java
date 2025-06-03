package com.pokesim.model.entities;

import java.util.ArrayList;
import java.util.List;

public class AllPokemons {
    public static final List<Pokemon> starters = List.of(
            new Pokemon("Bulbasaur", "Earth", 100, 5),
            new Pokemon("Charmander", "Fire", 90, 10),
            new Pokemon("Squirtle", "Water", 95, 6)
    );

    private final List<WildPokemons> wildPokemons = List.of(
            new WildPokemons("Rattata", "Normal", 20, 40),
            new WildPokemons("Meowth", "Normal", 20, 40),
            new WildPokemons("Bidoof", "Normal", 20, 40),
            new WildPokemons("Sentret", "Normal", 20, 40),
            new WildPokemons("Zigzagoon", "Normal", 20, 40),
            new WildPokemons("Vulpix", "Fire", 20, 40),
            new WildPokemons("Growlithe", "Fire", 20, 40),
            new WildPokemons("Ponyta", "Fire", 20, 40),
            new WildPokemons("Litwick", "Fire", 20, 40),
            new WildPokemons("Fennekin", "Fire", 20, 40),
            new WildPokemons("Magikarp", "Water", 20, 40),
            new WildPokemons("Poliwag", "Water", 20, 40),
            new WildPokemons("Wooper", "Water", 20, 40),
            new WildPokemons("Horsea", "Water", 25, 20),
            new WildPokemons("Feebas", "Water", 25, 20),
            new WildPokemons("Pikachu", "Electric", 25, 20),
            new WildPokemons("Shinx", "Electric", 25, 20),
            new WildPokemons("Joltik", "Electric", 25, 20),
            new WildPokemons("Blitzle", "Electric", 25, 20),
            new WildPokemons("Emolga", "Electric", 25, 20),
            new WildPokemons("Oddish", "Grass", 25, 20),
            new WildPokemons("Bellsprout", "Grass", 25, 20),
            new WildPokemons("Cottone", "Grass", 25, 20),
            new WildPokemons("Petilil", "Grass", 25, 20),
            new WildPokemons("Foongus", "Grass", 25, 20),
            new WildPokemons("Snorunt", "Ice", 25, 20),
            new WildPokemons("Sneasel", "Ice", 25, 20),
            new WildPokemons("Swinub", "Ice", 25, 20),
            new WildPokemons("Cryogonal", "Ice", 25, 20),
            new WildPokemons("Cubchoo", "Ice", 25, 20),
            new WildPokemons("Machop", "Fighting", 25, 20),
            new WildPokemons("Mankey", "Fighting", 25, 20),
            new WildPokemons("Timburr", "Fighting", 25, 20),
            new WildPokemons("Scraggy", "Fighting", 25, 20),
            new WildPokemons("Riolu", "Fighting", 25, 20),
            new WildPokemons("Grimer", "Poison", 25, 20),
            new WildPokemons("Koffing", "Poison", 25, 20),
            new WildPokemons("Trubbish", "Poison", 25, 20),
            new WildPokemons("Nidoran", "Poison", 25, 20),
            new WildPokemons("Sandshrew", "Earth", 25, 20),
            new WildPokemons("Diglett", "Earth", 25, 20),
            new WildPokemons("Cacnea", "Earth", 25, 20),
            new WildPokemons("Numel", "Earth", 60, 15),
            new WildPokemons("Drilbur", "Earth", 60, 15),
            new WildPokemons("Pidgey", "Flying", 60, 15),
            new WildPokemons("Hoothoot", "Flying", 60, 15),
            new WildPokemons("Starly", "Flying", 60, 15),
            new WildPokemons("Taillow", "Flying", 60, 15),
            new WildPokemons("Fletchling", "Flying", 60, 15),
            new WildPokemons("Abra", "Psychic", 60, 15),
            new WildPokemons("Ralts", "Psychic", 60, 15),
            new WildPokemons("Espurr", "Psychic", 60, 15),
            new WildPokemons("Munna", "Psychic", 60, 15),
            new WildPokemons("Gothita", "Psychic", 60, 15),
            new WildPokemons("Caterpie", "Worm", 60, 15),
            new WildPokemons("Weedle", "Worm", 60, 15),
            new WildPokemons("Wurmple", "Worm", 60, 15),
            new WildPokemons("Scatterbug", "Worm", 60, 15),
            new WildPokemons("Blipbug", "Worm", 60, 15),
            new WildPokemons("Geodude", "Stone", 60, 15),
            new WildPokemons("Roggenrola", "Stone", 60, 15),
            new WildPokemons("Dwebble", "Stone", 60, 15),
            new WildPokemons("Corsola", "Stone", 60, 15),
            new WildPokemons("Omanyte", "Stone", 60, 15),
            new WildPokemons("Gastly", "Ghost", 60, 15),
            new WildPokemons("Misdreavus", "Ghost", 60, 15),
            new WildPokemons("Phantump", "Ghost", 60, 15),
            new WildPokemons("Drifloon", "Ghost", 50, 15),
            new WildPokemons("Duskull", "Ghost", 50, 15),
            new WildPokemons("Dratini", "Dragonic", 50, 15),
            new WildPokemons("Gible", "Dragonic", 50, 15),
            new WildPokemons("Axew", "Dragonic", 50, 15),
            new WildPokemons("Deino", "Dragonic", 50, 15),
            new WildPokemons("Dreepy", "Dragonic", 50, 15),
            new WildPokemons("Poochyena", "Dark", 50, 15),
            new WildPokemons("Sandile", "Dark", 50, 15),
            new WildPokemons("Murkrow", "Dark", 50, 15),
            new WildPokemons("Vullaby", "Dark", 50, 15),
            new WildPokemons("Sneasel", "Dark", 50, 15),
            new WildPokemons("Magnemite", "Steel", 50, 15),
            new WildPokemons("Beldum", "Steel", 50, 15),
            new WildPokemons("Klink", "Steel", 50, 15),
            new WildPokemons("Pawniard", "Steel", 50, 15),
            new WildPokemons("Mawile", "Steel", 50, 15),
            new WildPokemons("Spritzee", "Wizardy", 50, 15),
            new WildPokemons("Swirlix", "Wizardy", 50, 15),
            new WildPokemons("Cutiefly", "Wizardy", 50, 15),
            new WildPokemons("Milcery", "Wizardy", 60, 15),
            new WildPokemons("Igglybuff", "Wizardy", 10, 15)





            );

    public List<StorePokemon> storePokemons = new ArrayList<>(List.of(
            new StorePokemon("Snorlax", "normal", 460, 100, 20),
            new StorePokemon("Diglet", "Earth", 20, 10, 5)
    ));


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
