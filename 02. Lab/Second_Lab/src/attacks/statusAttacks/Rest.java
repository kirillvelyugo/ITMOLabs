package attacks.statusAttacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove
{
    public Rest(){
        super(Type.NORMAL,0,0);

    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        pokemon.restore();
        pokemon.addEffect(e);

        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe()
    {
        return "Применяет Rest";
    }
}
