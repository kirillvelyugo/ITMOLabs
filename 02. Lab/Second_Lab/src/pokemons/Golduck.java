package pokemons;

import attacks.specialAttacks.FocusBlast;
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
