package P08_OO_KlassenvariablenUndKlassenmethoden;

public class Mensch {
    String name;
    int alter;
    char gender;
    String heimatPlanet;

    public Mensch(String name, int alter, char gender) {
        this(name, alter,gender,"TrES-2b");
    }

    public Mensch(String name, int alter, char gender, String heimatPlanet) {
        this.name = name;
        this.alter = alter;
        this.gender = gender;
        this.heimatPlanet = heimatPlanet;
    }

}
