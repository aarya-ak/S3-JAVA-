import java.util.*;
class Spalindrome
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter the string ");
		String str=obj.next();
		int l=0,r=str.length()-1,flag=0;
		while(l<r)
		{
			if(str.charAt(l)!=str.charAt(r))
			{
				flag=1;
				break;
			}
			l++;
			r--;
		}
		if(flag==0)
			System.out.println("String is a palindrome");
		else
		
			System.out.println("Not a palindrome");
	}
}
