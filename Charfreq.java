import java.util.*;
class Charfreq
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter the string ");
		String str=obj.next();
		System.out.println("Character whose frequency is to be found ?");
		char c=obj.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
				count++;
		}
		System.out.println("The frequency of the entered character is : "+count);
	}
}
		
		
