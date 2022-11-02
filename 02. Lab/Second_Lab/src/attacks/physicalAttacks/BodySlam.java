package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

import java.lang.module.ModuleReference;

public class BodySlam extends PhysicalMove
{
    public BodySlam ()
    {
        super(Type.NORMAL, 85, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect e = new Effect().chance(0.3).condition(Status.PARALYZE);
        pokemon.addEffect(e);

        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe()
    {
        return "применяет Body Slam";
    }
}
