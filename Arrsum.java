import java.util.Scanner;
class Arrsum
{
	public static void main(String args[])
	{
		int sum=0;
		System.out.println("Size of tha array");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int []arr = new int[n];
		System.out.println("Elements of the array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		sum=sum+arr[i];
		}
		System.out.println("Sum of the array is " + sum);
	}
}
