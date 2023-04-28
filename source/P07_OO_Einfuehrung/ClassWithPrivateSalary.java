package P07_OO_Einfuehrung;

public class ClassWithPrivateSalary {
	private int salary;

	// a setter method that checks the value for the salary variable, assigns if OK
	void setSalary(int s) {
		if (s > 0) {
			this.salary = s;
		} else {
			System.out.println("Nur positive Werte erlaubt");
		}
	}

	// a getter method to retrieve the salary
	int getSalary() {
		// Code zur Authentifizierung
		return this.salary;
	}
	
	// in main:
//	System.out.println("Gehalt betr�gt " + privSal.getSalary());
//	privSal.setSalary(30);
//	System.out.println("Gehalt betr�gt " + privSal.getSalary());
}
