import java.util.Scanner;
public class VoltCruiser {
    Scanner in = new Scanner(System.in);
    String Kennzeichen;
    int Ladezustand;
    int Ladezustand_max = 50;

    VoltCruiser(String kennzeichen, int Ladezustand){
        this.Ladezustand = Ladezustand;
        this.Kennzeichen = Kennzeichen;
    }
    public void laden(){
        if (Ladezustand == Ladezustand_max){
            System.out.println("Das Auto ist bereits voll");
        }else{
            System.out.println("Wie viel möchten sie laden?");
            int ladeMenge = in.nextInt();
            if ((Ladezustand + ladeMenge) >= Ladezustand_max){
                Ladezustand = Ladezustand_max;
            }else{
                Ladezustand = Ladezustand + ladeMenge;
            }
            System.out.println("Der Ladezustand beträgt jetzt "+Ladezustand);
        }
    }
    public void drive(){
        int driveDistance;
        System.out.println("Wie weit möchten sie fahren? (1km = 1kwh)");
        driveDistance = in.nextInt();
        if (driveDistance <= Ladezustand){
            System.out.println("Wir fahren los!");
            Ladezustand = Ladezustand - driveDistance;
            System.out.println("Der neue Ladezustand beträgt "+Ladezustand);
        }else{
            System.out.println("Der Ladezustand reicht dafür nicht aus!");
        }
    }
    public void LadezustandsPrüfung(){
        if (Ladezustand <= 5){
            System.out.println(" Zu wenig Akku um los zu fahren");
        }else{
            System.out.println("das Auto fährt");
        }
    }
}
