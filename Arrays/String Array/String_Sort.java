import java.util.Scanner;
import java.util.Arrays;
class String_Sort
{
	static void getSort(String []arr){
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the words to sort in ascending order: ");

		String str=sc.nextLine();
		String arr[]=str.split(" ");
		getSort(arr);

		System.out.println("words are :"+Arrays.toString(arr));


	}
}