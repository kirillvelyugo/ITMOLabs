package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide ()
    {
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected void applyOppEffects (Pokemon pokemon){
        if (Math.random() <= 0.3) Effect.flinch(pokemon);

        super.applyOppEffects(pokemon);
    }


    @Override
    protected String describe(){
        return "применяет Rock Slide";
    }
}
