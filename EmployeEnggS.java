class Employee 
{
	void display()
	{
		System.out.println("Name of class is Employee");
	}
	void calcSalary()
	{
		System.out.println("Salary of employee is 10000");
	}
}
class Engineer extends Employee
{
	void display()
	{
		
		System.out.println("Name of class is Engineer");
	}
	void calcSalary()
	{
		
		System.out.println("Salary of employee is 20000");
	}	
	void Prgm()
	{
		super.display();
		super.calcSalary();
		display();
		calcSalary();
	}		
}

class EmployeEnggS
{
	public static void main(String[] args)
	{
		Engineer obj = new Engineer();
		obj.Prgm();
		
	}
}
		
