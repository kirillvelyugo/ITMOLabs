package pokemons;

import attacks.physicalAttacks.Facade;
import attacks.statusAttacks.Amnesia;
import attacks.statusAttacks.TailWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Psyduck extends Pokemon
{
    public Psyduck(String name, int lvl)
    {
        super(name, lvl);

        //set stats
        this.setStats(50, 52, 48, 65, 50, 55);
        this.addType(Type.WATER);

        // add atacks
        this.addMove(new TailWhip());
        this.addMove(new Amnesia());
        this.addMove(new Facade());
    }
}
