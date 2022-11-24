import java.util.Scanner;
class Matrixtrans
{
	public static void main (String args[])
	{
		System.out.println("Size of the matrix");
		Scanner obj = new Scanner(System.in);
		int r = obj.nextInt();
		int c = obj.nextInt();
		
		int a[][] = new int[r][c];
		int b[][] = new int[c][r];
		
		
		{
		System.out.println(" Elements for the 1st matrix");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				 a[i][j] = obj.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		System.out.println("transpose of the matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(b[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}
}
}
			
	

		
