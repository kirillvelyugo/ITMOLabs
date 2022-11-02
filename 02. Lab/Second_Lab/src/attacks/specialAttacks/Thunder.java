package attacks.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder (){
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applyOppEffects (Pokemon pokemon){
        Effect e = new Effect().chance(0.3).condition(Status.PARALYZE);
        pokemon.addEffect(e);

        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe(){
        return "применяет Thunder";
    }
}
