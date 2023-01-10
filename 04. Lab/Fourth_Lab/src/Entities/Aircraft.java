package Entities;

import Expectations.chechedExceptions.AircraftCrashedException;
import Expectations.uncheckedExceptions.NoFuelException;
import Locations.Place;
import Utils.Flyable;

public class Aircraft extends Transport implements Flyable {
    private class onBoardComputer{
        private String log = "";

        public void writeToLog (String log){
            this.log += "\n" + log;
        }

        public String getLog() {
            return log;
        }
    }

    private onBoardComputer boardComputer = new onBoardComputer();
    private double lvl_fuel = 0;
    private Entity passenger;

    public Aircraft(String name, Place location) {
        super(name, location);
    }

    public void setLvl_fuel(double lvl_fuel) {
        this.lvl_fuel = lvl_fuel;
    }

    public double getLvl_fuel() {
        return lvl_fuel;
    }

    public void printBoardComputer(){
        System.out.println("---FLIGHT LOG---");
        System.out.println(boardComputer.getLog());
        System.out.println("---FLIGHT LOG---");
    }

    public void setPassenger (Entity passenger){
        if (this.passenger == null){
            this.passenger = passenger;
            System.out.println("В самолет сел " + passenger.getName() + "\n");
            boardComputer.writeToLog("В самолет сел " + passenger.getName());
        }else if (this.passenger.equals(passenger)){
            System.out.println("В самолете уже сидит " + passenger.getName() + "\n");
        }

    }

    public Entity getPassenger() {
        return passenger;
    }

    @Override
    public void takeOff(Place direction) throws NoFuelException{
        if (this.lvl_fuel != 100){
            boardComputer.writeToLog("Самолет не смог взлететь, так как для взлета нужен полный бак! Уровень топлива равен = " + this.lvl_fuel);
            throw new NoFuelException("Самолет не смог взлететь, так как для взлета нужен полный бак! Уровень топлива равен = " + this.lvl_fuel + "\n");
        }

        System.out.printf(this.getName() + " взлетел из " + this.location.getName() + "и отправился в " + direction.getName() + "!\n");
        boardComputer.writeToLog(this.getName() + " взлетел из " + this.location.getName() + "и отправился в " + direction.getName() + "!");
        this.direction = direction;
        this.lvl_fuel -= 15;
    }

    @Override
    public void fly(){
        System.out.println(this.getName() + " летит в " + this.direction.getName() + "\n");
        boardComputer.writeToLog(this.getName() + " летит в " + this.direction.getName());

        this.lvl_fuel -= 10;
    }

    @Override
    public void land() throws AircraftCrashedException {
        if (direction.getAbilityLand()){
            this.lvl_fuel -= 15;
            this.location = direction;
            this.direction = null;

            passenger.setLocation(location);
            this.passenger = null;

            boardComputer.writeToLog("Посадка прошла успешно! Самолет сел в " + location.getName());
            System.out.printf("Посадка прошла успешно! Самолет сел в " + location.getName() + "\n");
        }else{
            boardComputer.writeToLog(this.getName() + " потрепел крушение");
            throw new AircraftCrashedException(this.getName() + " потрепел крушение" + "\n" + boardComputer.getLog());
        }
    }

    @Override
    public void changeDirection(Place direction){
        if (this.direction.hashCode() != direction.hashCode()){
            this.direction = direction;
            this.lvl_fuel -= 10;
            boardComputer.writeToLog(this.getName() + " успешно сменил направление на " + direction.getName());
            System.out.println(this.getName() + " успешно сменил направление на " + direction.getName() + "\n");
        }else{
            boardComputer.writeToLog("Мы летим в том же направлении в " + this.direction.getName());
            System.out.println("Мы летим в том же направлении в " + this.direction.getName() + "\n");
        }

    }
}
