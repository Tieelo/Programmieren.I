package P09_OO_Vererbung;

public class Mensch_ersterEntwurf {
    String name;
    int alter;
    char gender;
    String heimatPlanet;

    public Mensch_ersterEntwurf(String name, int alter, char gender) {
        this(name, alter,gender,"TrES-2b");
    }

    public Mensch_ersterEntwurf(String name, int alter, char gender, String heimatPlanet) {
        this.name = name;
        this.alter = alter;
        this.gender = gender;
        this.heimatPlanet = heimatPlanet;
    }

}
