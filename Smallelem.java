import java.util.Scanner;
class Smallelem
{
	public static void main(String args[])
	{
		
		System.out.println("Size of the array");
		Scanner obj=new Scanner(System.in);
		int n = obj.nextInt();
		int arr[] = new int [n];
		System.out.println("Enter the elements ");
		for(int i=0;i<n;i++)
		{
			arr[i] = obj.nextInt();
		}
		int small=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
				System.out.println("Smallest element is " + small);
			}
		}
	}
}
