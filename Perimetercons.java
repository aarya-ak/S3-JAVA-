import java.util.*;
class Perimeter
{
	int r, l, b;
	Perimeter(int x)
	{
		r = x;
		System.out.println("Perimeter of the circle is "+(2*3.13*r));
	}
	Perimeter (int x, int y)
	{
		l = x;
		b = y;
		System.out.println("Perimeter of the Rectangle is "+(l*b));
	}
}class Perimetercons
{
	public static void main(String args[])
	{
		System.out.println("Radius of the circle");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println("Length and breadth opf the rectangle");
		int l = sc.nextInt();
		int b = sc.nextInt();
		Perimeter obj1 = new Perimeter(r);
		Perimeter obj2 = new Perimeter(l,b);
	}
}

