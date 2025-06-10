package com.pokesim.app;

import com.pokesim.controller.GameController;
import com.pokesim.view.ConsoleUI;

/**
 * Klasa główna, w której uruchamiany jest projekt
 */

public class Main {
    public static void main(String[] args) {
        ConsoleUI consoleUI = new ConsoleUI();

        GameController game = new GameController(
                consoleUI
        );

        game.run();
    }
}