import java.io.*;
class Odd extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd  : "+i);
			}
		}
	}
}
class Even extends Thread
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even : "+i);
			}
		}
	}
}
class OddEvenMulti
{
	public static void main(String args[])throws InterruptedException
	{
		Odd obj=new Odd();
		obj.start();
		obj.join();
		new Even().start();
	}	
}		
