package pokemons;

import attacks.physicalAttacks.BodySlam;
import attacks.physicalAttacks.RockSlide;
import attacks.physicalAttacks.Tackle;
import attacks.specialAttacks.FocusBlast;
import attacks.specialAttacks.Thunder;
import ru.ifmo.se.pokemon.*;


public class Golduck extends Psyduck
{
    public Golduck(String name, int lvl)
    {
        super(name, lvl);

        // set stats
        this.setStats(80, 82, 78, 95, 80, 85);

        // add attacks
        this.addMove(new FocusBlast());
    }
}
