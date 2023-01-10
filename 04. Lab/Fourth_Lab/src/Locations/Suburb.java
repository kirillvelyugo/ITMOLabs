package Locations;

public class Suburb extends Place{

    private City partOf;

    public Suburb(String name, int x, int y, boolean abilityLand, City partOf) {
        super(name, x, y, abilityLand);
        this.partOf = partOf;
    }

    public City getPartOf() {
        return partOf;
    }

    public void setPartOf(City partOf) {
        this.partOf = partOf;
    }
}
