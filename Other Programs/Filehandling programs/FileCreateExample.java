import java.io.*;
public class FileCreateExample
{
	public static void main(String []args) throws Exception
	{
		File f1=new File("./myfile.txt");
		System.out.println("can file exists: "+f1.exists());
		System.out.println("name of file is: "+f1.getName());
		System.out.println("length of file is: "+f1.length());
		System.out.println("can file read: "+f1.canWrite());	
	}
}