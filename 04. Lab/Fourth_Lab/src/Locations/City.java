package Locations;

public class City extends Place{
    private final int length;
    private final int width;
    private final int countBuildings;

    public City(String name, int x, int y, int length, int width, int countBuildings, boolean abilityLand){
        super(name, x, y, abilityLand);
        this.length = length;
        this.width = width;
        this.countBuildings = countBuildings;
    }

    public int calcArea (){
        return this.length * this.width;
    }

    public int getCountBuildings(){
        return this.countBuildings;
    }
}
