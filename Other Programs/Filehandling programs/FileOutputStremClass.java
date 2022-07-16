import java.io.*;
public class FileOutputStremClass
{
	public static void main(String []args)throws Exception

	{
		FileOutputStream fout=new FileOutputStream("./myfile1.txt");
		int i;
		String s="TATA samir";
		char ch[]=s.toCharArray();
		for(i=0;i<s.length();i++)
		{
			fout.write(ch[i]);
		}
		fout.close();
	}
}