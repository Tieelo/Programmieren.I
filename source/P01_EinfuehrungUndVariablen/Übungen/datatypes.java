package P01_EinfuehrungUndVariablen.Übungen;

public class datatypes {
    public static void main (String[] args) {
        int alter = 33;
        boolean FErlaubnis = true;
        String fahren;
        String VJahre;
        String name = "Mirco";
            if (FErlaubnis = true) {
                fahren = "Hat eine Fahrerlaubnis";
                }
            else {
                fahren = name + "Hat keine Fahrerlaubnis";
            };
            
            if ( alter > 18){
                VJahre = name + " ist volljährig";
            }
            else {
                VJahre = name + " ist nicht volljährig";
            };
        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter);
        System.out.println(fahren);
        System.out.println(VJahre);
    }
}