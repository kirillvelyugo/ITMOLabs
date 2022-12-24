package Entities;

import Locations.Place;

public class We extends Entity {

    public We(String name, Place location) {
        super(name, location);
    }

    public void getClear (){
        System.out.println(this.getName() + " стало ясно\n");
    }

    public void lookAround (Place location){
        System.out.println(this.getName() + " осмотрелся вокруг " + location.getName());
    }

    public void lookAt (Place location){
        System.out.println(this.getName() + " смотрит на " + location.getName());
    }

    public void walk (Place location){
        System.out.println(this.getName() + " отправился в прогулку в " + location.getName());
    }

    public void leaveTransport (Transport transport){
        System.out.println(this.getName() + " оставил " + transport.getName() + "\n");
    }
}
