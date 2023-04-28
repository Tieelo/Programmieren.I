package P07_OO_Einfuehrung.Peer_Martin_Lindner;

public class TestDoggo
{

    // reference charts: https://www.101dogbreeds.com/coat/colors

    // btw. just to clarify, personally, I'm more of a (song) bird person
    // and of course there's probably not one marsupial I don't like

    public static void main(String[] args)
    {

        // Step #1: Create several Dogs...
        Doggo KT = new Doggo(2, "Weimaraner",
                             "Karl-Theodor Maria Nikolaus Johann Jacob Philipp Franz Joseph Sylvester Buhl-Freiherr von und zu Guttenberg",
                             "Blue", "Big");
        Doggo Mck   = new Doggo(15, "Pembroke Welsh Corgi", "Muick", "Sable", "Medium");
        Doggo Snd   = new Doggo(15, "Pembroke Welsh Corgi", "Sandy", "Sable", "Medium");
        Doggo Bibab = new Doggo(4, "Pomeranian", "Bibby Babbis", "Sable", "Medium");
        Doggo Snpy  = new Doggo(3, "English Beagle", "Snoopy", "Tan and white", "Medium");
        Doggo Rhp   = new Doggo(5, "Bohemian Shepherd", "Rhapsody", "Black", "Medium");
        Doggo FrTbt = new Doggo(4, "Tibetan Mastiff", "Tenzin Tsundue", "Black", "Big");

        // ...and store them in an array.
        Doggo[] yoDawg = {KT, Mck, Snd, Bibab, Snpy, Rhp, FrTbt};

        // Step #2: Iterate over the array and display the breed of each dog.
        for (Doggo dawg : yoDawg) {
            System.out.println(dawg.getBreed());
        }
        // Step #3: Iterate over the array and display all properties of each dog.
        for (Doggo dawg : yoDawg) {
            System.out.println("------------------------------------------------");
            System.out.println(dawg.toString());
        }

        System.out.println("------------------------------------------------");
        // Step #4: Iterate over the array and display only the black dogs.
        for (Doggo dawg : yoDawg) {
            if (dawg.getColour().equalsIgnoreCase("black")) {
                System.out.println(dawg.getName() + " is a " + dawg.getColour().toLowerCase() + " doggo.");
            }
        }

        // not part of the assignment but let's do it anyway
        System.out.println("------------------------------------------------");

        System.out.println(Bibab.getName() + " calls their brethren and sistren: ");
        Bibab.callToBrethrenAndSistren();
        System.out.println();
        KT.poo();
    }
}
