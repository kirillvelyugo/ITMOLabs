package Entities;

import Locations.Place;
import Utils.Locatable;

import java.util.Objects;

public abstract class Entity implements Locatable{
    private final String name;
    private Place location;

    public Entity(String name, Place location){
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Place getLocation() {
        return location;
    }

    public void setLocation(Place place){
        this.location = place;
    }

    @Override
    public String toString() {
        return "Entity: " + this.name + "\nLocation: " + this.location.getName() + "\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object oth) {
        if (this == oth) return true;
        if (oth == null) return false;
        if (!oth.getClass().equals(this.getClass())) return false;

        Entity other = (Entity) oth;
        return name.equals(other.name) && location.equals(other.location);
    }
}
