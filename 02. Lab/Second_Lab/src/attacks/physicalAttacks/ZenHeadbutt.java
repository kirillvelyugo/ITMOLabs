package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ZenHeadbutt extends PhysicalMove {
    public ZenHeadbutt(){
        super(Type.PSYCHIC, 80, 90);
    }

    @Override
    protected void applyOppEffects (Pokemon pokemon){
        if (Math.random() <= 0.2) Effect.flinch(pokemon);

        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe(){
        return "применяет Zen Headbutt";
    }
}
