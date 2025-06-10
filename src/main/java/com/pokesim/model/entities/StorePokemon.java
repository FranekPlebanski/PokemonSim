package com.pokesim.model.entities;

/**
 * Klasa reprezentuje Pokemona dostępnego do kupienia w sklepie
 * Rozszerza klasę Pokemon i dodaje parametr cenowy
 */

public class StorePokemon extends Pokemon {

    private final int price;

    /**
     * Konstruktor, który tworzy StorePokemon
     *
     * @param name nazwa Pokemona
     * @param element żywioł Pokemona
     * @param hp punkty zdrowia Pokemona
     * @param attack wartość ataku Pokemona
     * @param price cena Pokemona
     */

    public StorePokemon(String name, String element, int hp, int attack, int price) {
        super(name, element, hp, attack);
        this.price = price;

    }

    /**
     * Metoda zwraca cenę Pokemona
     * @return cena Pokemona
     */

    public int getPrice() {
        return price;
    }

    /**
     * Metoda zwraca tekstową reprezentację Pokemona
     * @return sformatowany string z informacjami o Pokemonie
     */

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + getName() + '\'' +
                ", element='" + getElement() + '\'' +
                ", hp=" + getHp() +
                ", attack=" + getAttack() + ", price= " + getPrice() +
                '}';
    }

}
