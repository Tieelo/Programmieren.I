package P08_OO_KlassenvariablenUndKlassenmethoden;

public class Beleg {
    private static int enumerator = 10000;

    public Beleg(){
        belegNummer = enumerator;
        enumerator++;
        System.out.println("Neuer Beleg mit BelegNr. " + belegNummer + " wurde erstellt.");
    }
    private int belegNummer;
    public int getBelegNummer(){
        return belegNummer;
    }
}
