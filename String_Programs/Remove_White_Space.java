import java.util.Scanner;
public class Remove_White_Space
{
	public static void removeWhiteSpace(String str){
		String output="";
		for(int i=0;i<str.length(); i++){
			if(str.charAt(i)!=' '){
				output+=str.charAt(i);
			}
		}
		System.out.println("Output String is "+output);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("Input String is "+input);
		removeWhiteSpace(input);
	}
}