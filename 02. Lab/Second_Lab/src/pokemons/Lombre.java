package pokemons;

import attacks.physicalAttacks.ZenHeadbutt;

public class Lombre extends Lotad
{
    public Lombre (String name, int lvl)
    {
        super(name, lvl);

        // set stats
        this.setStats(60, 50, 50, 60, 70, 50);

        // add attacks
        this.addMove(new ZenHeadbutt());
    }
}
