import java.util.Scanner;
class Secondlarge
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Size of the array ");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int arr[] = new int [n];
		System.out.println("Enter the elements ");
		for(i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		int large=arr[0];
		for(i=0;i<n;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
				System.out.println("Largest element is " + large);
			}
		}
		
		if(arr[i+1]>large)
		large = arr[i+1];
		
		System.out.println("Second largest element is " + large);
	}
}
