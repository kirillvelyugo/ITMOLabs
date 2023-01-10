package Entities;

import Locations.Place;

public class We extends Entity {
    public enum TypeStatus {
        NORMAL,
        DIZZY,
        SICK,
    }

    private TypeStatus status;

    public We(String name, Place location, TypeStatus status) {
        super(name, location);
        this.status = status;
    }

    public void sayPhrase (String phrase){
        System.out.println(this.getName() + " сказал: " + phrase + "\n");
    }

    public void changeStatus (TypeStatus status){
        this.status = status;
    }

    public void thinkAbout (String [] thoughts){
        class Think {
            private String[] text;

            public String[] getText() {
                return text;
            }

            public void setText(String[] text) {
                this.text = text;
            }

            public void think(){
                System.out.print(getName() + " подумал о ");

                for (String thought : thoughts){
                    System.out.print(thought + "; ");
                }
                System.out.println("\n");
            }
        }

        Think think = new Think();
        think.setText(thoughts);
        think.think();
    }

    public void stumbleUpon (Place place){
        System.out.println(this.getName() + " наткнулся на " + place.getName() + "\n");
    }


    public TypeStatus getStatus() {
        return status;
    }

    public void lookAround (Place location){
        System.out.println(this.getName() + " осмотрелся вокруг " + location.getName());
    }

    public void lookAt (Place location){
        System.out.println(this.getName() + " смотрит на " + location.getName());
    }

    public void walk (){
        System.out.println(this.getName() + " отправился в прогулку в " + this.getLocation().getName());
    }

    public void leaveTransport (Transport transport){
        System.out.println(this.getName() + " оставил " + transport.getName() + "\n");
    }
}
