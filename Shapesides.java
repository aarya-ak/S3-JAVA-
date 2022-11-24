abstract class Shape
{
	abstract void numberOfSides();
	
}
class Rectangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("Number of sides in rectangle is 4");
	}
}
class Triangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("Number of sides in triangle is 3");
	}
}
class Hexagon extends Shape
{
	void numberOfSides()
	{
		System.out.println("Number of sides in hexagon is 6");
	}
}
class Shapesides
{
	public static void main(String[] args) 
	{
		Rectangle obj1 = new Rectangle();
		obj1.numberOfSides();
		Triangle obj2 = new Triangle();
		obj2.numberOfSides();
		Hexagon obj3 = new Hexagon();
		obj3.numberOfSides();
	}
}			
