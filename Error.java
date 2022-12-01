class Error
{
	public static void main(String args[]) 
	{
		int a=10,b=5,c=5;
		try
		{
			int x=a/(b-c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		int arr[]={1,2,3,4};
		try
		{
			System.out.println(arr[6]);
		}	
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Out Of Bound Exception");
		}
	}
}
