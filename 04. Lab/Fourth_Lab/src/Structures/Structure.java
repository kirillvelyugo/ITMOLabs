package Structures;

import Locations.Place;
import Utils.Grade;
import Utils.TypeForm;

public abstract class Structure {
    private Place locatedIn;
    private String name;
    private Grade grade;
    private TypeForm form;

    public String getName() {
        return name;
    }

    public Place getLocatedIn() {
        return locatedIn;
    }

    public Grade getGrade() {
        return grade;
    }

    public TypeForm getForm() {
        return form;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocatedIn(Place locatedIn) {
        this.locatedIn = locatedIn;
    }

    public void setForm(TypeForm form) {
        this.form = form;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void lookLike(String look){
        System.out.println(this.name + " выглядит " + look + "\n");
    }
}
