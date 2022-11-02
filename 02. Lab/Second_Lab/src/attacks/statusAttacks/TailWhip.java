package attacks.statusAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class TailWhip extends StatusMove
{
    public TailWhip ()
    {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        pokemon.setMod(Stat.DEFENSE, -2);

        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe()
    {
        return "Применяет Tail Whip";
    }
}
