package pokemons;

import ru.ifmo.se.pokemon.Pokemon;

public class New_Pokemon extends Pokemon
{
    private boolean correct_lvl = true;

    public New_Pokemon(String name, int lvl)
    {
        super(name, lvl);
        if (lvl > 100 || lvl < 1)
        {
            correct_lvl = false;
            System.out.printf("%s был исключен из боя, потому что lvl должен лежать в промежутке 1-100\n", name);
        }
    }

    public boolean get_correct_lvl (){
        return correct_lvl;
    }
}
