package pokemons;

import attacks.statusAttacks.Growl;
import attacks.statusAttacks.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lotad extends New_Pokemon
{
    public Lotad (String name, int lvl)
    {
        super(name, lvl);

        // set stats
        this.setStats(40, 30, 30, 40, 50, 30);
        this.setType(Type.WATER, Type.GRASS);

        // add attacks
        this.addMove(new Growl());
        this.addMove(new Rest());
    }
}
