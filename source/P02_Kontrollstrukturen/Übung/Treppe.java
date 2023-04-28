package P02_Kontrollstrukturen.Übung;

public class Treppe {
    public static void main (String [] args){
        int b, h;
        b = 3;
        h = 10;
        for (int reihe = 1; reihe <= h; reihe++){   //Höhenschleife
            for (int laenge = 1; laenge <= h*b; laenge++){
                int leerzeichen = (h*b) - (reihe*b);
                if (laenge <= leerzeichen){
                    System.out.print(" ");
                }
                else if (laenge > leerzeichen && laenge <= h*b) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}

