package Locations;

import Utils.Visible;
import Utils.WeatherType;

import java.util.Objects;

public abstract class Place implements Visible {
    private String name = "Unnamed";
    private WeatherType weatherType = null;
    private final int x;
    private final int y;

    public Place(String name, int x, int y){
        if (name != null){
            this.name = name;
        }
        this.x = x;
        this.y = y;
    }

    public void setWeatherType(WeatherType weatherType){
        this.weatherType = weatherType;
    }

    public String getName(){
        return this.name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String getView(){
        return name + " at cords " + x + " " + y;
    }


    @Override
    public String toString() {
        return "Place: " + this.name + "\nWeather: " + this.weatherType + "\nCords: (" + this.x + "," + this.y + ") + \n";
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

        Place other = (Place) oth;
        return name.equals(other.name) && weatherType.equals(other.weatherType) && x == other.x && y == other.y;
    }
}
