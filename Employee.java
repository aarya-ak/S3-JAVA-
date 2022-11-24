import java.util.*;
class Details
{
	String name;
	int phonenum;
	int empno;
	int arr;
	void read()
	{
		System.out.println("Employee number     : ");
		Scanner sc = new Scanner(System.in);
		empno = sc.nextInt();
		System.out.println("Name of the employe :");
		name = sc.next();
		System.out.println("Phone number        :");
		phonenum = sc.nextInt();
	}
	void display()
	{
		System.out.println("Employee number     : "+empno);
		System.out.println("Name of the employe :"+name);
		System.out.println("Phone number        :"+phonenum);
		System.out.println(" ");
		
		
	}
}
class Employee
{
	public static void main(String args[])
	{
		Details arr[] = new Details[5];
		for(int i =0;i<5;i++)
		{
			arr[i] = new Details();
			arr[i].read();
		}
		for(int i =0;i<5;i++)
			arr[i].display();
	}
}



