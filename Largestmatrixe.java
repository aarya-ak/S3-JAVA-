import java.util.Scanner;
class Largestmatrixe
{
	public static void main (String args[])
	{
		System.out.println("Size of the array");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int a[][] = new int[n][n];
		System.out.println(" Elements in the matrix");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				 a[i][j] = obj.nextInt();
			}
		}
		System.out.print("Matrix :");
		System.out.println(" ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j] + " ");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		int large = a[0][0];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]>large)
				{
					large=a[i][j];
					
				}
			}
		}
		System.out.println("Largest element ofthe matrix ix "+ large);
	}
}
			
	

