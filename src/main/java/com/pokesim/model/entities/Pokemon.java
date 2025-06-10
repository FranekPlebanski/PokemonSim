package com.pokesim.model.entities;

/**
 * Klasa reprezentuje Pokemona
 * Implementuje ona również system przyznawania obrażeń w walce
 * Implementuje interfejs Cloneable aby tworzyć kopie Pokemonów
 */

public class Pokemon implements Cloneable {
    private final String name;
    private final String element;
    private int hp;
    private final int attack;

    /**
     * Konstruktor tworzący nowego Pokemona
     *
     * @param name nazwa Pokemona
     * @param element żywioł Pokemona
     * @param hp początkowa wartość zdrowia
     * @param attack wartość ataku
     */

    public Pokemon(String name, String element, int hp, int attack) {
        this.name = name;
        this.element = element;
        this.hp = hp;
        this.attack = attack;
    }

    /**
     * Tworzy kopię Pokemona
     *
     * @return klon Pokemona
     */

    public Pokemon clone() {
        try {
            return (Pokemon) super.clone();

        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /**
     * Metoda zwraca nazwę Pokemona
     * @return nazwa Pokemona
     */

    public String getName() {
        return name;
    }

    /**
     * Metoda zwraca żywioł Pokemona
     * @return żywioł Pokemona
     */

    public String getElement() {
        return element;
    }

    /**
     * Metoda zwraca aktualną wartość punktów zdrowia
     * @return wartość punktów zdrowia
     */

    public int getHp() {
        return hp;
    }

    /**
     * Metoda ataku między pokemonami (1 tura)
     * Uwzględnione są mocne i słabe strony Pokemonów
     *
     * @param i wartość ataku Pokemona
     * @param pokemon Pokemon broniący
     * @param enemyPokemon Pokemon atakujący
     */

    public void attack(int i, Pokemon pokemon, Pokemon enemyPokemon){
        if(enemyPokemon.getElement().equals("Normal")){
            this.hp -= i;
        }
        else if(enemyPokemon.getElement().equals("Fire")){
            if(pokemon.getElement().equals("Grass") || pokemon.getElement().equals("Ice") || pokemon.getElement().equals("Worm") || pokemon.getElement().equals("Steel")){
                this.hp -= i*2;
            }
            else if(pokemon.getElement().equals("Water") || pokemon.getElement().equals("Earth") || pokemon.getElement().equals("Stone")){
                this.hp -= (int) Math.round(0.5*i);

            }
            else{
                this.hp -= i;
            }
        }
        else if(enemyPokemon.getElement().equals("Water")){
            if(pokemon.getElement().equals("Fire") || pokemon.getElement().equals("Earth") || pokemon.getElement().equals("Stone")){
                this.hp -= i*2;
            }
            else if(pokemon.getElement().equals("Electric") || pokemon.getElement().equals("Grass")){
                this.hp -= (int) Math.round(0.5*i);
            }
            else{
                this.hp -= i;
            }
        }
        else if(enemyPokemon.getElement().equals("Electric")){
            if(pokemon.getElement().equals("Water") || pokemon.getElement().equals("Flying")){
                this.hp -= i*2;
            }
            else if(pokemon.getElement().equals("Earth")){
                this.hp -= 0;
            }
            else{
                this.hp -= i;
            }
        }
        else if(enemyPokemon.getElement().equals("Grass")){
            if(pokemon.getElement().equals("Water") || pokemon.getElement().equals("Earth") || pokemon.getElement().equals("Stone")){
                this.hp -= i*2;

            }
            else if(pokemon.getElement().equals("Fire") || pokemon.getElement().equals("Ice") || pokemon.getElement().equals("Poison") || pokemon.getElement().equals("Flying") || pokemon.getElement().equals("Worm")){

                this.hp -= (int)Math.round(0.5*i);
            }
            else{
                this.hp -= i;
            }
        }
        else if(enemyPokemon.getElement().equals("Ice")){
            if(pokemon.getElement().equals("Grass") || pokemon.getElement().equals("Flying") || pokemon.getElement().equals("Dragonic") || pokemon.getElement().equals("Earth")){
                this.hp -= i*2;

            }
            else if(pokemon.getElement().equals("Fire") || pokemon.getElement().equals("Stone") || pokemon.getElement().equals("Steel") || pokemon.getElement().equals("Fighting")){
                this.hp -= (int)Math.round(0.5*i);
            }
            else{
                this.hp -= i;
            }
        }
        else if(enemyPokemon.getElement().equals("Fighting")){
            if(pokemon.getElement().equals("Normal") || pokemon.getElement().equals("Stone") || pokemon.getElement().equals("Steel") || pokemon.getElement().equals("Ice") || pokemon.getElement().equals("Dark")){
                this.hp -= i*2;
            }
            else if(pokemon.getElement().equals("Flying") || pokemon.getElement().equals("Psychic") || pokemon.getElement().equals("Wizardy")){
                this.hp -= (int)Math.round(0.5*i);

            }
            else{
                this.hp -= i;
            }
        }
        else if(enemyPokemon.getElement().equals("Poison")){
            if(pokemon.getElement().equals("Grass") || pokemon.getElement().equals("Wizardy")){
                this.hp -= i*2;
            }
            else if(pokemon.getElement().equals("Steel") || pokemon.getElement().equals("Earth") || pokemon.getElement().equals("Psychic")){
                this.hp -= (int)Math.round(0.5*i);
            }
            else{
                this.hp -= i;
            }
        }
        else if(enemyPokemon.getElement().equals("Earth")){
            if(pokemon.getElement().equals("Electric") || pokemon.getElement().equals("Fire") || pokemon.getElement().equals("Poison") || pokemon.getElement().equals("Stone") || pokemon.getElement().equals("Steel")){
                this.hp -= i*2;
            }
            else if(pokemon.getElement().equals("Flying")){
                this.hp -= 0;
            }
            else if(pokemon.getElement().equals("Water") || pokemon.getElement().equals("Ice") || pokemon.getElement().equals("Grass")){
                this.hp -= (int)Math.round(0.5*i);
            }
            else{
                this.hp -= i;
            }
        }
        else if(enemyPokemon.getElement().equals("Flying")){
            if(pokemon.getElement().equals("Grass") || pokemon.getElement().equals("Fighting") || pokemon.getElement().equals("Worm")){
                this.hp -= i*2;

            }
            else if(pokemon.getElement().equals("Electric") || pokemon.getElement().equals("Ice") || pokemon.getElement().equals("Stone")){
                this.hp -= (int)Math.round(0.5*i);

            }
            else{
                this.hp -= i;
            }
        }
        else if(enemyPokemon.getElement().equals("Psychic")){
            if(pokemon.getElement().equals("Fighting") || pokemon.getElement().equals("Poison")){
                this.hp -= i*2;

            }
            else if(pokemon.getElement().equals("Worm") || pokemon.getElement().equals("Dark") || pokemon.getElement().equals("Ghost")){
                this.hp -= (int)Math.round(0.5*i);

            }
            else{
                this.hp -= i;
            }
        }
        else if(enemyPokemon.getElement().equals("Worm")){
            if(pokemon.getElement().equals("Grass") || pokemon.getElement().equals("Psychic") || pokemon.getElement().equals("Dark")){
                this.hp -= i*2;
            }
            else if(pokemon.getElement().equals("Fire") || pokemon.getElement().equals("Flying") || pokemon.getElement().equals("Stone")){
                this.hp -= (int)Math.round(0.5*i);

            }
            else{
                this.hp -= i;
            }
        }
        else if(enemyPokemon.getElement().equals("Stone")){
            if(pokemon.getElement().equals("Fire") || pokemon.getElement().equals("Flying") || pokemon.getElement().equals("Worm")){
                this.hp -= i*2;
            }
            else if(pokemon.getElement().equals("Water") || pokemon.getElement().equals("Grass") || pokemon.getElement().equals("Fighting") || pokemon.getElement().equals("Steel")){
                this.hp -= (int)Math.round(0.5*i);

            }
            else{
                this.hp -= i;
            }

        }
        else if(enemyPokemon.getElement().equals("Ghost")){
            if(pokemon.getElement().equals("Psychic") || pokemon.getElement().equals("Ghost")){
                this.hp -= i*2;

            }
            else if(pokemon.getElement().equals("Normal")){
                this.hp -= 0;
            }
            else if(pokemon.getElement().equals("Dark")){
                this.hp -= (int)Math.round(0.5*i);
            }
            else{
                this.hp -= i;

            }
        }
        else if(enemyPokemon.getElement().equals("Dragonic")) {
            if(pokemon.getElement().equals("Dragonic")){
                this.hp -= i*2;
            }
            else if(pokemon.getElement().equals("Ice") || pokemon.getElement().equals("Dark") || pokemon.getElement().equals("Wizardy")){
                this.hp -= (int)Math.round(0.5*i);
            }
            else{
                this.hp -= i;
            }
        }
        else if(enemyPokemon.getElement().equals("Dark")){
            if(pokemon.getElement().equals("Psychic") || pokemon.getElement().equals("Ghost")){
                this.hp -= i*2;
            }
            else if(pokemon.getElement().equals("Fighting") || pokemon.getElement().equals("Dark") || pokemon.getElement().equals("Wizardy")){
                this.hp -= (int)Math.round(0.5*i);
            }
            else{
                this.hp -= i;
            }
        }
        else if(enemyPokemon.getElement().equals("Steel")){
            if(pokemon.getElement().equals("Ice") || pokemon.getElement().equals("Stone") || pokemon.getElement().equals("Wizardy")){
                this.hp -= i*2;

            }
            else if(pokemon.getElement().equals("Fire") || pokemon.getElement().equals("Fighting") || pokemon.getElement().equals("Earth")){
                this.hp -= (int)Math.round(0.5*i);
            }
            else{
                this.hp -= i;
            }
        }
        else if(enemyPokemon.getElement().equals("Wizardy")){
            if(pokemon.getElement().equals("Fighting") || pokemon.getElement().equals("Dragonic") || pokemon.getElement().equals("Dark")){
                this.hp -= i*2;

            }
            else if(pokemon.getElement().equals("Poison") || pokemon.getElement().equals("Steel")){
                this.hp -= (int)Math.round(0.5*i);

            }
            else{
                this.hp -= i;
            }
        }
    }

    /**
     * Metoda regeneruje wartość zdrowia Pokemona o 10 punktów
     */

    public void rest(){
        this.hp += 10;
    }

    /**
     * Metoda zwraca wartość ataku Pokemona
     * @return wartość ataku
     */

    public int getAttack() {
        return attack;
    }

    /**
     * Metoda regeneruje Pokemona po przegranej walce
     */

    public void setDefaultHp(){
        this.hp += 50;
    }

    /**
     * Metoda leczy Pokemona podczas leczenia w mieście
     * @param i wartość punktów do przywrócenia
     */

    public void cityPokemonHeal(int i){
        this.hp += i;
    }

    /**
     * Metoda zwraca tekstową reprezentację Pokemona
     * @return sformatowany string z informacjami o Pokemonie
     */

    @Override
    public String toString() {
        return "Pokemon {" +
                "name='" + name + '\'' +
                ", element='" + element + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                '}';
    }
}
