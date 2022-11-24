import java.util.*;
class Details
{
	String name;
	int rollnum;
	int marks[] = new int[5];
	
	void read()
	{
		System.out.println("Name of the student");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("Roll number :");
		rollnum = sc.nextInt();
		System.out.println("Marks obtained :");
		for(int i=0;i<5;i++)
		marks[i] = sc.nextInt();
	}
	void display()
	{
		System.out.println("Name of the student :"+name);
		System.out.println("Roll number :"+rollnum);
		System.out.println("Marks obtained :");
		for(int i=0;i<5;i++)
		System.out.println(marks[i]);
	}
}
class Student 
{
	public static void main(String args[])
	{
		Details obj = new Details();
		obj.read();
		obj.display();
	}
}
