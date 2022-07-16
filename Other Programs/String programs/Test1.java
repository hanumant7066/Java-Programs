import java.util.*;
class Test1
{
	public static void main(String[] args)
	{
		String sentence;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the sentence: ");
		sentence=obj.nextLine();

		String []words=sentence.split(" ");

		int []arr=new int[words.length];

		for(int i=0;i<words.length;i++)
		{
			String temp=words[i];
			arr[i]=temp.length();
		}


		Arrays.sort(arr);

		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		System.out.println("length.....................word");
		
		for(int i=0;i<arr.length;i++)
		{
			if(i==arr.length-1)
			{
					for(int j=0;j<words.length;j++)
				{
					if(arr[i]==words[j].length())
					{
						System.out.println(arr[i]+"......................"+words[j]);
						break;
					}
				}
				break;

			}

			if(arr[i]==arr[i+1])
			{
				continue;
			}

			for(int j=0;j<words.length;j++)
			{
				if(arr[i]==words[j].length())
				{
					System.out.println(arr[i]+"......................"+words[j]);
					
				}
			}
		}
	}
}