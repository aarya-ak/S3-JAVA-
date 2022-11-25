import java.util.*;
class OddEven
{
	public static void main(String args[] ) 
	{
		System.out.println("Enter the numbers");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		if(num%2==0)
		{
			System.out.println("The number "+num+" is "+" even ");
		}
		else
		{
			System.out.println("The number "+num+" is "+" odd ");
		}
	}
}	
		
		
