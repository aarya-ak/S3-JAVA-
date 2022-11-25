import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		int a=0,b=1,sum;
		System.out.println("Length of the series");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		System.out.println("Fibonacci series :");
		for(int i=0;i<n;i++)
		{
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
		}
	}
}
			
		
		
