import java.util.*;
class Poscharacter
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter the string ");
		String str=obj.next();
		System.out.println("Enter the element to be searched ");
		char ch=obj.next().charAt(0);
		int l=0,r=str.length(),flag=0;
		while(l<r)
		{
			if(str.charAt(l)==ch)
			{
				flag=1;
				break;
			}
			l++;
		}
		if(flag==0)
			System.out.println("Element to present");
		else
		
			System.out.println("Element present at " +(l+1));
	}
}
		
