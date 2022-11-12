import ru.ifmo.se.pokemon.*;
import pokemons.*;

// Lab2 var. 874290

public class main{
    public static void main(String[] args)
    {
        Battle b = new Battle();

        Miltank miltank = new Miltank("Счастливая корова", 20);
        Psyduck psyduck = new Psyduck("Утка-кря", 24);
        Golduck golduck = new Golduck("Монстрик", 12);
        Lotad lotad = new Lotad("Кувшинка", 44);
        Lombre lombre = new Lombre("Кувшимби", 43);
        Ludicolo ludicolo = new Ludicolo("Яйцешинка", 24);

        b.addAlly(miltank);
        b.addAlly(golduck);
        b.addAlly(lombre);

        b.addFoe(psyduck);
        b.addFoe(lotad);
        b.addFoe(ludicolo);

        b.go();
    }
}
