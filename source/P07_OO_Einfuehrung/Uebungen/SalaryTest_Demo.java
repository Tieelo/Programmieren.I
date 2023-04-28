package P07_OO_Einfuehrung.Uebungen;

public class SalaryTest_Demo {

    public static void main(String[] args) {
        ClassWithPublicSalary pubSal = new ClassWithPublicSalary();
        pubSal.salary = 5100;
        System.out.println("Er/Sie verdient " +  pubSal.salary);
        pubSal.salary = -1234;
        System.out.println("Sie/Er verdient " + pubSal.salary);

        ClassWithPrivateSalary pubPrivSal = new ClassWithPrivateSalary();
    }
}
   // public class int salary;

//in main method
//	ClassWithPublicSalary obj = new ClassWithPublicSalary();
//	obj.salary = -50000;