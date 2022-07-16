import java.util.Arrays;
class Separate_zero_at_right
{
	static void otherMethod(int []a)
	{
		int counter=a.length-1;
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]==0)
			{
				int temp=a[counter];
				a[counter]=a[i];
				a[i]=temp;
				counter--;
			}
		}
	}
	static void shiftRight(int []a)
	{
		int counter=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[counter]=a[i];
				counter++;
			}else
				continue;
		}
		while(counter<a.length)
		{
			a[counter]=0;
			counter++;
		}
	}
	public static void main(String[] args) {
		int []a={1,2,0,8,0,0,0,3};
		//shiftRight(a);
		otherMethod(a);
		System.out.println(Arrays.toString(a));
	}
}