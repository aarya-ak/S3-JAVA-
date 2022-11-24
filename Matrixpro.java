import java.util.Scanner;
class Matrixpro
{
	public static void main (String args[])
	{
		System.out.println("Size of the 1st array");
		Scanner obj = new Scanner(System.in);
		int r1 = obj.nextInt();
		int c1 = obj.nextInt();
		System.out.println("Size of the 2nd array");
		int r2 = obj.nextInt();
		int c2 = obj.nextInt();
		int a[][] = new int[r1][c1];
		int b[][] = new int[r2][c2];
		int c[][] = new int[r1][c2];
		if(r2!=c1)
		System.out.println("Rows and columns are not equal");
		else
		{
		System.out.println(" Elements for the 1st matrix");
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				
				 a[i][j] = obj.nextInt();
			}
		}
		System.out.println(" Elements for the 2nd matrix");
		
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				 b[i][j] = obj.nextInt();
			}
		}
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				for(int k=0;k<r2;k++)
				c[i][j]+=a[i][k]*b[k][j];
			}
			
		}
		System.out.println("Product of the matrix ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
			System.out.print(c[i][j]+" ");
			}
			System.out.println(" ");
			
		}
		
		}
}
}
