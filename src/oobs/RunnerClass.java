package oobs;

public class RunnerClass {

	public static void main(String[] args)
	
	{
Employee emp1 = new Employee();
emp1.Name = "Sachin";
emp1.EmployeeID = 13501223;
emp1.Salary = 1000;


Employee emp2 = new Employee();

emp2.Name = "Monu";
emp2.EmployeeID = 13501224;
emp2.Salary = 2000;

//System.out.println("Name of emp1 " + emp1.Name );
//System.out.println("Name of emp2 " + emp2.Name );

emp1.PrintName();
emp2.PrintName();

	}
}