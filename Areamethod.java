import java.util.*;
class Area
{
	void area (int x)
	{
		int radius = x;
		System.out.println("Radius of the circle is "+radius+" and the area is "+(3.14*radius*radius));
	}

void area(int x,int y)
{
	int length = x;
	int breadth = y;
	System.out.println("Length of the rectangle "+ length +"breadth of the rectangle " + breadth +"and the are is "+(length*breadth));
	}
}
class Areamethod
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int n = sc.nextInt();
		System.out.println("Enter the length and breadth of the rectangle");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Area obj = new Area();
		obj.area(n);
		obj.area(a,b);
	}
}
		
