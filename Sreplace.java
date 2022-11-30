import java.util.*;
class Sreplace
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter the string ");
		String str=obj.next();
		System.out.println("Enter the character to be replaced ");
		char r=obj.next().charAt(0);
		System.out.println("Enter the character to be placed ");
		char p=obj.next().charAt(0);
		String str2=new String();
		str2=str.replace(r,p);
		System.out.println("The new string : "+ str2);
	}
}
		
		
