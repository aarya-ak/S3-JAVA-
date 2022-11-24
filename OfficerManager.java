import java.util.*;
class Employee
{
	int phonenum;
	int age;
	int salary;
	String name;
	String address;
	
	void read()
	{
		System.out.println("Name of the employe     : ");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		System.out.println("Age of the employe      :");
		age = sc.nextInt();
		System.out.println("Phone number            :");
		phonenum = sc.nextInt();
		System.out.println("Address of the employe  :");
		address = sc.next();
		System.out.println("Salary                  :");
		salary = sc.nextInt();
	}
	void display()
	{
		System.out.println("Name            :"+name);
		System.out.println("Age             :"+age);
		System.out.println("Phone number    :"+phonenum);
		System.out.println("Address         :"+address);
		System.out.println("Salary          :"+salary);
		
	}
	void print_salary()
	{
		System.out.println("Salary          :"+salary);
	}
}
class Officer extends Employee
{
	String speci;
	String depart;
	void read1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Specialization of the officer :");
		speci = sc.next();
		System.out.println("Department of the officer     :");
		depart = sc.next();
	}
	void disp()
	{
		System.out.println("Specialization  :"+speci);
		System.out.println("Department      :"+depart);
	}
}
class Manager extends Employee
{
	String speci1;
	String depart1;
	Scanner sc = new Scanner(System.in);
	void read2()
	{
		System.out.println("Specialization of the manager :");
		speci1 = sc.next();
		System.out.println("Department of the manager     :");
		depart1 = sc.next();
	}
	void disp1()
	{
		System.out.println("Specialization  :"+speci1);
		System.out.println("Department      :"+depart1);
	}
}
class OfficerManager
{
	public static void main(String args[])
	{
		Officer obj1 = new Officer();
		obj1.read();
		obj1.print_salary();
		obj1.read1();
		Manager obj2 = new Manager();
		obj2.read();
		obj2.print_salary();
		obj2.read2();
		obj1.display();
		obj1.disp();
		obj2.display();
		obj2.disp1();
		
	}
}



