package P07_OO_Einfuehrung.Peer_2;

public class Dog {
    private String breed;
    private String size;
    private int age;
    private String color;
    public Dog(String breed, String size, int age, String color){
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public String getBreed(){ return breed; }
    public String getSize(){ return size; }
    public String getColor(){ return color; }
    public int getAge(){ return age; }

    public void eat() {
        System.out.println("chewing sound");
    }

    public void sleep() {
        System.out.println("snort");
    }

    public void bark() {
        System.out.println("barking noise");
    }

    public String returnAllFeatures(){ return "Art: " + breed + "\nGroesse: " + size + "\nAlter: " + age + "\nFarbe: " + color;}

}
