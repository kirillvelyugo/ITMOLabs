package Utils;

import Expectations.chechedExceptions.AircraftCrashedException;
import Expectations.uncheckedExceptions.NoFuelException;
import Locations.Place;

public interface Flyable {
    public void takeOff(Place directory) throws NoFuelException;
    public void fly();
    public void land() throws AircraftCrashedException;
    public void changeDirection(Place directory);
}
