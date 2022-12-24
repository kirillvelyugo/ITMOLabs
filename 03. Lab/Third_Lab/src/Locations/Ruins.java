package Locations;

public class Ruins extends Place{

    public enum Grade {
        NORMAL,
        BAD,
        GOOD,
    }

    private Grade gradeRuins;

    public Ruins(String name, int x, int y) {
        super(name, x, y);
    }

    public Grade getGradeRuins() {
        return gradeRuins;
    }

    public void setGradeRuins(Grade gradeRuins) {
        this.gradeRuins = gradeRuins;
    }
}


