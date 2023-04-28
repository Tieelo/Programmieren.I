package P07_OO_Einfuehrung.SparbuchUebung.P07_OO_Einfuehrung.SparbuchUebung;

public class Sparbuch {
    int Kontonummer;
    double Kapital;
    double Zinssatz;

    Sparbuch(int Kontonummer, double Kapital, double Zinssatz){
        this.Kontonummer = Kontonummer;
        this.Kapital = Kapital;
        this.Zinssatz = Zinssatz;
    }

    void zahleEin(double Einzahlung){
        if (Einzahlung > 0) {
            this.Kapital += Einzahlung;
            //this.Kapital = this.Kapital + Einzahlung;
            System.out.printf("Der neue Kontostand beträgt %.2f€ \n", this.Kapital);
        }else{
            System.out.println("Nur positive Werte erlaubt");
        }
    }

    void hebeAb(double Abhebung){
        if (Abhebung > 0 && this.Kapital > 0 && (this.Kapital-Abhebung)>0) {
            this.Kapital -= Abhebung;
            //this.Kapital = this.Kapital - Abhebung;
            System.out.printf("Der neue Kontostand beträgt %.2f€ \n", Kapital);
        } else if(this.Kapital <= 0 || this.Kapital-Abhebung < 0){
            System.out.printf("Ihr Kapital reicht dafür nicht aus! \n Vorhandenes Kapital: %.2f", this.Kapital);
        }else{
            System.out.println("Nur positive Werte erlaubt \n");
        }
    }

    double getErtrag(int Jahre){
        double Zfaktor = 1 + (Zinssatz/100);
        double Endkapital = this.Kapital * Math.pow(Zfaktor, Jahre);
        return Endkapital;
    }
    void verzinse(){
        this.Kapital = this.Kapital * (1+(Zinssatz/100));
        System.out.printf("Ihr Kapital beträgt nun %.2f€ \n", this.Kapital);
    }
    int getKontonummer(){
        return this.Kontonummer;
    }

    double getKapital(){
        return this.Kapital;
    }

    double getZinssatz(){
        return this.Zinssatz;
    }

}
