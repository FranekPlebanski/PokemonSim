package com.pokesim.utils;

import java.util.Random;

/**
 * Klasa służąca do losowania numerów w danym przedziale
 */

public class RandomGenerator {
    private Random random = new Random();

    /**
     * Metoda zwraca wylosowaną liczbę
     * @param min minimalna wartość
     * @param max maksymalna wartość
     * @return wylosowana liczba
     */

    public int getRandomInt(int min, int max){
        return random.nextInt((max - min) + 1) + min;
    }
}
