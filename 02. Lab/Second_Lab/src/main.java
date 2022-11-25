import ru.ifmo.se.pokemon.*;
import pokemons.*;

// Lab2 var. 874290

public class main{
    public static void main(String[] args)
    {

        Miltank miltank = new Miltank("Счастливая корова", 3434);
        Psyduck psyduck = new Psyduck("Утка-кря", 101);
        Golduck golduck = new Golduck("Монстрик", -1);
        Lotad lotad = new Lotad("Кувшинка", 101);
        Lombre lombre = new Lombre("Кувшимби", 101);
        Ludicolo ludicolo = new Ludicolo("Яйцешинка", 3434);

        System.out.println();

        New_Pokemon[] Foe = {miltank, psyduck, golduck};
        New_Pokemon[] Ally = {lotad, lombre, ludicolo};

        New_Battle battle = new New_Battle(Foe, Ally);
        battle.go();
    }
}
