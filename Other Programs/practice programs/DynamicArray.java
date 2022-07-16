import java.util.*;
class DynamicArray
{
	int a[]=new int[1];
	int count=0;
	int size=1;
	public void insertAt(int index,int ele)
	{
		resize();
		for(int i=count;i>index;i--)
		{
			a[i]=a[i-1];
		}
		a[index]=ele;
	}
	public void resize()
	{
		int temp[]=null;
		if(count==size)
		{
			temp=new int[size*2];
			for(int i=0;i<size;i++)
			{
				temp[i]=a[i];				
			}
			a=temp;
			size=size*2;

			
		}
	}
	public void add(int ele)
	{
		resize();
		a[count]=ele;
		count=count+1;
		
	}
	public static void main(String []args)
	{
		DynamicArray obj=new DynamicArray();
			System.out.println(obj.size);
			System.out.println(obj.count);

		obj.add(12);
		obj.add(13);
		obj.add(14);
		obj.add(15);
		obj.add(16);
		obj.add(17);
		obj.add(18);
		obj.add(19);
		obj.add(20);
		obj.add(21);
		obj.insertAt(3,50);

		for(int i=0;i<obj.count;i++)
		{
			System.out.println(obj.a[i]);
		}
			System.out.println(obj.size);
			System.out.println(obj.count);


	}
}