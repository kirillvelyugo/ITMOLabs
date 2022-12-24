package Utils;

import Locations.Place;

public interface Flyable {
    public void takeOff(Place directory);
    public void fly();
    public void land();
    public void changeDirectory(Place directory);
}
