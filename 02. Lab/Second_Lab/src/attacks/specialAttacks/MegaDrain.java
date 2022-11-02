package attacks.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class MegaDrain extends SpecialMove {
    public MegaDrain (){
        super(Type.GRASS, 40, 100);
    }

    @Override
    protected void applySelfDamage (Pokemon pokemon, double damage){
        pokemon.setMod(Stat.HP, - (int) (damage * 0.5));
    }

    @Override
    protected String describe(){
        return "применяет Mega Drain";
    }
}
