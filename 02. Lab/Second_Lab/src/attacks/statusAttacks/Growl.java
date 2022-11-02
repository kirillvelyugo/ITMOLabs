package attacks.statusAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Growl extends StatusMove
{
    public Growl ()
    {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        pokemon.setMod(Stat.ATTACK, -2);

        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe()
    {
        return "Применяет Growl";
    }
}
