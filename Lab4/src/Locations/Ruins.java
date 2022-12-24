package Locations;

import Utils.Grade;

public class Ruins extends Place{
    private Grade gradeRuins;

    public Ruins(String name, int x, int y, boolean abilityLand) {
        super(name, x, y, abilityLand);
    }

    public Grade getGradeRuins() {
        return gradeRuins;
    }

    public void setGradeRuins(Grade gradeRuins) {
        this.gradeRuins = gradeRuins;
    }
}


