package P02_Kontrollstrukturen.Übung;

public class einmaleins {
    public static void main (String [] args){
        for (int i = 1; i <= 10; i++){
            for (int z = 1; z <= 10; z++){
                int value = i*z;
                String space =" ";
                String space_before = "";
                if (value < 10) {
                    space_before = " ";
                    space = "  ";
                }
                else if (value >= 10 && value < 90) {
                    space = "  ";
                }
                System.out.print(space_before + i*z + space);
                if (z == 10){
                    System.out.print("\n");
                }
            }
        }
    }
}
