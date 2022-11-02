package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove
{
    public Facade ()
    {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage (Pokemon pokemon, double damage)
    {
        if (pokemon.getCondition().equals(Status.BURN) || pokemon.getCondition().equals(Status.POISON) || pokemon.getCondition().equals(Status.PARALYZE))
        {
            pokemon.setMod(Stat.HP, 2 * (int) Math.round(damage));
        }

        super.applyOppDamage(pokemon, damage);
    }

    @Override
    protected String describe(){
        return "применяет Facade";
    }
}
