package com.pokesim.view;

import com.pokesim.model.entities.*;
import com.pokesim.model.game.BattleAction;
import com.pokesim.model.game.CityAction;
import com.pokesim.model.world.City;

import java.util.Scanner;

/**
 * Klasa odpowiedzialna za interfejs użytkownika w konsoli
 */

public class ConsoleUI implements UI {
    private final Scanner scanner = new Scanner(System.in);
    AllPokemons allPokemons = new AllPokemons();

    /**
     * Metoda rozpoczyna grę, prosi użytkownika o podanie nazwy gracza i wybór Pokemona startowego
     * @return nowy obiekt Player z wybraną nazwą i Pokemonem
     */

    @Override
    public Player startGame() {
        System.out.println("Welcome to the pokemonSIM game!");
        System.out.println("Choose your name:");
        String name = scanner.nextLine();
        System.out.println("Choose starting pokemon:");

        for (int i = 0; i < AllPokemons.starters.size(); i++) {
            System.out.printf("%s. %s\n", i, AllPokemons.starters.get(i).toString());
        }

        int chosenPokemon = scanner.nextInt();

        return new Player(name, AllPokemons.starters.get(chosenPokemon).clone(), 0, new City("Lavender Town"));
    }

    /**
     * Metoda wyświetla menu miasta i prosi o wybór akcji gracza
     * @param city nazwa aktualnego miasta
     * @return wybrana akcja w mieście (FIGHT, HEAL, BUY_POKEMON)
     */
    @Override
    public CityAction cityMenu(String city){
        while(true) {


            System.out.println("Welcome to the " + city);
            System.out.println("1. Go on road");
            System.out.println("2. Heal pokemons (5 coins)");
            System.out.println("3. Buy pokemons");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    return CityAction.FIGHT;
                case 2:
                    return CityAction.HEAL;
                case 3:
                    return CityAction.BUY_POKEMON;
                default:
                    continue;
            }
        }
    }

    /**
     * Metoda wyświetla informacje o napotkanym dzikim pokemonie i prosi o wybór Pokemona do walki
     *
     * @param wildPokemons spotkany dziki Pokemon
     * @param currentPlayer aktualny gracz
     * @return wybrany Pokemon przez gracza do walki
     */
    @Override
    public Pokemon battleInfo(WildPokemons wildPokemons, Player currentPlayer) {

        System.out.println("WARNING!!! You have encountered a " + wildPokemons);
        System.out.println("Choose your fighter: ");
        for (int i = 0; i < currentPlayer.getPokemons().size(); i++) {
            System.out.printf("%s. %s\n", i, currentPlayer.getPokemons().get(i).toString());
        }
        int choice = scanner.nextInt();
        return currentPlayer.getPokemons().get(choice);
    }


    /**
     * Metoda wyświetla interfejs walki i prosi o wybór akcji do wykonania
     *
     * @param wildPokemons dziki Pokemon, z którym walczymy
     * @param currentPokemon Pokemon, który został wcześniej wybrany
     * @return wybrana akacja (FIGHT, HEAL(
     */
    @Override
    public BattleAction battleInterface(WildPokemons wildPokemons, Pokemon currentPokemon) {
        while(true) {


            System.out.println("Your Pokemon: ");
            System.out.println(currentPokemon.getName());
            System.out.println("Current hp: " + currentPokemon.getHp());
            System.out.println("Current attack: " + currentPokemon.getAttack());

            System.out.println("Enemy pokemon: ");
            System.out.println(wildPokemons.getName());
            System.out.println("Current hp: " + wildPokemons.getHp());
            System.out.println("Current attack: " + wildPokemons.getAttack());

            System.out.println("Choose your action: ");
            System.out.println("1. Attack pokemon (" + (currentPokemon.getAttack() - 3) + "-" + (currentPokemon.getAttack() + 3) + ")");
            System.out.println("2. Rest pokemon (+ 10hp)");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    return BattleAction.FIGHT;
                case 2:
                    return BattleAction.HEAL;
                default:
                    System.out.println("Wrong choice!");
                    continue;
            }
        }

    }

    /**
     * Metoda powiadamia o wykonanym ataku na przeciwnika
     * @param attackValue wartość zadanych obrażeń
     */
    @Override
    public void notifyAttackSelf(int attackValue){
        System.out.println("You've attacked opponent for " + attackValue + " damage!");
    }

    /**
     * Metoda powiadamia gracza o wyleczeniu się podczas walki
     */
    @Override
    public void notifyRestSelf(){
        System.out.println("You've rested and restored 10 hp points");
    }

    /**
     * Metoda powiadamia gracza o wykonanym ataku przez przeciwnika
     * @param attackValue wartość przyjętych obrażeń
     */
    @Override
    public void notifyAttackOpponent(int attackValue){
        System.out.println("Opponent attacked you for " + attackValue + " damage!");

    }

    /**
     * Metoda powiadamia o schwytaniu pokemona
     * @param pokemonName nazwa schwytanego pokemona
     */
    @Override
    public void notifyCatch(String pokemonName){
        System.out.println("You've caught " + pokemonName);
    }

    /**
     * Metoda powiadamia o utracie Pokemona
     * @param pokemon utracony pokemon
     */
    @Override
    public void notifyLosePokemon(Pokemon pokemon){
        System.out.println("You've lost pokemon " + pokemon.getName());
    }

    /**
     * Metoda powiadamia gracza o uleczeniu przez przeciwnika
     */
    @Override
    public void notifyRestOpponent(){
        System.out.println("Opponent has rested and restored 10 hp points");
    }

    /**
     * Metoda powiadamia gracza o tym, że jest aktualnie runda przeciwnika
     */
    @Override
    public void opponentTurn(){
        System.out.println("Opponent's turn!");
    }

    /**
     * Metoda powiadamia o wyleczeniu Pokemonów gracza w mieście
     */
    @Override
    public void notifyCityHeal(){
        System.out.println("You've healed all your pokemons!");
    }

    /**
     * Metoda wyświetla i prosi użytkownika o wybór Pokemona do kupienia
     * @return Pokemon do kupienia lub null w przypadku wybraniu wyjścia
     */
    @Override
    public StorePokemon getStoreMenu(){
        for (int i = 0; i < allPokemons.getStorePokemons().size(); i++) {
            System.out.println(i + "." + allPokemons.getStorePokemons().get(i));
        }
        System.out.println(allPokemons.getStorePokemons().size() + ". Exit");
        int pokemonToBuy = scanner.nextInt();
        if(pokemonToBuy < allPokemons.getStorePokemons().size()){
            StorePokemon pokemon = allPokemons.getStorePokemons().get(pokemonToBuy);
            allPokemons.getStorePokemons().remove(pokemonToBuy);
            return pokemon;

        }
        else{
            return null;
        }
    }

    /**
     * Metoda powiadamia o kupieniu pokemona
     * @param pokemonName nazwa kupionego Pokemona
     */
    @Override
    public void notifyBuyPokemon(String pokemonName){
        System.out.println("You've bought " + pokemonName);
    }

    /**
     * Metoda powiadamia o braku funduszy na kupno wybranego Pokemona
     * @param pokemonName nazwa wybranego Pokemona do kupienia
     */
    @Override
    public void notifyNoBuyPokemon(String pokemonName){
        System.out.println("You can't afford " + pokemonName);
    }

    /**
     * Metoda wyświetla aktualną ilość monetek gracza
     * @param currentPlayer obecny gracz
     */
    @Override
    public void displayMoneyAmount(Player currentPlayer){
        System.out.println("Your balance: " + currentPlayer.getMoneyAmount());
    }

    /**
     * Metoda informuje o wygraniu gry przez gracza
     */
    @Override
    public void notifyWin(){
        System.out.println("You win!");
    }

    /**
     * Metoda informuje o przegraniu gry przez gracza
     */
    @Override
    public void notifyLose(){
        System.out.println("You lose!");
    }
}
