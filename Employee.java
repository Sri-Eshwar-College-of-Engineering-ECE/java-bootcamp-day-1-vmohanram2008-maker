package mukunda;

public class Employee {
 int basicSalary;
 void calculateSalary()
 {
	 int bonus=5000;
	 int total=bonus+basicSalary;
	 System.out.println("Basic Salary: "+basicSalary);
	 System.out.println("Bonus: "+bonus);
	 System.out.println("Tolal Salary: "+total);
	 
 }
	public static void main(String[] args) {
		Employee Salary=new Employee();
		Salary.basicSalary=30000;
        Salary.calculateSalary();
	}

}
