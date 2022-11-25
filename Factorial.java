import java.util.*;
class Factorial
{
	public static void main (String args[])
	{
		int fact=1;
		System.out.println("Enter the number");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is "+fact);
	}
}
		
		
