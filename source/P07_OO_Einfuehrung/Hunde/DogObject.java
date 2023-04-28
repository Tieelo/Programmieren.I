package P07_OO_Einfuehrung.Hunde;

public class DogObject {
    String name;
    String size;
    int age;
    String color;

    DogObject(String name, String size, int age, String color){
        this.name = name;
        this.size = size;
        this.age = age;
        this.color = color;
    }
    public void eat() {
        System.out.println("chewing sound");
    }

    public void sleep() {
        System.out.println("snort");
    }

    public void bark() {
        System.out.println("barking noise");
    }
    public void properties() {
        System.out.printf(" Name : %s \n Größe: %s \n Alter: %d \n Farbe: %s \n", name, size, age, color);
    }
}
