package P09_OO_Vererbung;

public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void info() {
        System.out.println("Ich bin " + this.name + " und bin " + this.age);
    }
}
