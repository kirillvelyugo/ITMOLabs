import Creatures.Character;
import Locations.*;
import Utils.WeatherType;

public class Main {
    public static void main(String[] args) {
        Character ch = new Character("Мы", true);

        // Creating locations
        City city = new City("Санкт-Петербург", 1000, 900, 15000, 20000, 150678);
        city.setWeatherType(WeatherType.FOG);

        IceDesert ice = new IceDesert("Голая ледяная пустыня", 500, 400);
        city.setWeatherType(WeatherType.FROZEN);

        River river = new River("Нева", 550, 600);
        river.setType(River.TypeRiver.STORMY);
        river.setWeatherType(WeatherType.SUNNY);

        Ruins ruins = new Ruins("Руины", 700, 650);
        ruins.setWeatherType(WeatherType.FOG);
        ruins.setGradeRuins(Ruins.Grade.BAD);

        FootHills footHills = new FootHills("Предгорье", 800, 750);
        footHills.setWeatherType(WeatherType.SUNNY);

        // Moving character
        ch.setLocation(city);
        System.out.println("Count buildings is: " + city.getCountBuildings() + "\n");
        ch.lookAt(ch.getLocation());

        ch.setLocation(ice);
        ch.lookAt(ch.getLocation());

        ch.setLocation(river);
        ch.lookAt(river);

        ch.setLocation(ruins);
        ch.lookAt(ruins);

        ch.setLocation(footHills);
        ch.lookAt(footHills);

    }
}
