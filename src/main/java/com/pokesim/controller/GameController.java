package com.pokesim.controller;

import com.pokesim.model.entities.*;
import com.pokesim.model.game.BattleAction;
import com.pokesim.model.game.CityAction;
import com.pokesim.model.game.WildPokemonRandomChoice;
import com.pokesim.utils.RandomGenerator;
import com.pokesim.view.UI;
import com.pokesim.model.entities.AllPokemons;

/**
 * Główna klasa kontrolująca przebieg rozgrywki
 */
public class GameController {

    /**
     * Interfejs używany do komunikacji
     */
    private final UI consoleUI;

    /**
     * Konstruktor
     * @param consoleUI interfejs użytkownika
     */
    public GameController(UI consoleUI) {
        this.consoleUI = consoleUI;
    }

    /**
     * Główna pętla gry. Zarządza wyborami gracza w mieście, walką z dzikimi Pokemonami, leczeniem i przemieszczaniem się
     * Pętla kończy się w momencie utraty wszystkich Pokemonów lub zdobyciu maksymalnej ilości
     */
    public void run() {
        Player currentPlayer = consoleUI.startGame();
        while(!currentPlayer.getPokemons().isEmpty() && currentPlayer.getPokemons().size() < 10) {
            // Wybory w mieście i walka
            CityAction action = consoleUI.cityMenu(currentPlayer.getCurrentCity());
            if (action == CityAction.BUY_POKEMON) {

                consoleUI.displayMoneyAmount(currentPlayer);
                StorePokemon pokemonToBuy = consoleUI.getStoreMenu();

                if(pokemonToBuy == null){
                    continue;
                }

                if(pokemonToBuy.getPrice() > currentPlayer.getMoneyAmount()){
                    consoleUI.notifyNoBuyPokemon(pokemonToBuy.getName());
                }
                else if(pokemonToBuy.getPrice() <= currentPlayer.getMoneyAmount()){
                    consoleUI.notifyBuyPokemon(pokemonToBuy.getName());
                    Pokemon bought = new Pokemon(
                            pokemonToBuy.getName(),
                            pokemonToBuy.getElement(),
                            pokemonToBuy.getHp(),
                            pokemonToBuy.getAttack()
                    );
                    currentPlayer.getPokemons().add(bought);
                    currentPlayer.buyPokemonMoneyLose(pokemonToBuy.getPrice());

                }





            }
            else if (action == CityAction.HEAL) {

                if(currentPlayer.getMoneyAmount() >= 5){
                    currentPlayer.cityPokemonHeal();
                    consoleUI.notifyCityHeal();
                    currentPlayer.buyPokemonMoneyLose(5);
                }else{
                    System.out.println("You don't have enough money to heal");
                }




            }
            else if (action == CityAction.FIGHT) {
                WildPokemons wildPokemons = new WildPokemonRandomChoice().getRandomWildPokemon();
                Pokemon chosenOne = consoleUI.battleInfo(wildPokemons, currentPlayer);
                while (wildPokemons.getHp() > 0 && chosenOne.getHp() > 0) {
                    BattleAction choice = consoleUI.battleInterface(wildPokemons, chosenOne);
                    switch (choice) {
                        case FIGHT:
                            int attackValue = new RandomGenerator().getRandomInt(chosenOne.getAttack() - 3, chosenOne.getAttack() + 3);
                            wildPokemons.attack(attackValue, wildPokemons, chosenOne);
                            consoleUI.notifyAttackSelf(attackValue);
                            break;
                        case HEAL:
                            chosenOne.rest();
                            consoleUI.notifyRestSelf();
                            break;
                    }
                    if (wildPokemons.getHp() > 0) {


                        consoleUI.opponentTurn();
                        int random = new RandomGenerator().getRandomInt(0, 100);
                        if (random < 30) {
                            wildPokemons.rest();
                            consoleUI.notifyRestOpponent();
                        } else {
                            int attackValue = new RandomGenerator().getRandomInt(wildPokemons.getAttack() - 3, wildPokemons.getAttack() + 3);
                            chosenOne.attack(attackValue, chosenOne, wildPokemons);
                            consoleUI.notifyAttackOpponent(attackValue);
                        }
                    }

                        if (chosenOne.getHp() <= 0) {
                            currentPlayer.removePokemon(chosenOne);
                            consoleUI.notifyLosePokemon(chosenOne);
                        } else if (wildPokemons.getHp() <= 0) {
                            currentPlayer.addPokemon(wildPokemons);
                            consoleUI.notifyCatch(wildPokemons.getName());
                            currentPlayer.winBattleMoney();
                        }

                }
                wildPokemons.setDefaultHp();


                // Zmiana miasta
                if(currentPlayer.getCurrentCity().equals("Lavender Town")) {
                    currentPlayer.changeCurrentCity("Celadon City");
                }
                else if(currentPlayer.getCurrentCity().equals("Celadon City")) {
                    currentPlayer.changeCurrentCity("Cerulean City");
                }
                else if(currentPlayer.getCurrentCity().equals("Cerulean City")) {
                    currentPlayer.changeCurrentCity("Castelia City");
                }
                else if(currentPlayer.getCurrentCity().equals("Castelia City")) {
                    currentPlayer.changeCurrentCity("Cinnabar Island");
                }
                else if(currentPlayer.getCurrentCity().equals("Cinnabar Island")) {
                    currentPlayer.changeCurrentCity("PalletTown");
                }
                else{
                    currentPlayer.changeCurrentCity("Lavender Town");
                }
            }




        }
        // Koniec gry
        if (currentPlayer.getPokemons().isEmpty()) {
            consoleUI.notifyLose();
        }
        else{
            consoleUI.notifyWin();
        }
    }
}
