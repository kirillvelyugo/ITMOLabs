package Entities;

import Locations.Place;
import Utils.Flyable;
import Utils.Locatable;

public class Aircraft extends Transport implements Flyable {
    private double lvl_fuel = 100;
    private Entity passenger;

    public Aircraft(String name, Place location) {
        super(name, location);
    }

    public void getPassenger (Entity passenger){
        this.passenger = passenger;
        System.out.printf("В самолет сел " + passenger.getName() + "\n");
    }

    public void changePassenger (Entity passenger){
        if (this.passenger != null) {
            System.out.print("Вместо " + this.passenger.getName() + " в самолет сел " + passenger + "\n");
        } else {
            System.out.println("В самолет сел " + passenger + "\n");
        }
        this.passenger = passenger;
    }

    @Override
    public void takeOff(Place direction) {
        if (this.lvl_fuel >= 0){
            this.lvl_fuel = 100;
            System.out.printf(this.getName() + " взлетел из " + this.location.getName() + "и отправился в " + direction.getName() + "!\n");
            this.direction = direction;
            this.lvl_fuel -= 15;
        }else{
            System.out.println(this.getName() + " не может взлететь, так как уровнь топлива = " + this.lvl_fuel + "\n");
        }
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " летит в " + this.direction.getName() + "\n");
        this.lvl_fuel -= 10;
    }

    @Override
    public void land() {
        if (direction.getAbilityLand()){
            this.lvl_fuel -= 15;
            this.location = direction;
            this.direction = null;

            passenger.setLocation(location);
            this.passenger = null;

            System.out.printf("Посадка прошла успешно! Самолет сел в " + location.getName() + "\n");
        }else{
            System.out.println("Самолет не может сесть в " + direction.getName() + "\n");
        }
    }

    @Override
    public void changeDirectory(Place direction){
        this.direction = direction;
        this.lvl_fuel -= 10;
        System.out.println(this.getName() + " успешно сменил направление на " + direction.getName() + "\n");
    }
}
