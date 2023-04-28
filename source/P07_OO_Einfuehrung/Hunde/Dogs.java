package P07_OO_Einfuehrung.Hunde;

import java.util.Arrays;

public class Dogs {
    public static void main (String[] args){
        DogObject dog1 = new DogObject("Bello","big",5,"black");
        DogObject dog2 = new DogObject("Fluffy","medium",7,"gold");
        DogObject dog3 = new DogObject("Amy","small",15,"white");
        DogObject dog4 = new DogObject("Zoe","small",13,"brown");

        DogObject[] Cage = new DogObject[] {dog1, dog2, dog3, dog4};

        for (int i = 0; i<Cage.length; i++){
            System.out.println("Hund " + (i+1)+ ":" + Cage[i].name); //Aufruf des Namens
            Cage[i].properties();//Aufruf aller Eigenschaften
            if (Cage[i].color.equals("black")){ //Bedingung, dass der Hund schwarz sein muss
                System.out.println(Cage[i].name + " is black!");
            }
        }
    }
}
