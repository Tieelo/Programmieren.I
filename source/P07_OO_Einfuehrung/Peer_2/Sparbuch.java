package P07_OO_Einfuehrung.Peer_2;

public class Sparbuch {
    private String kontoNummer;
    private double kapital;
    private double zinsSatz;

    public Sparbuch(String kontoNummer, double zinsSatz){
        this.kontoNummer = kontoNummer;
        kapital = 0;
        this.zinsSatz = zinsSatz;
    }

    public double getKapital(){ return kapital; }
    public String getKontoNummer(){ return kontoNummer; }
    public double getZinsSatz(){ return zinsSatz; }
    public void setZinsSatz(double zinsSatz){ this.zinsSatz = zinsSatz; }

    /**
     * Addiert den angegebenen Wert auf das aktuelle Kapital des Sparbuchs
     * @param betrag Die höhe der Einzahlung
     */
    public void zahleEin(double betrag){
        kapital += betrag;
    }

    /**
     * Subtrahiert den angegebenen Wert vom aktuellen Kapital des Sparbuchs
     * @param betrag Die höhe der Einzahlung
     */
    public void hebeAb(double betrag){
        kapital -= betrag;
    }

    /**
     * Bestimmt das Kapital auf dem Sparbuch nach einer angegebenen anzahl an Jahren bei einem festgelegten Zinssatz
     * @param years Die Anzahl der laufenden Jahr
     * @return Der Wert nach der angegebenen Anzahl an Jahren
     */
    public double getErtrag(int years){
        return kapital * Math.pow(zinsSatz,years);
    }

    /**
     * Bestimmt das Kapital auf dem Sparbuch nach genau einem Jahr und speichert das als neuen Wert des Kapitals
     */
    public void verzinse(){
        kapital *= zinsSatz;
    }
}
