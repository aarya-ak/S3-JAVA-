import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		int key = 0;
		System.out.println("Enter the number");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		for(int i = 2;i<n/2;i++)
		{
			if(n%i==0)
				key++;
		}
		if(key==0)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not a prime");
		}
	}
}
			
			
		
