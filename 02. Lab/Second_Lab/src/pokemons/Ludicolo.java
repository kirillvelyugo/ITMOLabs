package pokemons;

import attacks.specialAttacks.MegaDrain;

public class Ludicolo extends Lombre
{
    public Ludicolo (String name, int lvl)
    {
        super(name, lvl);

        // add stats
        this.setStats(80, 70, 70, 90, 100, 70);

        // add attacks
        this.addMove(new MegaDrain());
    }
}
