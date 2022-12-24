package Locations;

import Utils.TypeRiver;

public class River extends Place{
    private TypeRiver type;

    public River(String name, int x, int y, boolean abilityLand) {
        super(name, x, y, abilityLand);
    }

    public void setType(TypeRiver type){
        this.type = type;
    }

    public TypeRiver getType(){
        return this.type;
    }

}
