import java.util.Scanner;
class Replace 
{
	public static void main(String args[])
	{
		
		System.out.println("Size of the array ");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int arr[] = new int[n];
		
		
		System.out.println("Enter the elements ");
		for(int i=0;i<n;i++)
		{
			arr[i] = obj.nextInt();
			
				
		}
		
		
		
			System.out.println("Position of the element to be replaced ");
			int elem = obj.nextInt();
		
		System.out.println("Element to added ");
		
		
		
		int m = obj.nextInt();
		
		{
		for(int i=0;i<n;i++)
		arr[elem-1]=m;
		}
		System.out.println("Replaced array ");
		for(int i=0;i<n;i++)
		{
		System.out.println(arr[i]);
		}
	}
}
