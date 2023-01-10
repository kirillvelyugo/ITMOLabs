import Entities.Aircraft;
import Entities.We;
import Locations.*;
import Utils.Grade;
import Utils.TypeRiver;
import Utils.WeatherType;

// var. 328292

public class Program {
    public static void main(String[] args) {
        // Creating locations
        City city = new City("Санкт-Петербург", 1000, 540, 15000, 4333, 15432, true);
        IceDesert iceDesert = new IceDesert("Голая ледяная пустыня", 1450, 900, true);
        River river = new River("Бурная река", 1700, 800, false);
        FootHills footHills = new FootHills("Предгорье", 1500, 1000, true);
        Ruins ruins = new Ruins("Старинные руины", 1700, 1200, false);

        // Add weather and grade
        city.setWeatherType(WeatherType.CLOUDY);
        iceDesert.setWeatherType(WeatherType.FROZEN);
        river.setWeatherType(WeatherType.FOG);
        footHills.setWeatherType(WeatherType.SUNNY);
        ruins.setWeatherType(WeatherType.CLOUDY);
        ruins.setGradeRuins(Grade.NORMAL);
        river.setType(TypeRiver.STORMY);

        // Creating transport and character
        Aircraft plane = new Aircraft("Самолетик", city);
        We we = new We("Мы", city);
        System.out.println(we);

        // Actions
        plane.setPassenger(we);
        // Check equals
        plane.setPassenger(we);
        plane.takeOff(iceDesert);
        plane.fly();

        plane.changeDirection(river);
        we.lookAt(river);
        System.out.println("\nИнформация о " + river.getName() + ":\n" + river);
        plane.land();

        plane.changeDirection(footHills);
        plane.changeDirection(footHills);
        we.lookAt(footHills);
        System.out.println("\nИнформация о " + footHills.getName() + ":\n" + footHills);

        plane.land();
        System.out.println(we);

        we.lookAround(footHills);
        we.leaveTransport(plane);
        we.walk();

        plane.setPassenger(we);
        plane.takeOff(city);
        plane.fly();


    }

}
