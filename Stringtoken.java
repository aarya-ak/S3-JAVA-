import java.util.*;
import java.io.*;
public class Stringtoken
{
	public static void main(String args[])throws IOException
	{
		String w;
		int y,sum=0;
		FileInputStream f1 = new FileInputStream("Mytext.txt");
		byte b[]=new byte[250];
		f1.read(b);
		String str = new String(b);
		StringTokenizer st =new StringTokenizer(str, " ");
		while(st.hasMoreTokens())
		{
			w = st.nextToken();
			y=Integer.parseInt(w);
			System.out.println(y);
			sum=sum+y;
		}
		System.out.println(sum);
	}
}
		
		
		
		
		
		
	
