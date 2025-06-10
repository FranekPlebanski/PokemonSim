package com.pokesim.model.world;

/**
 * Klasa odpowiadająca za przetrzymywanie informacji o aktualnym mieście
 */

public class City {
    private String name;

    /**
     * metoda zmienia nazwę aktualnego miasta, w którym się znajdujemy
     * @param name nazwa nowego miasta
     */

    public City(String name) {
        this.name = name;
    }

    /**
     * Metoda zwraca nazwę aktualnego miasta
     * @return nazwa miasta
     */

    public String getName() {
        return name;
    }
}
