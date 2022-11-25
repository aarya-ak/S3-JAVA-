import java.util.*;
class Nsum
{
	public static void main(String args[]) 
	{
		int sum = 0;
		System.out.println("How much numbers?");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		for(int i = 0;i<=n;i++)
		{
			sum = sum+i;
		}
		System.out.println("Sum of "+n+" natural numbers is "+sum);
	}	
}
