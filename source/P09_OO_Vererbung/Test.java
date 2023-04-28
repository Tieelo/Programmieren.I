package P09_OO_Vererbung;

public class Test {
    public static void main(String[] args) {
        Person peter = new Person(57, "Peter Meier");
        peter.info();
        Arzt ariane = new Arzt(41, "Ariane Schmid", "Neurologie");
        ariane.info();
        ariane.diagnoseStellen();
    }
}
