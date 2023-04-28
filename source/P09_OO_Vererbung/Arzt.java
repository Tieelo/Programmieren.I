package P09_OO_Vererbung;

public class Arzt extends Person {
    String fachgebiet;

    public Arzt(int age, String name, String fachgebiet) {
        super(age, name);
        this.fachgebiet = fachgebiet;
    }

    public void diagnoseStellen() {
        System.out.println("Sie haben nervöse Zuckungen");
    }

    @Override
    public void info() {
        super.info();
        System.out.println(" mein Fachgebiet ist " + this.fachgebiet);
    }
}
