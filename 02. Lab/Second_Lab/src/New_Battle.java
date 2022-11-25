import pokemons.New_Pokemon;
import ru.ifmo.se.pokemon.Battle;

public class New_Battle
{
    Battle b = new Battle();

    private int Count_Ally;
    private int Count_Foe;

    public New_Battle (New_Pokemon[] Ally, New_Pokemon[] Foe)
    {
        for (New_Pokemon poke : Ally)
        {
            if (poke.get_correct_lvl())
            {
                b.addAlly(poke);
                Count_Ally++;
            }
        }
        for (New_Pokemon poke : Foe)
        {
            if (poke.get_correct_lvl())
            {
                b.addFoe(poke);
                Count_Foe++;
            }
        }
    }

    public void go()
    {
        if (Count_Ally == 0 && Count_Foe == 0)
        {
            System.out.println("Невозможно начать бой. В каждой команде 0 покемонов :(");
        }
        else if (Count_Foe == 0 || Count_Ally == 0)
        {
            System.out.println("Невозможно начать бой. В одной из команд нет покемонов :(");
        }
        else
        {
            System.out.println("Бой возможен, все условия выполнены :)\n");
            b.go();
        }
    }

}
