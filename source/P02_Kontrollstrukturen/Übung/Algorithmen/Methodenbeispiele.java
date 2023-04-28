package P02_Kontrollstrukturen.Übung.Algorithmen;

import java.util.Random;

public class Methodenbeispiele {
    public static void main (String[] args){

        Random random = new Random();
        int[] index = new int[50];
        for (int i = 0; i <index.length; i++){
            index[i] = random.nextInt(9999);
        }
    }
}
