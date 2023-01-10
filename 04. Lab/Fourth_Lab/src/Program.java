import Entities.Aircraft;
import Entities.We;
import Expectations.uncheckedExceptions.NoFuelException;
import Locations.*;
import Structures.Structure;
import Utils.Grade;
import Utils.TypeMaterial;
import Utils.TypeRiver;
import Utils.WeatherType;


// var. 328292

public class Program {
    public static void main(String[] args) {
        // Creating locations
        City city = new City("Санкт-Петербург", 1000, 540, 15000, 4333, 15432, true);
        Suburb suburb = new Suburb("Пригород", 1100, 700, true, city);
        IceDesert iceDesert = new IceDesert("Голая ледяная пустыня", 1450, 900, true);
        River river = new River("Бурная река", 1700, 800, false);
        FootHills footHills = new FootHills("Предгорье", 1500, 1000, true);
        Ruins ruins = new Ruins("Старинные руины", 1700, 1200, false);

        // Creating structures
        Structure building = new Structure() {
            final String name = "Постройки";
            final int height = 100;
            final TypeMaterial material = TypeMaterial.STONE;

            public int getHeight() {
                return height;
            }

            public TypeMaterial getMaterial() {
                return material;
            }

            @Override
            public void lookLike(String look){
                System.out.println(name + " из " + material + " и выглядит " + look + ". Высота: " + height + "\n");
            }
        };

        Structure fortress = new Structure() {
            final String name = "Оборонительные сооружения";
            final TypeMaterial material = TypeMaterial.WOOD;

            public TypeMaterial getMaterial() {
                return material;
            }

            @Override
            public void lookLike(String look){
                System.out.println(name + " из " + material + " и выглядит " + look + "\n");
            }
        };

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
        We we = new We("Мы", city, We.TypeStatus.NORMAL);
        System.out.println(we);

        // Actions
        plane.setPassenger(we);
        // Check equals
        plane.setPassenger(we);
        try{
            plane.takeOff(iceDesert);
        }catch (NoFuelException e){
            System.out.println(e.getMessage());
            System.out.println("---Заправляем " + plane.getName() + "---");
            plane.setLvl_fuel(100);
            try{
                plane.takeOff(iceDesert);
            }catch (NoFuelException e1){
                System.out.println(plane.getName() + " никак не может взлететь \n");
            }
        }
        plane.fly();


        we.sayPhrase("Очередная бесмысленная фраза");

        we.changeStatus(We.TypeStatus.DIZZY);
        System.out.println("У " + we.getName() + " состояние изменилось на " + we.getStatus() + "\n");

        String [] thoughts = {"Древние мифы", " демоническое плато Ленг", "Ми-Го", "омерзительный снежный человек с Гималаев",
        "Пнакотические рукописи с содержащимися там намеками на их \"нечеловеческое\" происхождение", "культ Ктулху, \"Некрономикон\"",
        "гиперборейские легенды о бесформенном Цатогуа звездных пришельцах, еще более аморфных"};
        we.thinkAbout(thoughts);

        we.stumbleUpon(suburb);
        System.out.println(suburb.getName() + " является частью " + suburb.getPartOf().getName() + "\n");

        building.setLocatedIn(footHills);
        fortress.setLocatedIn(footHills);

        building.lookLike("Фантастически");
        fortress.lookLike("Крепостные валы");

        plane.changeDirection(river);
        we.lookAt(river);
        System.out.println("\nИнформация о " + river.getName() + ":\n" + river);
//        plane.land();

        plane.changeDirection(footHills);
        // Check hashcode
        plane.changeDirection(footHills);
        we.lookAt(footHills);
        System.out.println("\nИнформация о " + footHills.getName() + ":\n" + footHills);

        plane.land();
        System.out.println(we);

        we.lookAround(footHills);
        we.leaveTransport(plane);
        we.walk();

        plane.setPassenger(we);
        try{
            plane.takeOff(city);
        }catch (NoFuelException e){
            System.out.println(e.getMessage());
            System.out.println("---Заправляем " + plane.getName() + "---");
            plane.setLvl_fuel(100);
            try{
                plane.takeOff(city);
            }catch (NoFuelException e1){
                System.out.println(plane.getName() + " никак не может взлететь \n");
            }
        }
        plane.fly();
        plane.printBoardComputer();

    }

}
