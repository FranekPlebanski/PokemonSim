package com.pokesim.model.entities;

import com.pokesim.model.world.City;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa reprezentująca gracza
 * Przechowuje informacje takie jak nazwa gracza, liste posiadanych Pokemonów, aktualną lokalizacje i stan finansowy
 */

public class Player {
    private final String name;
    private final List<Pokemon> ownedPokemons = new ArrayList<>();
    private int moneyAmount = 0;
    private String currentCity;

    /**
     * Konstruktor tworzący nowego gracza z określonymi parametrami początkowymi
     *
     * @param name nazwa gracza
     * @param starter wybrany Pokemon startowy
     * @param moneyAmount początkowa ilość monetek
     * @param currentCity początkowe miasto gracza
     */

    public Player(String name, Pokemon starter, int moneyAmount, City currentCity) {
        this.name = name;
        ownedPokemons.add(starter);
        this.moneyAmount = moneyAmount;
        this.currentCity = currentCity.getName();
    }


    /**
     * Metoda zwraca ilość monetek jaką posiada gracz
     * @return aktualny stan konta gracza
     */

    public int getMoneyAmount() {
        return moneyAmount;
    }

    /**
     * Metoda zwraca aktualne miasto gracza
     * @return nazwa aktualnego miasta
     */

    public String getCurrentCity() {
        return currentCity;
    }

    /**
     * Metoda zmienia aktualne miasto gracza na nowe
     * @param newCity nazwa nowego miasta
     */

    public void changeCurrentCity(String newCity) {
        currentCity = newCity;
    }

    /**
     * Metoda dodaje 5 monetek do konta gracza za wygraną walkę
     */

    public void winBattleMoney(){
        this.moneyAmount += 5;
    }

    /**
     * Metoda odejmuje z konta gracza tyle monetek za ile kupił pokemona
     * @param price cena kupowanego Pokemona
     */

    public void buyPokemonMoneyLose(int price){
        this.moneyAmount -= price;
    }

    /**
     * Metoda dodaje nowego Pokemona do listy posiadanych Pokemonów
     * @param pokemon nowy Pokemon do dodania
     */

    public void addPokemon(Pokemon pokemon) {
        ownedPokemons.add(pokemon);
    }

    /**
     * Metoda zwraca liste posiadanych Pokemonów przez gracza
     * @return lista ownedPokemons
     */

    public List<Pokemon> getPokemons() {
        return ownedPokemons;
    }

    /**
     * Metoda usuwa konkretnego Pokemona z listy posiadanych Pokemonów
     * @param pokemon Pokemon do usunięcia
     */

    public void removePokemon(Pokemon pokemon){
        ownedPokemons.remove(pokemon);
    }

    /**
     * Metoda leczy wszystkie Pokemony gracza
     * Wartość stała 30 punktów zdrowia
     */

    public void cityPokemonHeal(){
        for(int i = 0; i <= ownedPokemons.size() - 1; i++){
            ownedPokemons.get(i).cityPokemonHeal(30);
        }
    }

    /**
     * Metoda zwraca nazwę gracza
     * @return nazwa gracza
     */

    public String getName() {
        return name;
    }
}
