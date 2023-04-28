package P07_OO_Einfuehrung.Peer_2;

public class Control {
    public static void main(String[] args) {
        taskDogs();
        //taskSparbuch();
    }
    private static void taskDogs(){
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Hund 1","Klein",5,"Braun");
        dogs[1] = new Dog("Hund 2","Mittel",5,"Weiss");
        dogs[2] = new Dog("Hund 3","Gross",5,"Schwarz");
        for (Dog dog: dogs) { // Alle Hunderassen ausgeben
            System.out.println(dog.getBreed());
        }
        System.out.printf("_______________________________________\n\n"); // Zeilenumbruch
        for (Dog dog: dogs) { // Methode für Ausgabe alle Parameter aller Hunde aufrufen
            System.out.println(dog.returnAllFeatures() + "\n");
        }
        System.out.printf("_______________________________________\n\n");
        for (Dog dog: dogs) { // Methode für Ausgabe alle Parameter der schwarzen Hunde aufrufen
            if (dog.getColor().equals("Schwarz")) {
                System.out.println(dog.returnAllFeatures() + "\n");
            }
        }
    }

    private static void taskSparbuch(){
        Sparbuch sparbuch = new Sparbuch("DE651224411",1.005);
        System.out.println(sparbuch.getKapital());
        System.out.println(sparbuch.getKontoNummer());
        System.out.println(sparbuch.getZinsSatz());
        sparbuch.zahleEin(1000.0);
        System.out.println(sparbuch.getErtrag(5) + "");
        System.out.println(sparbuch.getKapital());
        sparbuch.hebeAb(200.0);
        System.out.println(sparbuch.getKapital());
        sparbuch.verzinse();
        System.out.println(sparbuch.getKapital());    }
}
