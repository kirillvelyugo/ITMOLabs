package Entities;

import Locations.Place;
import Utils.Locatable;

import java.util.Objects;

public abstract class Transport implements Locatable{
    private final String name;
    Place location;
    Place direction;

    public Transport (String name, Place location){
        this.name = name;
        this.location = location;
    }

    public void setLocation(Place place){
        this.location = place;
    }

    public Place getLocation(){
        return this.location;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Transport: " + name + " location: " + location + "\n";
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

        Transport other = (Transport) oth;
        return name.equals(other.name);
    }
}
