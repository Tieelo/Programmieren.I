package P10_OO_Interfaces.UebungGeo;

public class GeoTest {


    public static void main (String[]args){
        Kreis Kreis1 = new Kreis(5);
        Dreieck Dreieck1 = new Dreieck(5, 3);
        int vergleich = GeoVergleich.vergleiche(Dreieck1, Kreis1);

        System.out.println(vergleich);
    }

}
