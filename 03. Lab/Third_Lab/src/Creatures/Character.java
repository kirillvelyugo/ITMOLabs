package Creatures;

import Locations.Locatable;
import Locations.Place;
import Utils.Visible;

public class Character implements Locatable {
    private String name;
    private boolean haveAircraft;
    Place location;

    public Character(String name, boolean haveAircraft){
        this.name = name;
        this.haveAircraft = haveAircraft;
    }

    public void lookAt (Visible obj){
        System.out.println(this.name + " looking at " + obj.getView() + "\n");
    }

    @Override
    public void setLocation(Place place) {
        if (this.haveAircraft) {
            this.location = place;
            System.out.println("Character moved to " + place.getName() + "\n");
        }
    }

    @Override
    public Place getLocation() {
        return this.location;
    }
}
