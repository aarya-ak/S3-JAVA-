import java.util.*;
class Factors
{
	public static void main(String args[])
	{
		System.out.println("Enter the numbers");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(" "+i);
			}
		}
	}
}
				
		
