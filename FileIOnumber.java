import java.io.*;
class FileIOnumber
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream F = new FileInputStream("Mytext.txt");
		int i=1,ch;
		System.out.print(i +" : ");
		while((ch=F.read())!=-1)
		{
			System.out.print((char)ch);
			if(ch=='\n')
			{
				System.out.print(++i+" : ");
			}
		}
		F.close();
	}
}
