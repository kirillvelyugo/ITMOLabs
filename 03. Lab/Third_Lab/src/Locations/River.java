package Locations;

public class River extends Place{

    public enum TypeRiver {
        STORMY,
        CALM,
    }

    private TypeRiver type;

    public River(String name, int x, int y) {
        super(name, x, y);
    }

    public void setType(TypeRiver type){
        this.type = type;
    }

    public TypeRiver getType(){
        return this.type;
    }

}
