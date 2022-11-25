import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		int r,sum=0,temp;
		System.out.println("Enter the number");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("The number is a palindrome");
		else
			System.out.println("The number is not a palindrome");
	}
}
			
		
		
