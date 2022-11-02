package pokemons;

import attacks.physicalAttacks.BodySlam;
import attacks.physicalAttacks.RockSlide;
import attacks.physicalAttacks.Tackle;
import attacks.specialAttacks.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Miltank extends Pokemon
{
    public Miltank (String name, int lvl)
    {
        super(name, lvl);

        // set stats
        this.setStats(95, 80, 105, 40, 70, 100);
        this.setType(Type.NORMAL);

        // add attacks
        this.addMove(new Tackle());
        this.addMove(new RockSlide());
        this.addMove(new BodySlam());
        this.addMove(new Thunder());
    }
}
